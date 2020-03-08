package curso_design_pattern.chain_of_responsibility;

public class DescontoPorVendaCasada implements Desconto{

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		
		boolean temCaneta = verificaItemNaLista(orcamento, "caneta");
		boolean temLapis = verificaItemNaLista(orcamento, "lapis");
		
		if (temCaneta && temLapis) {
			return orcamento.getValor() * 0.05;
		} else {
			return 0;
		}
		
	}

	private boolean verificaItemNaLista(Orcamento orcamento, String itemNaLista) {
		return orcamento.getItens().stream()
			.anyMatch(item -> item.getNome().equals(itemNaLista));
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
