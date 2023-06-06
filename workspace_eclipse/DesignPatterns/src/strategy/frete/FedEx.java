package strategy.frete;

public class FedEx implements Fretavel{

	@Override
	public double calcularValor(double pesoEmkg) {
		if(pesoEmkg < 20.00) {
			return 0.00;
		}else if(pesoEmkg < 40.00) {
			return 45.00;
		}else {
			return 75.00;
		}
	}
}
