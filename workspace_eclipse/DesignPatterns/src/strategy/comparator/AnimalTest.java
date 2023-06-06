package strategy.comparator;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AnimalTest {

	@Test
	void deveOrdenarListaDeAnimaisPeloNome() {
		List<Animal> listaDeAnimais = new ArrayList<>();
		
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(6L, "Gato"));
		
		System.out.println("Lista Antiga!");
		listaDeAnimais.forEach(System.out::println);
		
		listaDeAnimais.sort(new ComparadorPorNome());
		
		System.out.println("Lista Nova!");
		listaDeAnimais.forEach(System.out::println);
		
	}
}
