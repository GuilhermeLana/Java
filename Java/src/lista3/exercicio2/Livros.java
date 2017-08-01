package lista3.exercicio2;

public class Livros extends Produto{
	
	private String Autor;

	public Livros(String nome, double preco, String autor) {
		super(nome, preco);
		this.Autor = autor;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}
	
	

	

}
