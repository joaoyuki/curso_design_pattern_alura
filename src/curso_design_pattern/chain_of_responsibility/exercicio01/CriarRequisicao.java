package curso_design_pattern.chain_of_responsibility.exercicio01;

public class CriarRequisicao {

	void criarCadeiaDeRequisicao(Requisicao requisicao, Conta conta) {
		
		Resposta r1 = new RespostaXML();
		Resposta r2 = new RespostaCSV();
		Resposta r3 = new NenhumFormato();
		
		r1.setProxima(r2);
		r2.setProxima(r3);
		
		r1.response(requisicao, conta);
		
	}
			
	
}
