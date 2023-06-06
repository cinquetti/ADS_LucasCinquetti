package strategy.frete;

import org.junit.jupiter.api.Test;

public class TesteUnitario {
	
	double pesoDoPacote = 5.0; 
	
	@Test
	public void deveCalcularFreteParaDHL() {
		ServicoFreteDHL objeto = new ServicoFreteDHL();
		pesoDoPacote = pesoDoPacote + 15.00;
		objeto.calcularValor(pesoDoPacote);
		
	}
	
	@Test
	public void deveCalcularFreteParaJadLog() {
		ServicoFreteJadLog objeto = new ServicoFreteJadLog();
		pesoDoPacote = pesoDoPacote + 15.00;
		objeto.calcularValor(pesoDoPacote);
	}
	
	@Test
	public void deveCalcularFreteParaSedex() {
		ServicoFreteSedex objeto = new ServicoFreteSedex();
		pesoDoPacote = pesoDoPacote + 15.00;
		objeto.calcularValor(pesoDoPacote);
	}
	
	@Test
	public void deveLancarExceptionParaServicoDesconhecido() {
		
		Fretavel objeto = new FedEx();
		objeto.calcularValor(-40.00);
		throw new RuntimeException("Serviço Desconhecido! " + objeto);
	}
	
	
}
