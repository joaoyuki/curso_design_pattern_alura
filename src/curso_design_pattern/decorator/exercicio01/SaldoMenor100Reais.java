/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern.decorator.exercicio01;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author João
 */
public class SaldoMenor100Reais extends Filtro{

    public SaldoMenor100Reais() {
    }
    
    public SaldoMenor100Reais(Filtro outroFiltro) {
        super(outroFiltro);
    }    

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        
        final List<Conta> collect = contas.stream().filter(conta -> conta.getSaldo() < 100).collect(Collectors.toList());
        collect.addAll(adicionarFiltro(contas));
        return collect;
        
    }
    
}
