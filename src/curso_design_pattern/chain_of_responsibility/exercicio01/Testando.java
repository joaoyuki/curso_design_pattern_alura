package curso_design_pattern.chain_of_responsibility.exercicio01;

public class Testando {

	public static void main(String[] args) {
		
		CriarRequisicao r1 = new CriarRequisicao();
		r1.criarCadeiaDeRequisicao(new Requisicao(Formato.CSV), new Conta("João", 100.00));
		
		
	}
	
}
