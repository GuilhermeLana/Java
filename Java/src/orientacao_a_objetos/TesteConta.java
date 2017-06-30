package orientacao_a_objetos;

import java.text.DecimalFormat;

public class TesteConta {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ("#0.00");
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		conta1.numero = "265489-9";
		conta1.saldo = 5086d;
		conta1.limite = 800d;
		conta2.numero = "568194-5";
		conta2.saldo = 2004.56d;
		conta2.limite = 500d;
		System.out.println(conta1.numero);
		System.out.println(df.format(conta1.saldo));
		System.out.println(df.format(conta1.limite));
		System.out.println("----------------------------------------------------");
		System.out.println(conta2.numero);
		System.out.println(df.format(conta2.saldo));
		System.out.println(df.format(conta2.limite));
	}

}
