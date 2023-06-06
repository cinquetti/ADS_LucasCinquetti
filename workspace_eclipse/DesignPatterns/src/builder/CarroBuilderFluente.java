package builder;

public class CarroBuilderFluente {

	private Carro carro;
	
	public CarroBuilderFluente() {
		this.carro = new Carro();
	}
	
	public CarroBuilderFluente buildPorta(Porta[] portas) {
		carro.setPorta(portas);
		return this;
		
	}
	
    public CarroBuilderFluente BuildMotor(Motor motor) {
		carro.setMotor(motor);
		return this;
	}
    
    public CarroBuilderFluente BuildComputadorBordo(ComputadorBordo computadorBordo) {
		carro.setComputadorBordo(computadorBordo);
		return this;
	}
    
    public CarroBuilderFluente BuildFreioABS(FreioABS freioABS) {
		carro.setFreioABS(freioABS);
		return this;
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
