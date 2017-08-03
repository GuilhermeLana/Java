package lista3.exercicio2;

import java.text.DecimalFormat;

public class Livros extends Produto{
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String autor;

	public Livros(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String imprimirDados() {
		String dados = "";
		dados += "Nome: " + getNome();
		dados += "\nPreço: R$ " + df.format(getPreco());
		dados += "\nAutor: " + getAutor();
		return dados;
	}
	
	

	

}
