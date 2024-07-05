/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.MysqlConec;

import Classes.Medicamento;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author diógenes
 */
public class MedicamentoOpc {
    
    public void cadastrar(Medicamento m) throws Exception{
        Conetor c =new Conetor();
        c.conecta();
        String sql="INSERT INTO medicamento(remedio,valor,quantidade,dataFabrico,dataValidade)VALUES(?,?,?,?,?)";
        try(PreparedStatement smt=c.conecta().prepareStatement(sql)){
            smt.setString(1, m.getRemedio());
            smt.setDouble(2, m.getValor());
            smt.setDouble(3, m.getQuantidade());
            smt.setString(4, m.dataFabrico.MostrarData());
            smt.setString(5, m.dataValidd.MostrarData());
            
           
            smt.executeUpdate();
            
            smt.close();    
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro de cadastro "+ex.getMessage());
        }
                              
    }
    
    
    
}
