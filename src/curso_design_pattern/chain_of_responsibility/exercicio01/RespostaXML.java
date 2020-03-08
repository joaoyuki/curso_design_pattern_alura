package curso_design_pattern.chain_of_responsibility.exercicio01;

public class RespostaXML implements Resposta{

	private Resposta resposta;

	@Override
	public void response(Requisicao requisicao, Conta conta) {

		if (requisicao.getFormato() == Formato.XML) {
			System.out.println("Imprime XML");
		} else {
			resposta.response(requisicao, conta);
		}
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
