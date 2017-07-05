package exercicios.orientacao_a_objetos;

public class TesteConta_Agencia {
	public static void main(String[] args) {
		Agencia ag = new Agencia("25689-5");
		Conta c = new Conta(ag);
		
		c.agencia = ag;
		
		c.numero = "265894-8";
		
		System.out.println("Agência: " + c.agencia.numero + " Conta: " + c.numero);
	}

}
