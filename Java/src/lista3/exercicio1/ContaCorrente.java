package lista3.exercicio1;

import java.text.DecimalFormat;

public class ContaCorrente {
	
	private String numero;
	private double saldo;
	
	
	public ContaCorrente(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void deposita(double valor){
		setSaldo(getSaldo() + valor);
	}
	
	public void saca(double valor){
		double taxa = valor * (0.5 / 100);
		setSaldo(getSaldo() - (valor + taxa));
	}
	
	DecimalFormat df = new DecimalFormat("#,000.00");
	public void mostrarSaldo(){
		System.out.println("Número da conta: " + getNumero() + "\nSaldo: " + df.format(getSaldo()));
		
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
