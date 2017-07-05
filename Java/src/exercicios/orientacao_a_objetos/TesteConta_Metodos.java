package exercicios.orientacao_a_objetos;

import java.text.DecimalFormat;

public class TesteConta_Metodos {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Agencia ag = new Agencia("2567-5");
		Conta c = new Conta(ag);
		
		c.agencia = ag;
		
		c.numero = "265756-9";
		c.saldo = 5000d;
		
		c.deposita(1000d);
		double consultaSaldo = c.consultaSaldo();
		System.out.println("Seu saldo atual é de: R$ " + df.format(consultaSaldo));
		
		c.saque(5000d);
		String extrato = c.extrato();
		System.out.println(extrato);
	}

}
