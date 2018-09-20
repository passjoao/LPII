public class Produto_N_duravel extends Produto{
	private String data_validade;
	private String genero;
	public Produto_N_duravel(String nome, String preco, String marca, String descricao, String data_fb,
			String data_validade, String genero) {
		super(nome, preco, marca, descricao, data_fb);
		this.data_validade = data_validade;
		this.genero = genero;
	}
	public String getData_validade() {
		return data_validade;
	}
	public void setData_validade(String data_validade) {
		this.data_validade = data_validade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
