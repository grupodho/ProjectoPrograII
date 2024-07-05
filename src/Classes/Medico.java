/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author diógenes
 */
public class Medico extends Funcionario  {

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    private int n_ordem; 
    public Especialidade especialidade;
    

    public int getN_ordem() {
        return n_ordem;
    }

    public void setN_ordem(int n_ordem) {
        this.n_ordem = n_ordem;
    }

    
}
