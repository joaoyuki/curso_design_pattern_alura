package curso_design_patternt.template_method.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Testando {

	public static void main(String[] args) {
		
		List<Banco> bancos = new ArrayList<Banco>();
		bancos.add(new Banco("Nome 01", "Telefone 01", "Endereco 01", "E-mail 01"));
		bancos.add(new Banco("Nome 02", "Telefone 02", "Endereco 02", "E-mail 02"));
		
		RelatorioSimples r1 = new RelatorioSimples();
		
		r1.imprimirRelatorio(bancos);
		
		
	}
	
}
