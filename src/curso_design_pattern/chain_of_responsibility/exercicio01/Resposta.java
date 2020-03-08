package curso_design_pattern.chain_of_responsibility.exercicio01;


public interface Resposta {

	void response(Requisicao requisicao, Conta conta);
	void setProxima(Resposta resposta);
	
}
