package orientacao_a_objetos;

public class Funcionario {
	private String nome;
	private double salario = 1000d;
	public static double valeRefeicaoDiario;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

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
