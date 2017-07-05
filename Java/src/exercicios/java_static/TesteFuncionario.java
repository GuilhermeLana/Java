package exercicios.java_static;

import exercicios.orientacao_a_objetos.Funcionario;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario.valeRefeicaoDiario = 10d;
		Funcionario.reajustaValeRefeicaoDiario(0.2);
		Funcionario fun1 = new Funcionario();
		fun1.nome = "Marcos";
		System.out.println(fun1.dadosFuncionario());
		Funcionario fun2 = new Funcionario();
		fun2.nome = "Sérgio";
		System.out.println(fun2.dadosFuncionario());
		
		
	}

}
