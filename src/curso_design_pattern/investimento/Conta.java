package curso_design_pattern.investimento;

public class Conta {

	private double saldo;

	public Conta(double valor) {
		this.saldo = valor;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getValor() {
		return saldo;
	}
	
}
