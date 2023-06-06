package avancado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class SobreArrays {

	public static void main(String[] args) {

		Animal[] arrayDeAnimais = new Animal[4];
		
		
		arrayDeAnimais[0] = new Animal(1L,"Tartaruga");
		arrayDeAnimais[1] = new Animal(2L,"Coelho");
		arrayDeAnimais[2] = new Animal(3L,"Cachorro");
		arrayDeAnimais[3] = new Animal(4L,"Gato");
		
		System.out.println("Array de Animais: ");
		for(Animal animal : arrayDeAnimais) {
			System.out.println(animal.getNome());
		}
		
		Collection<String> colecao = BuildCollectionImplementation();
		
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leão");
		colecao.add("Pantera");
		colecao.add("Avestruz");
		
		System.out.println( colecao );
		
	}

	private static ArrayList<String> BuildCollectionImplementation() {
		
		return BuildCollectionImplementation();
	}
	
	
	private static Collection<String> buildCollectionImplementation(){
		
		return new TreeSet<String>();
	}

}
