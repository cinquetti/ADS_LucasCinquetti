package esporte;


public class Pessoa {
	
	private Integer idade;
	
	private String nome;
	
	public Pessoa(String nome, Integer idade){
		
		this.nome = nome;
		this.idade = idade;
	}
	
	void morrer()
	{
		this.idade++;
		if (idade >= 100) {
		System.out.println("MORREU!");
		}	
	}

	
	//Getters e Setters

	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
