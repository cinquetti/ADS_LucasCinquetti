package estoque;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class ProdutoTest {
	
	@Test
	void testeProdutoComoJavaBean() {
		
		Produto p = new Produto();
		p.setDescricao("Queijo Minas 1kg");
		p.setValorCompra(50.00);
		p.setDataValidade(LocalDate.of(2023, Month.JULY, 15));
		
		System.out.println("Dados do Produto: ");
		System.out.println(p.getDescricao());
		
	}

}
