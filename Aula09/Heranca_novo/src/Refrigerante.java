public class Refrigerante extends Produto_N_duravel{
	private String sabor;

	public Refrigerante(String nome, String preco, String marca, String descricao, String data_fb, String data_validade,
			String genero, String sabor) {
		super(nome, preco, marca, descricao, data_fb, data_validade, genero);
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
}
