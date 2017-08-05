package lista3.exercicio2;

import java.text.DecimalFormat;

public class Livros extends Produto{
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String autor;

	public Livros(String nome, double preco, String codigoBarras, String autor) {
		super(nome, preco, codigoBarras);
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
		dados += ", Preço: R$ " + df.format(getPreco());
		dados += ", Autor: " + getAutor();
		return dados;
	}

	@Override
	public int compareTo(Produto arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	

}
