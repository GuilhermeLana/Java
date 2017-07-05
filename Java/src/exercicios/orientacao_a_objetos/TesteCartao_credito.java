package exercicios.orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteCartao_credito {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		CartaoCredito cartao_credito1 = new CartaoCredito();
		cartao_credito1.numero = "158974";
		cartao_credito1.data_validade = sdf.parse("20/02/2020");
		CartaoCredito cartao_credito2 = new CartaoCredito();
		cartao_credito2.numero = "568975-9";
		cartao_credito2.data_validade = sdf.parse("15/05/2019");
		System.out.println("Cartão 1");
		System.out.println(cartao_credito1.numero);
		System.out.println(sdf.format(cartao_credito1.data_validade));
		System.out.println("----------------------------------------------------");
		System.out.println("Cartão 2");
		System.out.println(cartao_credito2.numero);
		System.out.println(sdf.format(cartao_credito2.data_validade));
	}

}
