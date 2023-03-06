package esporte;

import org.junit.jupiter.api.Test;

public class testarNadador {
	
	@Test
	void testarNadador() {
		
		Nadador nadador = new Nadador ("Gustavo", 35, 90, false);
		nadador.nadar();
		
		nadador.morrer();
		System.out.println(nadador.getIdade());
		
		nadador.aposentar();
		System.out.println(nadador.getAposentado());
		
		
	}

}
