package heranca;

import orientacao_a_objetos.Funcionario;

public class Gerente extends Funcionario{
	
	private String login;
	private String senha;
	
	
	
	public Gerente(Funcionario funcionario, String login, String senha){
		super(funcionario.getNome(), funcionario.getSalario());
		this.login = login;
		this.senha = senha;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public void bonificacao (double bonus){
		this.setBonificacao(getSalario() * (bonus/100)); ;
	}

	@Override
	public String imprimirDados() {
		return super.imprimirDados() + "\nLogin: " + this.login
				+ "\nSenha: " + this.senha;
	}
	
	
	
}
