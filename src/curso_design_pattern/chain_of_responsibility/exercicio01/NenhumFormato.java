package curso_design_pattern.chain_of_responsibility.exercicio01;

public class NenhumFormato implements Resposta{

	@Override
	public void response(Requisicao requisicao, Conta conta) {
		System.out.println("Ainda tem possuimos tratamento para o formato: " + requisicao.getFormato().toString());
	}

	@Override
	public void setProxima(Resposta resposta) {
		// Não tem
	}

}
