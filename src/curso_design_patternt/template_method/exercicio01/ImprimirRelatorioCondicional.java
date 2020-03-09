package curso_design_patternt.template_method.exercicio01;

import java.util.List;

public abstract class ImprimirRelatorioCondicional {

	public void imprimirRelatorio(List<Banco> bancos) {
		cabecalho();
		corpo(bancos);
		rodape();
		
	}

	protected abstract void corpo(List<Banco> bancos);

	protected abstract void rodape();

	protected abstract void cabecalho();


}
