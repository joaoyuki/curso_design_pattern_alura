package curso_design_pattern.investimento;

import java.util.Random;

public class Moderado implements Investimento{

	@Override
	public double adicionaResultadoInvestimento(Conta saldo) {
		
		if (new Random().nextInt(2) == 0) {
			return saldo.getValor() * 0.025;
		} else {
			return saldo.getValor() * 0.007;
		}
		
	}

}
