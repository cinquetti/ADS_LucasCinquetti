package Open_Closed;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FolhaDePagamento {
     
	private double saldo;
	private Double totalFolha;
	
	public void calcular(Remuneravel r) {
		this.saldo = r.getRemuneracao();
	}
	
	@Test
	public void deveCalcular() {
		ContratoCLT contratoCLT = new ContratoCLT(1000.0);
		Estagio estagio = new Estagio(500.0);
		ContratoPJ contratoPJ = new ContratoPJ(600.0);
		
		FolhaDePagamento folhadepagamento = new FolhaDePagamento();
		folhadepagamento.calcular(contratoCLT);
		folhadepagamento.calcular(estagio);
		folhadepagamento.calcular(contratoPJ);
		
		Double totalFolha = folhadepagamento.getTotalFolha();
		
		assertEquals(1500.0, totalFolha);
	
	}

	public double getSaldo() {
		return saldo;
	}

	public Double getTotalFolha() {
		return totalFolha;
	}
	
	
	
	
}
