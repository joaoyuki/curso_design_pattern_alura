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
public class Orcamento {
    
    private double valor;
    protected EstadoDeUmOrcamento estadoAtual;

    public Orcamento(double valor) {
        this.valor = valor;
        this.estadoAtual = new EmAprovacao();
    }
    
    public void aplicaDescontoExtra(){
        estadoAtual.aplicaDescontoExtra(this);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void aprova() {
        estadoAtual.aprova(this);
    }
    
    public void reprova() {
        estadoAtual.reprova(this);
    }
    
    public void finaliza() {
        estadoAtual.finaliza(this);
    }
    
    
}
