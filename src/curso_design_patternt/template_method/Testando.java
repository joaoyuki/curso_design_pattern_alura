package curso_design_patternt.template_method;

public class Testando {

	public static void main(String[] args) {
		
		Imposto icpp = new ICPP();
		
		Orcamento o1 = new Orcamento(10.000);
		
		double calcularImporto = icpp.calcularImporto(o1);
		
		System.out.println(calcularImporto);
		
	}
	
}
