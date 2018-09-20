public class Livro extends Produto_duravel{
	private int num_pgs;
	private String autor;
	private String titulo;
	public Livro(String nome, String preco, String marca, String descricao, String data_fb,
			String material_predominante, String durabilidade, int num_pgs, String autor, String titulo) {
		super(nome, preco, marca, descricao, data_fb, material_predominante, durabilidade);
		this.num_pgs = num_pgs;
		this.autor = autor;
		this.titulo = titulo;
	}
	public int getNum_pgs() {
		return num_pgs;
	}
	public void setNum_pgs(int num_pgs) {
		this.num_pgs = num_pgs;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
