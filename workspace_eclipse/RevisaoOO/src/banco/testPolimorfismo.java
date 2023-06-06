package banco;

import org.junit.jupiter.api.Test;

public class testPolimorfismo {
	
	@Test
	void testarPolimorfismo() {
		
		boolean flagContaCorrenteComoDefault = true;
		
		Conta conta = null;
		if (flagContaCorrenteComoDefault) {
			conta = new ContaCorrente();
		}else {
			conta = new ContaPoupanca();
		}
		
		conta.depositar(100.0);
		
		conta.rentabilizar();
		
		System.out.println(conta.getClass().getName());
		System.out.println(conta.saldo);
		
		
	}

}
