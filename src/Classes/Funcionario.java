/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author diógenes
 */
public class Funcionario {
     private String nome;
    private String numDocIdent;
    public Datas dataNascimento;
    private String endereco;
    private String contacto;
    private String contactoAlt;
    private String genero;
    private String cargo;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        try {
        this.salario = salario;
        } catch ( Exception ex){
            JOptionPane.showMessageDialog(null, "Verifique O salário!");
        
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumDocIdent() {
        return numDocIdent;
    }

    public void setNumDocIdent(String numDocIdent) {
        this.numDocIdent = numDocIdent;
    }

    public Datas getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Datas dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContacto() {
        return ""+contacto+ "/"+ contactoAlt;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    

    public void setContactoAlt(String contactoAlt) {
        this.contactoAlt = contactoAlt;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
