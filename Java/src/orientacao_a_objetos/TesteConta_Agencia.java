package orientacao_a_objetos;

public class TesteConta_Agencia {
	public static void main(String[] args) {
		Conta c = new Conta();
		Agencia ag = new Agencia();
		c.agencia = ag;
		
		c.agencia.numero = "25689-5";
		c.numero = "265894-8";
		
		System.out.println("Agência: " + c.agencia.numero + " Conta: " + c.numero);
	}

}
