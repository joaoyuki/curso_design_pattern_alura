package curso_design_pattern.chain_of_responsibility;


public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
	
}
