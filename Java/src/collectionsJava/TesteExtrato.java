package collectionsJava;


public class TesteExtrato {
	public static void main(String[] args) {
		
		ContaCorrente co = new ContaCorrente();
		co.setSaldo(500);
		
		Extrato.geradorDeExtratos(co);
		
	}

}
