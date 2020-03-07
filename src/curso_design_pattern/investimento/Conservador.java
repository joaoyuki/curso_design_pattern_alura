package curso_design_pattern.investimento;

public class Conservador implements Investimento{

	@Override
	public double adicionaResultadoInvestimento(Conta saldo) {
		return saldo.getValor() * 0.8;
	}

}
