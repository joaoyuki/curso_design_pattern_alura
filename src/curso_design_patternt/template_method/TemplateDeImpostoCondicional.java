package curso_design_patternt.template_method;


public abstract class TemplateDeImpostoCondicional implements Imposto{

	@Override
	public double calcularImporto(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return mininaTaxacao(orcamento);
		}
	}
	
	public boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		return true;
    }	
	
	protected abstract double mininaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	
}
