package orientacao_a_objetos;

import java.util.Scanner;

public class TesteFuncionario2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Funcionario fun = new Funcionario();
		
		System.out.println("Digite o nome do funcionário:");
		fun.nome = scanner.next();
		
		int aux = 0;
		while (aux == 0) {
			System.out.println("Digite o nome do funcionário:");
			fun.nome = scanner.next();
			System.out.println("Digite o salário do funcionário:");
			fun.salario = scanner.nextInt();
			System.out.println(fun.dadosFuncionario());
			System.out.println("Digite 0 para continuar ou 1 para encerrar:");
			aux = scanner.nextInt();
		}
		scanner.close();
		
	}

}
