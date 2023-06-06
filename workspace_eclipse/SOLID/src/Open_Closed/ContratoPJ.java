package Open_Closed;

public class ContratoPJ implements Remuneravel{
	private Double valorMensal;
	
	public ContratoPJ(Double valorMensal) {
		super();
		this.valorMensal = valorMensal;
	}

	@Override
	public double getRemuneracao() {
		return this.getValorMensal();
	}

	public Double getValorMensal() {
		return valorMensal;
	}
	
	

}
