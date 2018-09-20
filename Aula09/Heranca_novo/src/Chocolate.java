public class Chocolate extends Produto_N_duravel{
	private float pct_cacau;

	public Chocolate(String nome, String preco, String marca, String descricao, String data_fb, String data_validade,
			String genero, float pct_cacau) {
		super(nome, preco, marca, descricao, data_fb, data_validade, genero);
		this.pct_cacau = pct_cacau;
	}

	public float getPct_cacau() {
		return pct_cacau;
	}

	public void setPct_cacau(float pct_cacau) {
		this.pct_cacau = pct_cacau;
	}
	
}
