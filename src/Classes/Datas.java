/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author diógenes
 */
public class Datas {
    private int dia; 
    private int mes; 
    private int ano; 
    private int diaA; 
    private int mesA; 
    private int anoA; 
    private int idade= 0;
    private int idadeM= 0;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    public String MostrarData(){
    
    return " "+ dia +"/"+ mes + "/"+ano;
    }
    public Datas PegarData(String dataEmString){
        String data[]=dataEmString.split("/");
        this.dia=Integer.valueOf(data[0]);
        this.mes=Integer.valueOf(data[1]);
         this.ano=Integer.valueOf(data[2]);
    return this;
    }
    
     public String Idade(int diaA,int mesA, int anoA){
     this.anoA = anoA;
     this.mesA = mesA;
     this.diaA = diaA;
  if (ano < anoA){
     if (mes < mesA){
         if (dia <= diaA){
        idade = anoA - ano; 
        } else {
         idade = anoA - ano-1;
         }
     } else {
     idade = anoA - ano-1;
     } 
  
  } else {
      if (anoA == ano){
          if (mes < mesA){
         if (dia <= diaA){
        idadeM = mesA - mes; 
        } else {
         idadeM = mesA - mes;
         }
      
      }
   
  } else {
          
          return ("Data Invalida");
      }}
      
  if ( idade == 0){
  return "" + idadeM + " mes(s)"; 
  } else {
  return "" + idade + " ano(s)"; 
  }
  }
}
