/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.MysqlConec;
import Classes.Datas;
import Classes.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author diógenes
 */
public class pacienteOpc extends Paciente {
    
    public void cadastrar(Paciente p) throws Exception {
        Conetor c = new Conetor();
        c.conecta();
        String sql="INSERT INTO paciente(nome,numDocIdent,DataNascimento,Sexo,endereco,contacto)VALUES(?,?,?,?,?,?)";
        try(PreparedStatement smt= c.conecta().prepareStatement(sql)){
            smt.setString(1, p.getNome());
            smt.setString(2, p.getNumDocIdent());
            smt.setString(3, p.dataNascimento.MostrarData());
            smt.setString(4, p.getGenero());
            smt.setString(5, p.getEndereco());
            smt.setString(6, p.getContacto());
           
            smt.execute();
            
            smt.close();    
            JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro de cadastro"+ex.getMessage());
        }
               
             
       
    }
    
    public void actualizar(Paciente p) throws Exception{
        Conetor c=new Conetor();
        c.conecta();
        String sql = "UPDATE paciente SET nome= ?, numDocIdent= ? ,"
                + "DataNascimento = ?,"
                + "Sexo=?,endereco=?,contacto=?"
                + "whrew=? "; 
         try(PreparedStatement smt=c.conecta().prepareStatement(sql)){
           smt.setString(1, p.getNome());
            smt.setString(2, p.getNumDocIdent());
            smt.setString(3, p.dataNascimento.MostrarData());
            smt.setString(4, p.getGenero());
            smt.setString(5, p.getEndereco());
            smt.setString(6, p.getContacto());
            smt.executeUpdate();
            
            smt.close();    
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar!"+ex);
        }
               
        
        
    }
     public void Excluir(String bi) throws Exception{
        Conetor c=new Conetor();
        c.conecta();
        String sql = "DELETE FROM paciente where numDocIdent= ?";
        int opc = JOptionPane.showConfirmDialog(null, "Quer mesmo excluir?",
                "Excluir", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_NO_OPTION) {
        try (PreparedStatement smt=c.conecta().prepareStatement(sql)){
             smt.setString(1, bi);
            smt.executeUpdate(); 
            smt.close(); 
            
        JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Errro ao excluir! "+ex.getMessage());
        }
        
        }     } 
     
     
      
     public List<String> listarPaciente(){
          List<String> paciente = new ArrayList<>();
        
          Conetor c =new Conetor();
         try {
             c.conecta();
             String sql="Select nome from paciente ";
             PreparedStatement ps=c.conecta().prepareStatement(sql);
             ResultSet resultado=ps.executeQuery();
             while (resultado.next()){
                 String nome;
                 nome=(resultado.getString("nome"));
                 paciente.add(nome);
             }
         } catch (Exception ex) {
             Logger.getLogger(EspecialidadeOpc.class.getName()).log(Level.SEVERE, null, ex);
         }
          
          return paciente; 
          }
   
     public String idPaciente(String nome){
          
          Conetor c =new Conetor();
         try {
             c.conecta();
             String sql="Select NumDocIdent  from paciente where nome = ?";
             PreparedStatement ps=c.conecta().prepareStatement(sql);
             ps.setString(1,nome);
             ResultSet resultado=ps.executeQuery();
             
             if(resultado.next()){
             this.setNumDocIdent(resultado.getString("NumDocIdent"));
                     
             }
         } catch (Exception ex) {
             Logger.getLogger(EspecialidadeOpc.class.getName()).log(Level.SEVERE, null, ex);
         }
          
          return this.getNumDocIdent();
         
       }

     public List<Paciente> listadoPaciente() throws Exception{
          Conetor c =new Conetor();
        Connection conecta = c.conecta();
      
          List<Paciente> paciente = new ArrayList<>();
             String sql="Select* from paciente ";
             try {
             PreparedStatement ps=c.conecta().prepareStatement(sql);
             ResultSet resultado=ps.executeQuery();
             while (resultado.next()){
                 Paciente p=new Paciente();
                 Datas data=new Datas();
                p.setNome(resultado.getString("nome"));
                 p. setNumDocIdent(resultado.getString("numDocIdent"));
                 //p.setDataNascimento(resultado.getString("DataNascimento"));
                 p.setGenero(resultado.getString("Sexo"));
                 p.setDataNascimento(data.PegarData(resultado.getString("DataNascimento").trim()));
                 p.setContacto(resultado.getString("contacto"));
                 p.setEndereco(resultado.getString("endereco"));
                 System.out.println(p.getNumDocIdent());
                 paciente.add(p);
                 
                
                 
             }
         } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Erro de registro: "+ ex.getMessage());
         }
          
          return paciente; 
          }

}
