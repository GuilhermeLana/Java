package lista3.exercicio2;

public class DVDs extends Produto{
	
	private String duracao;

	public DVDs(String nome, double preco, String duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	

}
