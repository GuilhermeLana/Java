package lista3.exercicio2;

public class CDs extends Produto {
	
	private String numFaixas;

	public CDs(String nome, double preco, String numFaixas) {
		super(nome, preco);
		this.numFaixas = numFaixas;
	
	}

	public String getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(String numFaixas) {
		this.numFaixas = numFaixas;
	}
	
	

	

}
