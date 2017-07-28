package Exceptions;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario fun = new Funcionario();
		
		fun.setNome("Guilherme");
		fun.setSalario(500);
		
		try {
			fun.aumentaSlario(-200);
		} catch (Exception e) {
			System.out.println("Houve um erro ao depositar");
		}

		
	}	
	

}
