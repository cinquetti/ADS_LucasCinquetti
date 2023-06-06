package strategy.frete;

public class ServicoFreteSedex implements Fretavel{

	@Override
	public double calcularValor(double pesoEmkg) {
		if(pesoEmkg < 10.0) {
			return 50.00;
		}else if(pesoEmkg < 20.00) {
			return 70.00;
		}else {
			return 90.00;
		}
	}

	
}
