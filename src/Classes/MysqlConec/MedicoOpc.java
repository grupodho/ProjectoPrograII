/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.MysqlConec;

import Classes.Especialidade;
import Classes.Funcionario;
import Classes.Medico;
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
public class MedicoOpc extends Medico {
 public void cadastrar(Medico m) throws Exception{
        Conetor c =new Conetor();
        c.conecta();
        String sql="INSERT INTO medico(numDocIdent,numOrdem, especialdd)VALUES(?,?,?)";
        try(PreparedStatement smt=c.conecta().prepareStatement(sql)){
            smt.setString(1, m.getNumDocIdent());
            smt.setInt(2, m.getN_ordem());
            smt.setString(3, m.especialidade.getEspecialidade());
            
           
            smt.executeUpdate();
            
            smt.close();    
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro de cadastro"+ ex.getMessage());
        }                                
    }
    
    public void actualizar(Medico m) throws Exception{
        Conetor c=new Conetor();
        c.conecta();
        String sql = "UPDATE medico SET nome=?,numDocIdent=?,sexo=?,"
                + "DataNascimento=?,endereco=?,contacto=?"
                + ",cargo=?,salario=?,Especialidade=?,Número_na_Ordem =?"
                + "whrew=? "; 
         try(PreparedStatement smt=c.prepareStatement(sql)){
           
             smt.setString(1, m.getNome());
            smt.setString(2, m.getNumDocIdent());
            smt.setString(3, m.getGenero());
            smt.setString(4, m.dataNascimento.MostrarData());
            smt.setString(5, m.getEndereco());
            smt.setString(6, m.getContacto());
            smt.setString(7, m.getCargo());
            smt.setInt(8, (int) m.getSalario());
            smt.setString(9, m.especialidade.getEspecialidade());
            smt.setInt(10, m.getN_ordem());
           
            smt.executeUpdate();
            
            smt.close();   
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar!"+ex);
        }
        
        
        
    }
     public void Excluir(Medico m) throws Exception{
        Conetor c=new Conetor();
        c.conecta();
        String sql = "DELETE FROM funcionario where numOrdem = ? ";
        int opc = JOptionPane.showConfirmDialog(null, "Quer mesmo excluir?",
                "Excluir", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_NO_OPTION) {
        try (PreparedStatement smt=c.prepareStatement(sql)){
             smt.setString(1, m.getNome());
            smt.executeUpdate(); 
            smt.close();  
        JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Errro ao excluir!");
        }
        
        }
        
    }
     
     
      public List<String> listarEsp(){
          List<String> medico = new ArrayList<>();
        
          Conetor c =new Conetor();
         try {
             c.conecta();
             String sql="Select nome from medico natural join funcionario";
             PreparedStatement ps=c.conecta().prepareStatement(sql);
             ResultSet resultado=ps.executeQuery();
             while (resultado.next()){
                 String nome;
                 nome=(resultado.getString("nome"));
                 medico.add(nome);
             }
         } catch (Exception ex) {
             Logger.getLogger(EspecialidadeOpc.class.getName()).log(Level.SEVERE, null, ex);
         }
          
          return medico;
         
       }
      
      
      public int idMedico(String nome){
          
          Conetor c =new Conetor();
         try {
             c.conecta();
             String sql="Select numOrdem  from medico natural join funcionario where  nome=?";
             PreparedStatement ps=c.conecta().prepareStatement(sql);
             ps.setString(1,nome);
             ResultSet resultado=ps.executeQuery();
             
             if(resultado.next()){
             this.setN_ordem(
                     resultado.getInt("numOrdem"));
             }
         } catch (Exception ex) {
             Logger.getLogger(EspecialidadeOpc.class.getName()).log(Level.SEVERE, null, ex);
         }
          
          return this.getN_ordem();
         
       }
       
       
}
