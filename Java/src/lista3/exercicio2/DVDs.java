package lista3.exercicio2;

import java.text.DecimalFormat;

public class DVDs extends Produto{
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String duracao;

	public DVDs(String nome, double preco, String codigoBarras, String duracao) {
		super(nome, preco, codigoBarras);
		this.duracao = duracao;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	@Override
	public String imprimirDados() {
		String dados = "";
		dados += "Nome: " + getNome();
		dados += ", Preço: R$ " + df.format(getPreco());
		dados += ", Duração: " + getDuracao();
		return dados;
	}

	@Override
	public int compareTo(Produto o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
