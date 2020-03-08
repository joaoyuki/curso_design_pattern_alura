package curso_design_pattern.chain_of_responsibility.exercicio01;

public class RespostaCSV implements Resposta{

	private Resposta resposta;

	@Override
	public void response(Requisicao requisicao, Conta conta) {

		if (requisicao.getFormato() == Formato.CSV) {
			System.out.println("Imprime CSV");
		} else {
			resposta.response(requisicao, conta);
		}
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
