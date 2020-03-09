package curso_design_patternt.template_method;

public class IKCV extends TemplateDeImpostoCondicional{

	@Override
	protected double mininaTaxacao(curso_design_patternt.template_method.Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(curso_design_patternt.template_method.Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(curso_design_patternt.template_method.Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

}
