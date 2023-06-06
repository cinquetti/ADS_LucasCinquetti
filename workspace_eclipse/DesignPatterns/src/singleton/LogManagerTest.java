package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LogManagerTest {

	@Test
	void dada2instancias_quandoGetInstance_entaoSerAMesmaReferencia() {
		LogManager instance1 = LogManager.getInstance();
		assertNotNull(instance1);
		
		LogManager instance2 = LogManager.getInstance();
		assertNotNull(instance2);
		
		assertEquals(instance1, instance2);
	    
	}

}
