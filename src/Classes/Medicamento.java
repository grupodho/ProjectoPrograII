/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author diógenes
 */
public class Medicamento {

    public void setDataFabrico(Datas dataFabrico) {
        this.dataFabrico = dataFabrico;
    }

    public void setDataValidd(Datas dataValidd) {
        this.dataValidd = dataValidd;
    }
  private String remedio;
  private double valor,quantidade;
  public Datas dataFabrico;
  public Datas dataValidd;

    public String getRemedio() {
        return remedio;
    }

    public void setRemedio(String remedio) {
        this.remedio = remedio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
        
   
  
  
}
