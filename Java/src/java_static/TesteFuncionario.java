package java_static;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario.valeRefeicaoDiario = 10d;
		Funcionario.reajustaValeRefeicaoDiario(0.2);
		Funcionario fun1 = new Funcionario();
		fun1.setNome("Marcos"); 
		System.out.println(fun1.dadosFuncionario());
		Funcionario fun2 = new Funcionario();
		fun2.setNome ("Sérgio");
		System.out.println(fun2.dadosFuncionario());
		
		
	}

}
