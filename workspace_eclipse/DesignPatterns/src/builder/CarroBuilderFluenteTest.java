package builder;

import org.junit.jupiter.api.Test;

public class CarroBuilderFluenteTest {

	@Test
	public void metodoTeste() {
		
		//invocando CarroBuilderFluente
		Carro carroPronto = new CarroBuilderFluente().buildPorta(null)
				.BuildMotor(null)
				.BuildComputadorBordo(null)
				.BuildFreioABS(null)
				.getCarro();
	}
}
