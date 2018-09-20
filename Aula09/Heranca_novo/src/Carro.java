public class Carro extends Produto_duravel{
	private String modelo;
	private String qtnd_portas;
	public Carro(String nome, String preco, String marca, String descricao, String data_fb,
			String material_predominante, String durabilidade, String modelo, String qtnd_portas) {
		super(nome, preco, marca, descricao, data_fb, material_predominante, durabilidade);
		this.modelo = modelo;
		this.qtnd_portas = qtnd_portas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getQtnd_portas() {
		return qtnd_portas;
	}
	public void setQtnd_portas(String qtnd_portas) {
		this.qtnd_portas = qtnd_portas;
	}
}
