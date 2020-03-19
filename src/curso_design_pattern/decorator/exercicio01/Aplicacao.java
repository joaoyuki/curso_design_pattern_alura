/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern.decorator.exercicio01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João
 */
public class Aplicacao {

    public static void main(String[] args) {
        
        List<Conta> contas = new ArrayList<Conta>();
        contas.add(new Conta(10));
        contas.add(new Conta(100));
        contas.add(new Conta(50));
        contas.add(new Conta(500.001));
        contas.add(new Conta(500.000));
        contas.add(new Conta(9851));
        
        Filtro teste = new SaldoMenor100Reais(new SaldoMaior500Mil());
        
        final List<Conta> filtra = teste.filtra(contas);
        filtra.forEach(c -> System.out.println(c.getSaldo()));
        
        
    }
    
}
