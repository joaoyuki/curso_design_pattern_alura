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
public class Aprovado implements EstadoDeUmOrcamento{

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.02);
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está aprovado.");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento aprovado não pode mais ser reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
    
}
