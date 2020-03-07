package curso_design_pattern;

public class icms implements Imposto{

	@Override
	public double calcularImporto(Orcamento orcamento) {
		return (orcamento.getValor() * 0.5) + 50;
	}

}
