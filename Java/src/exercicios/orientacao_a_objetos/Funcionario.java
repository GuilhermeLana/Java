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
		return "O funcionário " + this.nome + " possui o salário de R$ " + this.salario
				+ " VR: " + Funcionario.valeRefeicaoDiario;
	}

}
