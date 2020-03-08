package curso_design_pattern.chain_of_responsibility;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// Não tem mais desconto
	}

}
