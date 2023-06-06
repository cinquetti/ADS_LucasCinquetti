package StreamsPack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SobreStreams {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto(1L, "Cadeira", 100.0));
		produtos.add(new Produto(2L, "Cama", 400.0));
		produtos.add(new Produto(3L, "Mesa", 200.0));
		produtos.add(new Produto(4L, "Sofá", 500.0));
		produtos.add(new Produto(5L, "Cadeira", 150.0));
		
		//Filter
		List<Produto> produtosFiltrados = produtos.stream()
				.filter(p -> p.getPreco()< 300.00)
				.collect(Collectors.toList());
		
		produtosFiltrados.forEach(System.out::println);
		
		//Map
		List<String> descricoes = produtos.stream()
				.map(p -> p.getDescricao())
				.collect(Collectors.toList());
		
		descricoes.forEach(System.out::println);
		
		//Map e Reduce
		Double precoTotal = produtosFiltrados.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, Double::sum);
		
		System.out.println(precoTotal);
		
		
		
	}

}