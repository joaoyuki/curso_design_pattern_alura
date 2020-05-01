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
public class Multiplicacao implements Expressao{

    private Expressao esqueda;
    private Expressao direita;

    public Multiplicacao(Expressao esqueda, Expressao direita) {
        this.esqueda = esqueda;
        this.direita = direita;
        
    }
    
    @Override
    public int avalia() {
        int resultadoEsqueda = esqueda.avalia();
        int resultadoDireita = direita.avalia();
        return resultadoEsqueda * resultadoDireita;
    }
    
}
