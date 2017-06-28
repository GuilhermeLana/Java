package orientacao_a_objetos;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		funcionario1.nome = "Mario";
		funcionario1.salario = 2000d;
		funcionario2.nome = "Lucio";
		funcionario2.salario = 1500d;
		System.out.println(funcionario1.nome);
		System.out.println(funcionario1.salario);
		System.out.println("----------------------------------------------------");
		System.out.println(funcionario2.nome);
		System.out.println(funcionario2.salario);
	}

}
