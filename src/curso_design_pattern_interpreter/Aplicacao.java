/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern_interpreter;

/**
 *
 * @author João
 */
public class Aplicacao {
    
    public static void main (String[] args) {
        
        Expressao soma = new Soma(new Numero(2), new Numero(2));
        
        
        System.out.println(soma.avalia());
        
        Soma soma1 = new Soma(new Numero(2), new Numero(2));
        Soma soma2 = new Soma(new Numero(2), new Numero(2));
        Multiplicacao resultadoMultiplicacao = new Multiplicacao(soma1, soma2);
        
        System.out.println(resultadoMultiplicacao.avalia());
        
        Expressao raiz = new RaizQuadrada(new Numero(4));
        
        System.out.println(raiz.avalia());
    }
    
}
