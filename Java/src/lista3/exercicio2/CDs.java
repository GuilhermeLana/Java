package lista3.exercicio2;

import java.text.DecimalFormat;

public class CDs extends Produto {
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String numFaixas;

	public CDs(String nome, double preco, String codigoBarras, String numFaixas) {
		super(nome, preco, codigoBarras);
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
		dados += ", Preço: R$ " + df.format(getPreco());
		dados += ", Número de faixas: " + getNumFaixas();
		return dados;
	}

	@Override
	public int compareTo(Produto o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	

}
