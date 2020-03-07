package curso_design_pattern;

public class iss implements Imposto{

	@Override
	public double calcularImporto(Orcamento orcamento) {
		return orcamento.getValor() * 0.6;
	}

}
