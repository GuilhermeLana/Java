package orientacao_a_objetos;

public class TesteAgencia {
	public static void main(String[] args) {
		Agencia agencia1 = new Agencia();
		Agencia agencia2 = new Agencia();
		agencia1.numero = "2134-5";
		agencia2.numero = "5689-8";
		System.out.println(agencia1.numero);
		System.out.println("----------------------------------------------------");
		System.out.println(agencia2.numero);
	}

}
