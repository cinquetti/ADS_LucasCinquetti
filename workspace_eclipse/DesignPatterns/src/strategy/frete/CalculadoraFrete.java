package strategy.frete;

public class CalculadoraFrete {

	
	public double calcularValor(Fretavel fretavel, Double pesoEmkg) {
		double valor = fretavel.calcularValor(pesoEmkg);
		return valor;	
	}
}
