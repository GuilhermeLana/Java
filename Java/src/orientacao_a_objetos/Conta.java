package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Conta {
	DecimalFormat df = new DecimalFormat("#0.00");
	
	String numero;
	double saldo;
	double limite = 100d;
	Agencia agencia;
	
	public Conta(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public Conta(Agencia agencia, String numero, double limite) {
		this(agencia);
		this.numero = numero;
		this.limite = limite;
	}
	
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
	
	public void transfere(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
	}

}
