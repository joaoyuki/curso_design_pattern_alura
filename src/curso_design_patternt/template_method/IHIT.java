package curso_design_patternt.template_method;

import java.util.ArrayList;
import java.util.List;

import curso_design_pattern.chain_of_responsibility.Item;

public class IHIT extends TemplateDeImpostoCondicional{

	@Override
	protected double mininaTaxacao(curso_design_patternt.template_method.Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	protected double maximaTaxacao(curso_design_patternt.template_method.Orcamento orcamento) {
		 return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(curso_design_patternt.template_method.Orcamento orcamento) {
		 List<String> noOrcamento = new ArrayList<String>();

	        for(Item item : orcamento.getItens()) {
	          if(noOrcamento.contains(item.getNome())) return true;
	          else noOrcamento.add(item.getNome());
	        }

	        return false;
	}

}
