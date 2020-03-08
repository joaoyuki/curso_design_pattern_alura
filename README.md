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

O padrão Chain of Responsibility cai como uma luva quando temos uma lista de comandos a serem executados de acordo com algum cenário em específico, e sabemos também qual o próximo cenário que deve ser validado, caso o anterior não satisfaça a condição.

Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar esses comportamentos novamente.

> Com o **chain of responsibility** nós não sabemos qual algorítimos precisamos executar para resolver o problema, então deixamos que uma classe define qual usar.
> Diferente do **strategy** no qual já sabemos qual algorítimos devemos usar. Mas os dois seguem o mesmo padrão de separar responsabilidades em classes e unilas por interface

```java

package curso_design_pattern.chain_of_responsibility.exercicio01;

public class Conta {

	private String titular;
	private double saldo;
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}

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


package curso_design_pattern.chain_of_responsibility.exercicio01;

public enum Formato {

	XML, CSV, PORCENTO;
	
}

package curso_design_pattern.chain_of_responsibility.exercicio01;

public class RespostaCSV implements Resposta{

	private Resposta resposta;

	@Override
	public void response(Requisicao requisicao, Conta conta) {

		if (requisicao.getFormato() == Formato.CSV) {
			System.out.println("Imprime CSV");
		} else {
			resposta.response(requisicao, conta);
		}
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}

package curso_design_pattern.chain_of_responsibility.exercicio01;


public interface Resposta {

	void response(Requisicao requisicao, Conta conta);
	void setProxima(Resposta resposta);
	
}

package curso_design_pattern.chain_of_responsibility.exercicio01;

public class RespostaCSV implements Resposta{

	private Resposta resposta;

	@Override
	public void response(Requisicao requisicao, Conta conta) {

		if (requisicao.getFormato() == Formato.CSV) {
			System.out.println("Imprime CSV");
		} else {
			resposta.response(requisicao, conta);
		}
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}

package curso_design_pattern.chain_of_responsibility.exercicio01;

public class RespostaXML implements Resposta{

	private Resposta resposta;

	@Override
	public void response(Requisicao requisicao, Conta conta) {

		if (requisicao.getFormato() == Formato.XML) {
			System.out.println("Imprime XML");
		} else {
			resposta.response(requisicao, conta);
		}
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}


package curso_design_pattern.chain_of_responsibility.exercicio01;

public class CriarRequisicao {

	void criarCadeiaDeRequisicao(Requisicao requisicao, Conta conta) {
		
		Resposta r1 = new RespostaXML();
		Resposta r2 = new RespostaCSV();
		Resposta r3 = new NenhumFormato();
		
		r1.setProxima(r2);
		r2.setProxima(r3);
		
		r1.response(requisicao, conta);
		
	}
			
	
}


package curso_design_pattern.chain_of_responsibility.exercicio01;

public class Testando {

	public static void main(String[] args) {
		
		CriarRequisicao r1 = new CriarRequisicao();
		r1.criarCadeiaDeRequisicao(new Requisicao(Formato.CSV), new Conta("João", 100.00));
		
		
	}
	
}


```