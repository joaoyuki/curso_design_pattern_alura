/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern.state;

/**
 *
 * @author João
 */
public class Testando {

    public static void main(String[] args) {
        
        Orcamento reforma = new Orcamento(500.0);
        
        reforma.aplicaDescontoExtra();
        
        System.out.println(reforma.getValor());
        
        reforma.aprova();
        
        reforma.aplicaDescontoExtra();
        
        System.out.println(reforma.getValor());
        
        reforma.finaliza();
        
        //reforma.aplicaDescontoExtra(); //Vai lançar uma exceção
        
    }
    
}
