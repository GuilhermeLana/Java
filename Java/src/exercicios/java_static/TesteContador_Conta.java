package exercicios.java_static;

import exercicios.orientacao_a_objetos.Conta;

public class TesteContador_Conta {
	public static void main(String[] args) {
		System.out.println(Conta.contador);
		Conta conta1 = new Conta();
		System.out.println(conta1.id);
		Conta conta2 = new Conta();
		System.out.println(conta2.id);
		
		Conta.zerarContador();
		System.out.println(Conta.contador);
		
		
	}

}
