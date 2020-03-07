package curso_design_pattern.investimento;

import java.util.Random;

public class Arrojado implements Investimento{

	@Override
	public double adicionaResultadoInvestimento(Conta saldo) {
		
		int chute = new Random().nextInt(10);
		
		if (chute>= 0 && chute <= 1) {
			return saldo.getValor() * 0.5;
		} else if (chute>= 2 && chute <= 4) {
			return saldo.getValor() * 0.3;
		} else {
			return saldo.getValor() * 0.006;
		}
		
	}

}
