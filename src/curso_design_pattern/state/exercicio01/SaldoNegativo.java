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
public class SaldoNegativo implements AcoesContaBancaria{

    @Override
    public void efetuarSaque(ContaBancaria contaBancaria, double valorSaque) {
        
        throw new RuntimeException("Sua conta está no vermelho");
        
    }

    @Override
    public void efetuarDeposito(ContaBancaria contaBancaria, double valorDeposito) {
        
        contaBancaria.saldo += valorDeposito * 0.95;
        
        if (contaBancaria.saldo> 0) contaBancaria.acoesContaBancaria = new SaldoPositivo();
        
    }

    
}
