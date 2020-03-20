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
public class ContaBancaria {
    
    protected AcoesContaBancaria acoesContaBancaria;
    protected double saldo;

    public ContaBancaria() {
        this.acoesContaBancaria = new SaldoPositivo();
    }
    
    public void efetuarSaque(double valorSaque) {
        this.acoesContaBancaria.efetuarSaque(this, valorSaque);
    }
    
    public void efetuarDeposito(double valorDeposito) {
        this.acoesContaBancaria.efetuarDeposito(this, valorDeposito);
    }
    
}
