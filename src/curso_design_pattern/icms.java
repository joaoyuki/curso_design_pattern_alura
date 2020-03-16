package curso_design_pattern;

public class icms extends Imposto{

        public icms() {
            
        }
    
        public icms(Imposto outroImposto) {
            super(outroImposto);
        }
    
	@Override
	public double calcularImporto(Orcamento orcamento) {
		return (orcamento.getValor() * 0.5) + 50;
	}

}
