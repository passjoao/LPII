public class Celular extends Produto_duravel{
	private String modelo;
	private int ano;
	
	public Celular(String nome, String preco, String marca, String descricao, String data_fb,
			String material_predominante, String durabilidade, String modelo, int ano) {
		super(nome, preco, marca, descricao, data_fb, material_predominante, durabilidade);
		this.modelo = modelo;
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}	
}
