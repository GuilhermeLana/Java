package lista4.exercicio1;

import java.text.DecimalFormat;

public class TrabalhadorComissionado extends Empregado{
	DecimalFormat df = new DecimalFormat("#,000.00");
	
	private double salario;
	private double comissao;
	private int quantidade;

	public TrabalhadorComissionado(String primeiroNome, String ultimoNome, double salario, double comissao, int quantidade) {
		super(primeiroNome, ultimoNome);
		this.salario = salario;
		this.comissao = comissao;
		this.quantidade = quantidade;

	}

	@Override
	public void calcularGanho() {
		salario = salario + (comissao * quantidade);
		System.out.println("Nome: " + getPrimeiroNome() + " " + getUltimoNome() + 
				"\nSalário R$ " + df.format(getSalario()));
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
