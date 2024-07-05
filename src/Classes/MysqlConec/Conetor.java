/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.MysqlConec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author diógenes
 */
public class Conetor {
       private String url = "jdbc:mysql://localhost:3306/clinicagirassoll";
    private String usuario = "root";
    private String senha = "Heryvande2003";
    public Connection conector = null; 
    
    public  Connection conecta () throws Exception{
    try {
        if (conector != null) return this.conector;
    this.conector = DriverManager.getConnection(url, usuario, senha);
    
    }catch ( Exception e){
    throw new Exception ("Não foi possivel conectar " + e);
    }
    
     return conector;
    } 

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   /*create table consulta (
numDocIdent varchar(14) not null, 
Número_na_Ordem smallint not null,
dataC varchar(10) not
hora varchar(6) 
estado varchar(20) 
quantia double(7,2) 
especialidade varchar(30));*/

}
