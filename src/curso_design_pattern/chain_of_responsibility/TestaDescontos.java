package curso_design_pattern.chain_of_responsibility;

public class TestaDescontos {

	public static void main(String[] args) {
		
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(500);
		orcamento.adicionaItem(new Item("caneta", 250.00));
		orcamento.adicionaItem(new Item("lapis", 250.00));
		
		double desconto = calculador.calcula(orcamento);
		
		System.out.println(desconto);
		
	}
	
}
