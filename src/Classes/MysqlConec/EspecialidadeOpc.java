/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.MysqlConec;

import Classes.Especialidade;
import Classes.Medico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author diógenes
 */
public class EspecialidadeOpc extends Especialidade{
     public void cadastrar(Especialidade esp) throws Exception{
        Conetor c =new Conetor();
        c.conecta();
        String sql="INSERT INTO especialidade(especialdd,valor)VALUES(?,?)";
        try(PreparedStatement smt=c.conecta().prepareStatement(sql)){
            smt.setString(1,esp.getEspecialidade() );
            smt.setDouble(2, esp.getValor());
            
            
           
            smt.executeUpdate();
            
            smt.close();    
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro de cadastro");
        }          
    }
     
      public List<Especialidade> listarEsp(){
          List<Especialidade> espe = new ArrayList<>();
        
          Conetor c =new Conetor();
         try {
             c.conecta();
             String sql="Select especialdd from especialidade ";
             PreparedStatement ps=c.conecta().prepareStatement(sql);
             ResultSet resultado=ps.executeQuery();
             while (resultado.next()){
                 Especialidade e=new Especialidade();
                 e.setEspecialidade(resultado.getString("especialdd"));
                 espe.add(e);
             }
         } catch (Exception ex) {
             Logger.getLogger(EspecialidadeOpc.class.getName()).log(Level.SEVERE, null, ex);
         }
          
          return espe;  
       
       }
      
      public Double valorEspecialidade(String nome){
          
          Conetor c =new Conetor();
         try {
             c.conecta();
             String sql="Select valor  from especialidade ";
             PreparedStatement ps=c.conecta().prepareStatement(sql);
             ps.setString(1,nome);
             ResultSet resultado=ps.executeQuery();
             
             if(resultado.next()){
             this.setValor((int) resultado.getDouble("valor"));
                     
             }
         } catch (Exception ex) {
             Logger.getLogger(EspecialidadeOpc.class.getName()).log(Level.SEVERE, null, ex);
         }
          
          return this.getValor();
               
}
}

