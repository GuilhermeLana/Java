/**
 * Este pacote é responsável pelas classes de uma conta.
 */
package collectionsJava;

/**
 * Esta Classe é responsável pelos atributos da Conta.
 * 
 * @author Guilherme Lana
 *
 */
public abstract class Conta implements IConta{
	
	/**
	 * Este atributo é responsável pelo número da Conta.
	 */
	private String numConta;
	/**
	 * Este atributo é responsável pelo saldo da Conta.
	 */
	private double saldo;
	/**
	 * Este atributo é responsável pelos atributos da Classe Agência.
	 */
	private Agencia agencia;
	/**
	 * Este atributo é responsável pelos atributos da Classe Cliente.
	 */
	private Cliente cliente;
	
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
