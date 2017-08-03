package lista4.exercicio1;

import java.text.DecimalFormat;

public class TrabalhadorPecaProduzida extends Empregado{
	DecimalFormat df = new DecimalFormat("#,000.00");
	
	private double remuneracao;
	private int quantidade;


	public TrabalhadorPecaProduzida(String primeiroNome, String ultimoNome, double remuneracao, int quantidade) {
		super(primeiroNome, ultimoNome);
		this.remuneracao = remuneracao;
		this.quantidade = quantidade;
	}

	@Override
	public void calcularGanho() {
		remuneracao = remuneracao * quantidade;
		System.out.println("Nome: " + getPrimeiroNome() + " " + getUltimoNome() + 
				"\nSalário R$ " + df.format(getRemuneracao()));
		
	}

	public double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
