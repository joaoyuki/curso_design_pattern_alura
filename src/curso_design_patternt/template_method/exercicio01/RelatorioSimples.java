package curso_design_patternt.template_method.exercicio01;

import java.util.List;

public class RelatorioSimples extends ImprimirRelatorioCondicional{

	@Override
	protected void corpo(List<Banco> bancos) {
		bancos.stream().forEach(banco -> System.out.println("Banco: " + banco.getNome() + " - Telefone: " + banco.getTelefone()));
		
	}

	@Override
	protected void rodape() {
		System.out.println("Banco simples");
		
	}

	@Override
	protected void cabecalho() {
		System.out.println("Banco simples");
	}


}
