package curso_design_pattern;

public abstract class Imposto {

        protected final Imposto outroImposto;
        
        public Imposto() {
            this.outroImposto = null;
        }
        
        public Imposto (Imposto outroImposto) {
            this.outroImposto = outroImposto;
        }
    
	public abstract double calcularImporto(Orcamento orcamento);
        
        protected double calcularOutroImposto(Orcamento orcamento) {
            if (outroImposto == null) {
                return 0;
            }
            
            return outroImposto.calcularImporto(orcamento);
        }
	
}
