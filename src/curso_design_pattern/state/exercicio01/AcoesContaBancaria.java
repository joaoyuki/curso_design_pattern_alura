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
public interface AcoesContaBancaria {
    
    public void efetuarSaque(ContaBancaria contaBancaria, double valorSaque);
    public void efetuarDeposito(ContaBancaria contaBancaria, double valorDeposito);
    
}
