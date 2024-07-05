/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package girassol2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Classes.MysqlConec.Conetor;
import Telas.Login;

 
public class Girassol2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        Login entrar = new Login();
        entrar.dispose();
        entrar.setVisible(true);
        
        
        /*
        Connection con ;
         
        Conetor dbc = new Conetor (); 
        
        try{
        con = dbc.conecta();
        
        String query = "INSERT INTO pacientes(nome,endereco,numAdm) values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, "Daline");
        ps.setString(2, "SmabaCanuxiba");
        ps.setString(3, "1234");
        ps.execute();
        } catch ( Exception e){
        System.out.print("Erro:" + e.getMessage());
        }*/
    }
    
}
