package esporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CiclistaTeste {
	
	@Test
	void testarCiclista() {
		
		Ciclista ciclista = new Ciclista("Tiago", 44, 85,false);
		
		assertFalse(ciclista.getAposentado());
		
		
		
		System.out.println("Está aposentedo?");
		if (ciclista.getAposentado()) {
			
			System.out.println("Sim!");
			assertTrue(ciclista.getAposentado());
		}else {
			System.out.println("Não");
		}
		
		
		
		ciclista.pedalar();
		ciclista.morrer();
		ciclista.aposentar();
		
		System.out.println("Agora já está aposentado?");
		System.out.println(ciclista.getAposentado() ? "Sim" : "Não");

		
	}

}
