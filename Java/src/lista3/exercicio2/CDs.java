package lista3.exercicio2;

import java.text.DecimalFormat;

public class CDs extends Produto {
	DecimalFormat df = new DecimalFormat("#0.00");
	
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

	@Override
	public String imprimirDados() {
		String dados = "";
		dados += "Nome: " + getNome();
		dados += "\nPreço: R$ " + df.format(getPreco());
		dados += "\nNúmero de faixas: " + getNumFaixas();
		return dados;
	}
	
	

	

}
