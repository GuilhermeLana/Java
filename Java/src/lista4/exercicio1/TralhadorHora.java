package lista4.exercicio1;

import java.text.DecimalFormat;

public class TralhadorHora extends Empregado{
	DecimalFormat df = new DecimalFormat("#,000.00");
	
	private double salarioHoras;
	private double horas;


	public TralhadorHora(String primeiroNome, String ultimoNome, double salarioHoras, double horas) {
		super(primeiroNome, ultimoNome);
		this.salarioHoras = salarioHoras;
		this.horas = horas;
	}

	@Override
	public void calcularGanho() {
		salarioHoras = salarioHoras * horas;
		System.out.println("Nome: " + getPrimeiroNome() + " " + getUltimoNome() + 
				"\nSalário R$ " + df.format(getSalarioHoras()));
		
	}

	public double getSalarioHoras() {
		return salarioHoras;
	}

	public void setSalarioHoras(double salarioHoras) {
		this.salarioHoras = salarioHoras;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	

}
