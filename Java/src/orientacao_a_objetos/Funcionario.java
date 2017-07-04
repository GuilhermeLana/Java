package orientacao_a_objetos;

public class Funcionario {
	String nome;
	double salario = 1000d;
	
	public void aumentoSalario (double valor){
		this.salario += valor;
	}
	public String dadosFuncionario (){
		return "O funcionário " + this.nome + " possui o salário de R$ " + this.salario;
	}

}
