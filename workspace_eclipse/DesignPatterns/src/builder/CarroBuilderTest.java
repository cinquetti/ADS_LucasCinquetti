package builder;

import static org.junit.jupiter.api.Assertions.*;

public class CarroBuilderTest {
	
	public static void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido(){
		  //partes Validas
				Motor motorVTEC = new Motor();
				Porta portaMotorista = new Porta();
				Porta portaPassageiro = new Porta();
				Porta[] portas = {portaMotorista, portaPassageiro};
				ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
				FreioABS freioBosch = new FreioABS();
				
			  //Invocando Carro Builder
				
				CarroBuilder builder = new CarroBuilder();
				builder.BuildMotor(motorVTEC);
				builder.BuildPorta(portas);
				builder.BuildComputadorBordo(computadorBordoSiemens);
				builder.BuildFreioABS(freioBosch);
				Carro carroPronto = builder.getCarro();
				
			  //Validando Carro
				assertNotNull(carroPronto);
				assertNotNull(carroPronto.getMotor());
				assertNotNull(carroPronto.getPorta());
				assertTrue(carroPronto.getPorta().length == 2);
				assertNotNull(carroPronto.getComputadorBordo());
				assertNotNull(carroPronto.getFreioABS());
		
	}

	public static void main(String[] args) {
		dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido();

	}

}
