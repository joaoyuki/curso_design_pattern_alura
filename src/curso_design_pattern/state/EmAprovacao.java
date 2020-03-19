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
public class EmAprovacao implements EstadoDeUmOrcamento{

    boolean descontoJaFeito = false;
    
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if (descontoJaFeito == false) {
            orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.05);
            this.descontoJaFeito = true;
        }
        
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Aprovado();
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Reprovado();
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos em aprovação não podem ir para finalizados");
    }
    
}
