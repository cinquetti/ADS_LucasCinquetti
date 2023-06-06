package builder;

public class Carro {
	
	private Porta porta[];
	
	private Motor motor;
	
	private ComputadorBordo computadorBordo;
	
	private FreioABS freioABS;
	
	
	//Getters e Setters

	public Porta[] getPorta() {
		return porta;
	}

	public void setPorta(Porta[] porta) {
		this.porta = porta;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public ComputadorBordo getComputadorBordo() {
		return computadorBordo;
	}

	public void setComputadorBordo(ComputadorBordo computadorBordo) {
		this.computadorBordo = computadorBordo;
	}

	public FreioABS getFreioABS() {
		return freioABS;
	}

	public void setFreioABS(FreioABS freioABS) {
		this.freioABS = freioABS;
	}
	
	

}
