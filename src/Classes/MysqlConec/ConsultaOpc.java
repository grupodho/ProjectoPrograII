/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.MysqlConec;

import Classes.Consulta;
import Classes.Datas;
import Telas.TelaAtendente;
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
public class ConsultaOpc {
    public void AgendarConsulta(Consulta cm) throws Exception{
        Conetor c =new Conetor();
        c.conecta();
        
        
        String sql="INSERT INTO consulta(numDocIdent,numOrdem,dataC "
                + ",hora ,estado ,especialdd)" +
                   "VALUES(?,?,?,?,?,?);";
        try(PreparedStatement smt=c.conecta().prepareStatement(sql)){
            smt.setString(1, cm.getnumdocIdent());
            smt.setInt(  2, cm.getMedico());
            smt.setString(3, cm.data.MostrarData());           
            smt.setString(4, cm.getHora());
            smt.setString(5, cm.getEstado());
            smt.setString(6, cm.getEspecialidd());
            
            smt.executeUpdate();
            smt.close();    
            JOptionPane.showMessageDialog(null,"Consulta Agendada com Sucesso");
             TelaAtendente telaA = new TelaAtendente (); 
             telaA.dispose();
             telaA.setVisible(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Ocorreu algum erro! "+ ex.getMessage());
             TelaAtendente telaA = new TelaAtendente (); 
             telaA.dispose();
             telaA.setVisible(true);}
    }
        public void actualizarEstado(Consulta p) throws Exception{
        Conetor c=new Conetor();
        c.conecta();
        String sql = "UPDATE consulta SET  dataC= ? ,hora = ?,estado=?"
                + "whrew=? "; 
         try(PreparedStatement smt=c.conecta().prepareStatement(sql)){
           smt.setString(1, p.data.MostrarData());
            smt.setString(2, p.getHora());
            smt.setString(3, p.getEstado());
            
            
            smt.executeUpdate();
            
            smt.close();    
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar!"+ex);
        }
    }
        
        public List<Consulta> listadoconsulta() throws Exception{
          Conetor c =new Conetor();
        Connection conecta = c.conecta();
      
          List<Consulta> consulta = new ArrayList<>();
             String sql="Select* from consulta ";
             try {
             PreparedStatement ps=c.conecta().prepareStatement(sql);
             ResultSet resultado=ps.executeQuery();
             while (resultado.next()){
                 Consulta p=new Consulta();
                 Datas data=new Datas();
                 
                 p.getMedico(resultado.getInt("medico"));
                 p.getPaciente(resultado.getString("paciente"));             
                 p.especialidd(resultado.getString("especialidd"));
                 
                 consulta.add(p);
                 
                
                 
             }
         } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Erro de registro: "+ ex.getMessage());
         }
          
          return consulta; 
          }
 
        
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
