/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author João
 */
public class NotasMusicais {
    
    private static Map<String, Nota> notas = new HashMap<String, Nota>();
    
    // O construtor estático de uma classe é sempre a primeira coisa a ser chamada quando a classe é criada
    static {
        notas.put("do", new Do());
        notas.put("re", new Re());
    }
    
    public Nota pega(String nome) {
        return notas.get(nome);
    }
    
}
