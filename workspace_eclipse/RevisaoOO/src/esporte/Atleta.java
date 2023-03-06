package esporte;

public class Atleta extends Pessoa{
	
	private Integer peso;
	
	private Boolean aposentado;
	
	public Atleta (String nome,Integer idade,Integer peso, Boolean aposentado) {
		
		super(nome, idade);
		this.peso = peso;
		this.aposentado = aposentado;
	}
	
	void aquecer(){
		
		System.out.println("Atleta aquecido!");
	}
	
	void aposentar () {
		
		System.out.println("Aposentou!");
	}

	
	//Getters e Setters
	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Boolean getAposentado() {
		return aposentado;
	}

	public void setAposentado(Boolean aposentado) {
		this.aposentado = aposentado;
	}
	
	
	
	
	
	
    
}
