package banco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {
	
	@Test
	void testarContaCorrente() {
		
		Double saldoEsperado = 101.0;
		
		ContaCorrente contacorrente = new ContaCorrente();
		contacorrente.depositar(100.0);
		contacorrente.rentabilizar();
		
		assertEquals(saldoEsperado, contacorrente.saldo);
		
	}


     @Test
     void testarContaPoupanca() {
    	 Double saldoEsperado = 102.0;
    	 
    	 Conta poupanca = new ContaPoupanca();
    	 poupanca.depositar(100.0);
    	 poupanca.rentabilizar();
    	 
    	 assertEquals(saldoEsperado, poupanca.saldo);
    	  
     }
     
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
     
     @Test
     void testConta_toString() {
    	 
    	 Conta conta = new ContaCorrente();
    	 conta.depositar(80.0);
    	 conta.sacar(10.0);
    	 
    	 String str = conta.toString();
    	 
    	 System.out.println(str);
    	 
    	 
     }
     
     
     
     
}
