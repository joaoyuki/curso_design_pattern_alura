package curso_design_pattern;

public class iss extends Imposto{

        public iss() {
            
        }
    
        public iss(Imposto outroImposto) {
            super(outroImposto);
        }
    
	@Override
	public double calcularImporto(Orcamento orcamento) {
		return orcamento.getValor() * 0.6 + calcularOutroImposto(orcamento);
	}


}
