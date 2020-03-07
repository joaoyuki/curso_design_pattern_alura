package curso_design_pattern.investimento;

public class RealizadorDeInvestimentos {
	
	public static void realiza(Conta conta, Investimento investimento) {
		double resultado = investimento.adicionaResultadoInvestimento(conta);
		
		conta.deposita(resultado * 0.75);
		System.out.println(conta.getValor());
	}
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta(100);
		
		Investimento conservador = new Conservador();
		
		realiza(c1, conservador);
		
	}
	

}
