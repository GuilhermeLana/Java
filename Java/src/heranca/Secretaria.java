package heranca;

import orientacao_a_objetos.Funcionario;

public class Secretaria extends Funcionario{
	
	private String ramal;
	
	public Secretaria(Funcionario funcionario, String ramal){
		super(funcionario.getNome(), funcionario.getSalario());
		this.ramal = ramal;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	
	@Override
	public String imprimirDados() {
		return super.imprimirDados() + "\nRamal: " + this.ramal;
	}
	
	

}
