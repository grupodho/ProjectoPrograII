/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author diógenes
 */
public class Consulta{
    
    public Datas data;
    public String especialidd;
    public String paciente;
    public int medico;
    private String  estado;
    private String hora ;
    private String min;
    private String numdocIdent;

    public Datas getData() {
        return data;
    }

    public void setData(Datas data) {
        this.data = data;
    }
    public String getnumdocIdent() {
        return numdocIdent;
    }

    public void setnumdocIdent(String numdocIdent) {
        this.numdocIdent = numdocIdent;
    }


    public String getEspecialidd() {
        return especialidd;
    }

    public void setEspecialidd(String especialidd) {
        this.especialidd = especialidd;
    }

    public String getPaciente(String string) {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    

    

  

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHora() {
        return ""+hora+":"+min;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    public void setmedico(int medico) {
        this.medico = medico;
    }

    public int getMedico() {
        return medico;
    }

    

    public void setMin(String min) {
        this.min = min;
    }

    public void especialidd(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void medico(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void data(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getMedico(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
    
    
    
}
