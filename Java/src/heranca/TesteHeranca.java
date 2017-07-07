package heranca;

import orientacao_a_objetos.Funcionario;

public class TesteHeranca {
	public static void main(String[] args) {
		Funcionario fun1 = new Funcionario("Julio", 2000);
		Gerente ger = new Gerente(fun1, "Julio", "1234");
		ger.bonificacao(20);
		
		Funcionario fun2 = new Funcionario("Raquel", 1500);
		Telefonista tel = new Telefonista(fun2, "25");
		tel.bonificacao(10);
		
		Funcionario fun3 = new Funcionario("Maiara", 1200);
		Secretaria sec = new Secretaria(fun3, "236");
		sec.bonificacao(10);
		
		System.out.println(ger.imprimirDados());
		
		System.out.println(tel.imprimirDados());
		
		System.out.println(sec.imprimirDados());
		
		System.out.println("\nBonificações: \nGerente: R$" + ger.getBonificacao() + 
				"\nTelefonista: " + tel.getBonificacao() + "\nSecretária: "
				+ sec.getBonificacao());
	}

}
