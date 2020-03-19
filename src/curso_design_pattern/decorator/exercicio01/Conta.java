/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern.decorator.exercicio01;

/**
 *
 * @author João
 */
class Conta {

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
