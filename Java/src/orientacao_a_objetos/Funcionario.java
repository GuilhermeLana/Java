package orientacao_a_objetos;

public class Funcionario {
	String nome;
	double salario;
	
	public void aumentoSalario (double valor){
		this.salario += valor;
	}
	public String dadosFuncionario (){
		return "O funcion�rio " + this.nome + " possui o sal�rio de R$ " + this.salario;
	}

}
