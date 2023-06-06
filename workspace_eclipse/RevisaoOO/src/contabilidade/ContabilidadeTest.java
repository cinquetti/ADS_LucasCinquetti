package contabilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContabilidadeTest {
	
	@Test
	void testEmpresaMEI() {
		
		EmpresaMEI empresa = new EmpresaMEI(100.0);
		Double valorIREsperado = 27.5;
		assertEquals(valorIREsperado, empresa.getValorIR());
		
		Double valorISSEsperado = 0.0;
		assertEquals(valorISSEsperado, empresa.getValorISS());
		
		
	}
	
	@Test
	void testEmpresaSimples() {
		
		EmpresaSimples empresa1 = new EmpresaSimples(100.0);
		
		Double valorIREsperado = 15.0;
		assertEquals(valorIREsperado, empresa1.getValorIR());
		
		Double valorISSEsperado = 8.0;
		assertEquals(valorISSEsperado, empresa1.getValorISS());
		
		
	}


}
