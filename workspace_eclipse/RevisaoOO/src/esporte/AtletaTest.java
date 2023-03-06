package esporte;

import org.junit.jupiter.api.Test;

public class AtletaTest {

	@Test
    void testarConstrutor() {
		
		Pessoa pessoa1 = new Pessoa("Edson", 22);
		Pessoa pessoa2 = new Pessoa("Ricardo", 22);
		
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println("Testado");
		
		Atleta atletaEdson = new Atleta("Edson", 40, 70, true);
		System.out.println(atletaEdson.getNome());
		System.out.println(atletaEdson.getIdade());
		System.out.println(atletaEdson.getPeso());
		System.out.println(atletaEdson.getAposentado());
	}
	
	
}
