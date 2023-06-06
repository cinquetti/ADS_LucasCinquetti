package ExercicioUML;

public class Piramide extends Object{
	
	private Double base;
	private Double altura;
	
	public Piramide(Double base, Double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	
	public Double exibirVolume() {
	  return (base*altura)/3;
	}
	
	

}
