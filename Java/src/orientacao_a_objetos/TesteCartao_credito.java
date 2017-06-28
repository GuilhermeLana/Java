package orientacao_a_objetos;

public class TesteCartao_credito {
	public static void main(String[] args) {
		Cartao_credito cartao_credito1 = new Cartao_credito();
		Cartao_credito cartao_credito2 = new Cartao_credito();
		cartao_credito1.numero = "158974";
		cartao_credito1.data_validade = "20/02/2020";
		cartao_credito2.numero = "568975-9";
		cartao_credito2.data_validade = "15/05/2019";
		System.out.println(cartao_credito1.numero);
		System.out.println(cartao_credito1.data_validade);
		System.out.println("----------------------------------------------------");
		System.out.println(cartao_credito2.numero);
		System.out.println(cartao_credito2.data_validade);
	}

}
