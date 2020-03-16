package curso_design_pattern;

public class CalculadorImposto {

	public static void realizaCalculo(Orcamento orcamento, Imposto qualquerImposto) {
		double calculo = qualquerImposto.calcularImporto(orcamento);
		System.out.println(calculo);
	}
	
	public static void main(String[] args) {
		Imposto icms = new icms();
		Imposto iss = new iss(new icms(new iccc()));
		Imposto iccc = new iccc(new ImpostoMuitoAlto());
		
		realizaCalculo(new Orcamento(10), icms);
		realizaCalculo(new Orcamento(10), iss);
		//realizaCalculo(new Orcamento(2000), iccc);
		
	}
	
}
