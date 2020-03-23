/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern.builder.exercicio01;

import java.time.LocalDate;

/**
 *
 * @author João
 */
public class Testando {
    
    public static void main(String[] args) {
        
        CriadorNotaFiscal criador = new CriadorNotaFiscal();
        criador.comCNPJ("CNPJ").comDataEmissao(LocalDate.now()).comObservacoes("Observacoes");
        NotaFiscal criado = criador.constroi();
        System.out.printf("%s %n", criado.getCnpj());
        
    }
    
}
