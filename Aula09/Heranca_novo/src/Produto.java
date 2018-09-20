public class Produto {
	private String nome, preco, marca, descricao, data_fb;
	
	public Produto(String nome, String preco, String marca, String descricao, String data_fb){
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.data_fb = data_fb;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData_fb() {
		return data_fb;
	}

	public void setData_fb(String data_fb) {
		this.data_fb = data_fb;
	}
}
