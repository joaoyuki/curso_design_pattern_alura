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
public class SaldoPositivo implements AcoesContaBancaria{

    @Override
    public void efetuarSaque(ContaBancaria contaBancaria, double valorSaque) {
        
        contaBancaria.saldo -= valorSaque;
        
        if (contaBancaria.saldo< 0) contaBancaria.acoesContaBancaria = new SaldoNegativo();
        
    }

    @Override
    public void efetuarDeposito(ContaBancaria contaBancaria, double valorDeposito) {
        contaBancaria.saldo += valorDeposito * 0.98;
    }
    
}
