package orientacao_a_objetos;

public class Gerente {
	int codigo;
	String nome;
	double salario;
	
	public void aumentaSalario(){
		this.aumentaSalario(10);
	}
	public void aumentaSalario(double valor){
		this.salario += ((valor*salario)/100);
	}

}
