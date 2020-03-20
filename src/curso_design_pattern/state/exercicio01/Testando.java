/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern.state.exercicio01;

/**
 *
 * @author João
 */
public class Testando {
    
    public static void main(String[] args) {
        
        ContaBancaria c1 = new ContaBancaria();
        
        c1.efetuarDeposito(500.0);
        
        System.out.println(c1.saldo);
        
        c1.efetuarSaque(500.0);
        
        System.out.println(c1.saldo);
        
        c1.efetuarSaque(500.0); //Vai lançar uma 
        
        
    }
    
}
