package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Conta {
	DecimalFormat df = new DecimalFormat("#0.00");
	
	String numero;
	double saldo;
	double limite = 100d;
	Agencia agencia;
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	public double consultaSaldo(){
		return this.saldo + this.limite;
	}
	public void saque (double valor){
		this.saldo -= valor;
	}
	public String extrato(){
		return "Agencia: " + this.agencia.numero + " Conta: " + this.numero
				+ "\nSaldo: R$ " +  df.format(this.saldo) + "\nLimite: R$ " +  df.format(this.limite);
	}
	

}
