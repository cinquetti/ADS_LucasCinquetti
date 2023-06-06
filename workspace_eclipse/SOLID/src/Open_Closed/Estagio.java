package Open_Closed;

public class Estagio implements Remuneravel{
	
	private double bolsaAuxilio;

	public Estagio(double bolsaAuxilio) {
		super();
		this.bolsaAuxilio = bolsaAuxilio;
	}

	public double getBolsaAuxilio() {
		return bolsaAuxilio;
	}

	@Override
	public double getRemuneracao() {
		return this.getBolsaAuxilio();
	}
	

}
