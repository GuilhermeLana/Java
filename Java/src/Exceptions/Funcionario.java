package Exceptions;

public class Funcionario {
	
	private String nome;
	private double salario;
	
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
	
	public void aumentaSlario(double valor) throws Exception{
		if(valor < 0){
			throw new Exception ("Houve um erro ao depositar");
		}else{
			setSalario(valor + getSalario());

		}
	}
	
	

}
