/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern;

/**
 *
 * @author João
 */
public class ImpostoMuitoAlto extends Imposto{
    
    public ImpostoMuitoAlto() {
        
    }
    
    public ImpostoMuitoAlto(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcularImporto(Orcamento orcamento) {
        
        return orcamento.getValor() * 0.20;
        
    }
    
}
