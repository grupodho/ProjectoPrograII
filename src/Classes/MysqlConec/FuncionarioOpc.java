/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.MysqlConec;

import Classes.Datas;
import Classes.Funcionario;
import Classes.Medico;
import Classes.Paciente;
import Classes.classFuncionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author diógenes
 */
public class FuncionarioOpc{
 
    
    public void cadastrar(classFuncionario f) throws Exception{
        
        Conetor c =new Conetor();
        c.conecta();
        String sql="INSERT INTO Funcionario(nome,numDocIdent,sexo,DataNascimento,endereco,contacto"
                + ",cargo,salario)VALUES(?,?,?,?,?,?,?,?)";
        try(PreparedStatement smt= c.conecta().prepareStatement(sql)){
            smt.setString(1, f.getNome() );
            smt.setString(2, f.getNumDocIdent());
            smt.setString(3, f.getGenero());
            smt.setString(4, f.dataNascimento.MostrarData());
            smt.setString(5, f.getEndereco());
            smt.setString(6, f.getContacto());
            smt.setString(7, f.getCargo());
            smt.setInt(8, (int) f.getSalario());
           
            smt.executeUpdate();
            
            smt.close();    
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro de cadastro"+ex.getMessage());
        }
               
        
               
       
    }
    
    public void actualizar(Medico m) throws Exception{
        Conetor c=new Conetor();
        c.conecta();
        String sql = "U"; 
        
        
        
    }
     public void Excluir(Medico m) throws Exception{
        Conetor c=new Conetor();
        c.conecta();
        String sql = "DELETE FROM funcionario whwre id_medico= ? ";
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
     
     public List<Funcionario> listadofuncionario() throws Exception{
          Conetor c =new Conetor();
        Connection conecta = c.conecta();
      
          List<Funcionario> funcionario = new ArrayList<>();
             String sql="Select* from funcionario ";
            
             PreparedStatement ps=c.conecta().prepareStatement(sql);
             ResultSet resultado=ps.executeQuery();
             while (resultado.next()){
                 Funcionario p=new Funcionario();
                 Datas data=new Datas();
                 p.setNome(resultado.getString("nome"));
              
                 p. setNumDocIdent(resultado.getString("numDocIdent"));
                 p. setCargo(resultado.getString("cargo"));
                 p. setSalario((int) resultado.getDouble("salario"));
                 p.setGenero(resultado.getString("Sexo"));
                 p.setDataNascimento(data.PegarData(resultado.getString("DataNascimento").trim()));
                 p.setContacto(resultado.getString("contacto"));
                 p.setEndereco(resultado.getString("endereco"));
                 funcionario.add(p);
                 
                
                 
             }
    
         
          
          return funcionario; 
          }
     
     
}
