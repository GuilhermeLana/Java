package classes_abstratas;

public class TesteConta {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.setNumAgencia("2568-9");
		c.setNumConta("654789-9");
		c.setSaldo(500d);
		System.out.println("Agencia: " + c.getNumAgencia()
				+ "\nConta: " + c.getNumConta()
				+ "\nSaldo: " + c.getSaldo());
	}
	

}
