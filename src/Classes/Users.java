/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author diógenes
 */
public class Users extends Funcionario {
   private String bidoc;
   
   private int password;

    public String getBidoc() {
        return bidoc;
    }

    public void setBidoc(String bidoc) {
        this.bidoc = bidoc;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
