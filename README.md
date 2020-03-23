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

## Template Method

Quando temos diferentes algoritmos que possuem estruturas parecidas, o Template Method é uma boa solução. Com ele, conseguimos definir, em um nível mais macro, a estrutura do algoritmo e deixar "buracos", que serão implementados de maneira diferente por cada uma das implementações específicas.

Dessa forma, reutilizamos ao invés de repetirmos código, e facilitamos possíveis evoluções, tanto do algoritmo em sua estrutura macro, quanto dos detalhes do algoritmo, já que cada classe tem sua responsabilidade bem separada.

## State

A principal situação que faz emergir o Design Pattern State é a necessidade de implementação de uma máquina de estados. Geralmente, o controle das possíveis transições são vários e complexos, fazendo com que a implementação não seja simples. O State auxilia a manter o controle dos estados simples e organizados através da criação de classes que representem cada estado e saiba controlar as transições.

## Builder

- Exemplo de builder:

```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern.builder.exercicio01;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author João
 */
public class NotaFiscal {
    
    private String razaoSocial;
    private String cnpj;
    private double valorBruto;
    private LocalDate dataEmissao;
    private String observacoes;
    private List<ItemDaNota> itens;

    public NotaFiscal(String razaoSocial, String cnpj, double valorBruto, LocalDate dataEmissao, String observacoes, List<ItemDaNota> itens) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.valorBruto = valorBruto;
        this.dataEmissao = dataEmissao;
        this.observacoes = observacoes;
        this.itens = itens;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public List<ItemDaNota> getItens() {
        return itens;
    }

    public void setItens(List<ItemDaNota> itens) {
        this.itens = itens;
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern.builder.exercicio01;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author João
 */
public class CriadorNotaFiscal {
    
    private String razaoSocial;
    private String cnpj;
    private double valorBruto;
    private LocalDate dataEmissao;
    private String observacoes;
    private List<ItemDaNota> itens;
    
    public NotaFiscal constroi() {
        return new NotaFiscal(razaoSocial, cnpj, valorBruto, dataEmissao, observacoes, itens);
    }
    
    public CriadorNotaFiscal comRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }
    
    public CriadorNotaFiscal comCNPJ(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
    
    public CriadorNotaFiscal comValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
        return this;
    }
    
    public CriadorNotaFiscal comDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }
    
    public CriadorNotaFiscal comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }
    
    public CriadorNotaFiscal comItens(List<ItemDaNota> itens) {
        this.itens = itens;
        return this;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_design_pattern.builder.exercicio01;

import java.time.LocalDate;

/**
 *
 * @author João
 */
public class Testando {
    
    public static void main(String[] args) {
        
        CriadorNotaFiscal criador = new CriadorNotaFiscal();
        criador.comCNPJ("CNPJ").comDataEmissao(LocalDate.now()).comObservacoes("Observacoes");
        NotaFiscal criado = criador.constroi();
        System.out.printf("%s %n", criado.getCnpj());
        
    }
    
}


```

Sempre que tivermos um objeto complexo de ser criado, que possui diversos atributos, ou que possui uma lógica de criação complicada, podemos esconder tudo isso em um Builder.

Além de centralizar o código de criação e facilitar a manutenção, ainda facilitamos a vida das classes que precisam criar essa classe complexa, afinal a interface do Builder tende a ser mais clara e fácil de ser usada.
