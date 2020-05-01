/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern_flyweight;

/**
 *
 * @author João
 */
public class Programa {

    public static void main(String[] args) {
        NotasMusicais notas = new NotasMusicais();
        
        System.out.println(notas.pega("do"));
        System.out.println(notas.pega("do"));
        System.out.println(notas.pega("do"));
        System.out.println(notas.pega("do"));
        
        //Vai retornar sempre o mesmo objeto
    }
    
}
