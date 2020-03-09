package curso_design_patternt.template_method;

public class ICPP extends TemplateDeImpostoCondicional{

	@Override
	protected double mininaTaxacao(curso_design_patternt.template_method.Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double maximaTaxacao(curso_design_patternt.template_method.Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(curso_design_patternt.template_method.Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

}
