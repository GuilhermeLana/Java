package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Conta {
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private int id;
	private String numero;
	private double saldo;
	private double limite = 100d;
	private Agencia agencia;
	static int contador = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Conta(Agencia agencia) {
		this.agencia = agencia;
		contador ++;
		id = contador;
	}
	
	public Conta() {
		contador ++;
		id = contador;
	}
	
	public Conta(Agencia agencia, String numero, double limite) {
		this(agencia);
		this.numero = numero;
		this.limite = limite;
		contador ++;
		id = contador;
	}
	
	public static void zerarContador(){
		System.out.println(contador);
		contador = 0;
		
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
