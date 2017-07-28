/**
 * Este pacote é responsável pelas classes de uma conta.
 */
package interfaces.conta;

import java.util.Date;

/**
 * Esta Classe é resaponsável pelos atributos do Cliente.
 * 
 * @author Guilherme Lana
 *
 */
public class Cliente {
	
	/**
	 * Este atributo é responsável pelo nome do Cliente.
	 */
	private String nome;
	/**
	 * Este atributo é responsável pelo CPF do Cliente.
	 */
	private String cpf;
    /**
     * Este atributo é responsável pela data de nascimento do Cliente
     */
	private Date dtNasc;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}
	
	
	
	
	
	

}
