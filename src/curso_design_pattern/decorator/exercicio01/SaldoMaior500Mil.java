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
public class SaldoMaior500Mil extends Filtro{

    public SaldoMaior500Mil() {
    }
    
    public SaldoMaior500Mil(Filtro novoFiltro){
        super(novoFiltro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> collect = contas.stream().filter(conta -> conta.getSaldo() > 500.000).collect(Collectors.toList());
        collect.addAll(adicionarFiltro(contas));
        return collect;
    }
    
}
