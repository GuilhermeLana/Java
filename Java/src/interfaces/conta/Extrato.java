package interfaces.conta;

public class Extrato {
	
	public static void geradorDeExtratos(IConta c){
		System.out.println("Saldo: " + c.getSaldo());
	}

}
