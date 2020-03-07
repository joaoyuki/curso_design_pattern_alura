package curso_design_pattern;

public class iccc implements Imposto{

	@Override
	public double calcularImporto(Orcamento orcamento) {
		
		if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.5;
		}
		
		if (orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.7;
		}
		
		if (orcamento.getValor() > 3000) {
			return orcamento.getValor() * 0.8;
		}
		
		return 0;
	}

}
