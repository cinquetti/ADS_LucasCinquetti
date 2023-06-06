package builder;

public class CarroBuilder {
	
	private Carro carro;
	
	public CarroBuilder() {
		this.carro = new Carro();
	}
	
	public void BuildPorta(Porta[] portas) {
		carro.setPorta(portas);
	}
	
    public void BuildMotor(Motor motor) {
		carro.setMotor(motor);
	}
    
    public void BuildComputadorBordo(ComputadorBordo computadorBordo) {
		carro.setComputadorBordo(computadorBordo);
	}
    
    public void BuildFreioABS(FreioABS freioABS) {
		carro.setFreioABS(freioABS);
	}
    
    private void validarPortas() {
    	if((carro.getPorta() == null) || ((carro.getPorta().length != 2) && (carro.getPorta().length != 4))) {
    		throw new IllegalStateException("Numero de portas não é válido");
    	}
    }
    
    private void validarMotor() {
    	if(carro.getMotor() == null) {
    		throw new IllegalStateException("Não tem motor!");
    	}
    }
    
    public Carro getCarro() {
    	validarPortas();
    	validarMotor();
    	
    	return this.carro;
    }

}
