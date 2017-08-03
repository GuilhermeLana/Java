package lista4.exercicio1;

import java.text.DecimalFormat;

public class Chefe extends Empregado{
	DecimalFormat df = new DecimalFormat("#,000.00");
	
	private double salarioMensal;

	public Chefe(String primeiroNome, String ultimoNome, double salarioMensal) {
		super(primeiroNome, ultimoNome);
		this.salarioMensal = salarioMensal;
	}

	@Override
	public void calcularGanho() {
		System.out.println("Nome: " + getPrimeiroNome() + " " + getUltimoNome() + 
				"\nSalário R$ " + df.format(getSalarioMensal()));
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	

}
