package strategy.frete;

public class ServicoFreteJadLog implements Fretavel {

	@Override
	public double calcularValor(double pesoEmkg) {
		if(pesoEmkg < 30.00) {
			return 0.00;
		}else {
			return 150.00;
		}
	}
}
