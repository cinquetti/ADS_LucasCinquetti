package contabilidade;

public class EmpresaMEI implements Tributavel {

	static final Double TAXA_IR_EMPRESAMEI = 0.275;
	static final Double TAXA_ISS_EMPRESAMEI = 0.0;
	
	Double fatoramentoMensal;

	public EmpresaMEI(Double fatoramentoMensal) {
		super();
		this.fatoramentoMensal = fatoramentoMensal;
	}

	@Override
	public Double getValorIR() {

		return this.fatoramentoMensal * TAXA_IR_EMPRESAMEI;
	}

	@Override
	public Double getValorISS() {

		return TAXA_ISS_EMPRESAMEI;
	}

}
