package contabilidade;

public class EmpresaSimples implements Tributavel{
	
	
	static final Double TAXA_ISS_EMPRESA_SIMPLES = 0.08;
	static final Double TAXA_IR_EMPRESA_SIMPLES = 0.15;
	
	
	Double fatoramentoMensal;

	public EmpresaSimples(Double fatoramentoMensal) {
		super();
		this.fatoramentoMensal = fatoramentoMensal;
	}

	@Override
	public Double getValorIR() {
		
		return this.fatoramentoMensal * TAXA_IR_EMPRESA_SIMPLES;
	}

	@Override
	public Double getValorISS() {
		
		return this.fatoramentoMensal * TAXA_ISS_EMPRESA_SIMPLES;
	}
	
	

}
