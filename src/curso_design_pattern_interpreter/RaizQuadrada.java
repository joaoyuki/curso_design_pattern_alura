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
public class RaizQuadrada implements Expressao{

    private Expressao numeroASerCalculado;

    public RaizQuadrada(Expressao numeroASerCalculado) {
        this.numeroASerCalculado = numeroASerCalculado;
        
    }
    
    @Override
    public int avalia() {
        final Integer avalia = numeroASerCalculado.avalia();
        final Double raizQuadradaResultado = Math.sqrt(avalia.doubleValue());
        return raizQuadradaResultado.intValue();
    }
    
}
