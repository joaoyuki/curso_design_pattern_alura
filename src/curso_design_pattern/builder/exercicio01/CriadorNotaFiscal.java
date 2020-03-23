/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern.builder.exercicio01;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author João
 */
public class CriadorNotaFiscal {
    
    private String razaoSocial;
    private String cnpj;
    private double valorBruto;
    private LocalDate dataEmissao;
    private String observacoes;
    private List<ItemDaNota> itens;
    
    public NotaFiscal constroi() {
        return new NotaFiscal(razaoSocial, cnpj, valorBruto, dataEmissao, observacoes, itens);
    }
    
    public CriadorNotaFiscal comRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }
    
    public CriadorNotaFiscal comCNPJ(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
    
    public CriadorNotaFiscal comValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
        return this;
    }
    
    public CriadorNotaFiscal comDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }
    
    public CriadorNotaFiscal comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }
    
    public CriadorNotaFiscal comItens(List<ItemDaNota> itens) {
        this.itens = itens;
        return this;
    }
    
}
