package Open_Closed;

public class ContratoCLT implements Remuneravel{
	
	private double salario;

	public ContratoCLT(double salario) {
		super();
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public double getRemuneracao() {
		return this.getSalario();
	}
	
	
}
		