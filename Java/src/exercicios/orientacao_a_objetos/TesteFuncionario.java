package exercicios.orientacao_a_objetos;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		funcionario1.nome = "Mario";
		funcionario1.salario = 2000d;
		funcionario1.aumentoSalario(500d);
		String info = funcionario1.dadosFuncionario();
		funcionario2.nome = "Lucio";
		funcionario2.salario = 1500d;
		funcionario2.aumentoSalario(500d);
		String info2 = funcionario2.dadosFuncionario();
		System.out.println(info);
		System.out.println("----------------------------------------------------");
		System.out.println(info2);
	}

}
