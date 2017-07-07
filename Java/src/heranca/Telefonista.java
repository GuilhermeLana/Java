package heranca;

import orientacao_a_objetos.Funcionario;

public class Telefonista extends Funcionario{
	
	private String codigoEstacao;
	
	public Telefonista(Funcionario funcionario, String codigoEstacao){
		super(funcionario.getNome(), funcionario.getSalario());
		this.codigoEstacao = codigoEstacao;
	}

	public String getCodigoEstacao() {
		return codigoEstacao;
	}

	public void setCodigoEstacao(String codigo) {
		this.codigoEstacao = codigo;
	}

	@Override
	public String imprimirDados() {
		return super.imprimirDados() + "\nCodigo Esta��o de Trabalho: " + this.codigoEstacao;
	}
	
	
	
	

}
