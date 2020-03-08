package curso_design_pattern.chain_of_responsibility.exercicio01;

public class Requisicao {
	
	private Formato formato;
	
	public Requisicao(Formato formato) {
		this.formato = formato;
	}
	
	public Formato getFormato() {
		return formato;
	}
	
}
