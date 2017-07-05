package exercicios.orientacao_a_objetos;

public class Funcionario {
	public String nome;
	public double salario = 1000d;
	public static double valeRefeicaoDiario;
	
	public void aumentoSalario (double valor){
		this.salario += valor;
	}
	
	public static void reajustaValeRefeicaoDiario (double taxa) {
		Funcionario.valeRefeicaoDiario += Funcionario.valeRefeicaoDiario * taxa;
	}

	public String dadosFuncionario (){
		return "O funcion�rio " + this.nome + " possui o sal�rio de R$ " + this.salario
				+ " VR: " + Funcionario.valeRefeicaoDiario;
	}

}
