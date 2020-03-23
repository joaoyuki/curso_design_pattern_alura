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
public class NotaFiscal {
    
    private String razaoSocial;
    private String cnpj;
    private double valorBruto;
    private LocalDate dataEmissao;
    private String observacoes;
    private List<ItemDaNota> itens;

    public NotaFiscal(String razaoSocial, String cnpj, double valorBruto, LocalDate dataEmissao, String observacoes, List<ItemDaNota> itens) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.valorBruto = valorBruto;
        this.dataEmissao = dataEmissao;
        this.observacoes = observacoes;
        this.itens = itens;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public List<ItemDaNota> getItens() {
        return itens;
    }

    public void setItens(List<ItemDaNota> itens) {
        this.itens = itens;
    }
    
}
