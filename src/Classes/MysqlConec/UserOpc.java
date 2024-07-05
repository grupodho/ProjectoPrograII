/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.MysqlConec;

import Classes.Especialidade;
import Classes.Users;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author diógenes
 */
public class UserOpc extends Users{
    public void cadastrar(Users us) throws Exception{
        Conetor c =new Conetor();
        c.conecta();
        String sql="INSERT INTO users (numDocIdent,passw)VALUES(?,?)";
        try(PreparedStatement smt=c.conecta().prepareStatement(sql)){
            smt.setString(1,us.getBidoc());
            smt.setInt(2, us.getPassword());
                                  
            smt.executeUpdate();
            smt.close();    
            
        }catch(Exception ex){
            
        }          
    }
    
    
     public String cargo(int user){
          
          Conetor c =new Conetor();
         try {
             c.conecta();
             String sql="Select cargo  "
                     + "from users natural join funcionario "
                     + "where  usuario=?";
             PreparedStatement ps=c.conecta().prepareStatement(sql);
             ps.setInt(1,user);
             ResultSet resultado=ps.executeQuery();
             
             if(resultado.next()){
             this.setCargo(resultado.getString("cargo"));
                     
             }
         } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Verifique A Palavra"
                     + "passe");
         } return this.getCargo();
         
     }  
          
    public int palavraPass (int user) {
          Conetor c =new Conetor();
         try {
             c.conecta();
             String sql="Select passw  "
                      + "from users natural join funcionario "
                      + "where  usuario=?";
             PreparedStatement ps=c.conecta().prepareStatement(sql);
             ps.setInt(1,user);
             ResultSet resultado=ps.executeQuery();
             
             if(resultado.next()){
             this.setPassword(resultado.getInt("passw"));
                     
             }
            return this.getPassword();
         } catch (Exception ex) {
JOptionPane.showMessageDialog(null,"Verifique A Palavra");   }
          return this.getPassword();
          } 

       
} 
       

    

