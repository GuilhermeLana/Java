package orientacao_a_objetos;

public class Gerente {
	private int codigo;
	private String nome;
	private double salario;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
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
	public void aumentaSalario(){
		this.aumentaSalario(10);
	}
	public void aumentaSalario(double valor){
		this.salario += ((valor*salario)/100);
	}

}
