package curso_design_patternt.template_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import curso_design_pattern.chain_of_responsibility.Item;

public class Orcamento {

    private double valor;
    private List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<Item>();
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

}
