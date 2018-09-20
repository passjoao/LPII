
public class Produto_duravel extends Produto{
	private String material_predominante;
	private String durabilidade;

	public Produto_duravel(String nome, String preco, String marca, String descricao, String data_fb,
			String material_predominante, String durabilidade) {
		super(nome, preco, marca, descricao, data_fb);
		this.material_predominante = material_predominante;
		this.durabilidade = durabilidade;
	}

	public String getMaterial_predominante() {
		return material_predominante;
	}

	public void setMaterial_predominante(String material_predominante) {
		this.material_predominante = material_predominante;
	}

	public String getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(String durabilidade) {
		this.durabilidade = durabilidade;
	}
	

}
