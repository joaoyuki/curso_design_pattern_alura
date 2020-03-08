# curso_design_pattern_alura

## Strategy

O padrão Strategy é muito útil quando temos um conjunto de algoritmos similares, e precisamos alternar entre eles em diferentes pedaços da aplicação. No exemplo do vídeo, temos diferentes maneiras de calcular o imposto, e precisamos alternar entre elas.

O Strategy nos oferece uma maneira flexível para escrever diversos algoritmos diferentes, e de passar esses algoritmos para classes clientes que precisam deles. Esses clientes desconhecem qual é o algoritmo "real" que está sendo executado, e apenas mandam o algoritmo rodar. Isso faz com que o código da classe cliente fique bastante desacoplado das implementações concretas de algoritmos, possibilitando assim com que esse cliente consiga trabalhar com N diferentes algoritmos sem precisar alterar o seu código.

### Exemplo de código com strategy

```java
package curso_design_pattern;

public interface Imposto {

	public double calcularImporto(Orcamento orcamento);
	
}


package curso_design_pattern;

public class icms implements Imposto{

	@Override
	public double calcularImporto(Orcamento orcamento) {
		return (orcamento.getValor() * 0.5) + 50;
	}

}


package curso_design_pattern;

public class iccc implements Imposto{

	@Override
	public double calcularImporto(Orcamento orcamento) {
		
		if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.5;
		}
		
		if (orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.7;
		}
		
		if (orcamento.getValor() > 3000) {
			return orcamento.getValor() * 0.8;
		}
		
		return 0;
	}

}


package curso_design_pattern;

public class Orcamento {

	private double valor;

	public Orcamento(double valor) {
		this.valor = valor;
		
	}
	
	public double getValor() {
		return valor;
	}
	
}


package curso_design_pattern;

public class CalculadorImposto {

	public static void realizaCalculo(Orcamento orcamento, Imposto qualquerImposto) {
		double calculo = qualquerImposto.calcularImporto(orcamento);
		System.out.println(calculo);
	}
	
	public static void main(String[] args) {
		Imposto icms = new icms();
		Imposto iss = new iss();
		Imposto iccc = new iccc();
		
		realizaCalculo(new Orcamento(10), icms);
		realizaCalculo(new Orcamento(10), iss);
		realizaCalculo(new Orcamento(2000), iccc);
		
	}
	
}

```

## Chain of Responsibility