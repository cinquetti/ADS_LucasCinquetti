package StreamsPack;

public class Produto {
	
	private Long id;
	
	private String descricao;
	
	private Double preco;

	public Produto(Long id, String descricao, Double preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}
	

	//Metodo ToString
	
	@Override
	public String toString() {
		return "=Produto [id = " + id + ", Descrição = " + descricao + ", Preço = " + preco + "]";
	}

	
	//Getters e Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	

}
