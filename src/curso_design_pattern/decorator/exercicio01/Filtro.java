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
public abstract class Filtro {
    
    Filtro outroFiltro;
    
    public Filtro() {
        this.outroFiltro = null;
    }

    public Filtro(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }
    
    public abstract List<Conta> filtra(List<Conta> contas);
    
    public List<Conta> adicionarFiltro(List<Conta> contas) {
        if (outroFiltro == null) return contas;
        
        return outroFiltro.filtra(contas);
    }
    
}
