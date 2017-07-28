/**
 * Este pacote � respons�vel pelas classes de uma conta.
 */
package collectionsJava;

/**
 * Esta Classe � respons�vel pelos atributos da Conta.
 * 
 * @author Guilherme Lana
 *
 */
public abstract class Conta implements IConta{
	
	/**
	 * Este atributo � respons�vel pelo n�mero da Conta.
	 */
	private String numConta;
	/**
	 * Este atributo � respons�vel pelo saldo da Conta.
	 */
	private double saldo;
	/**
	 * Este atributo � respons�vel pelos atributos da Classe Ag�ncia.
	 */
	private Agencia agencia;
	/**
	 * Este atributo � respons�vel pelos atributos da Classe Cliente.
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
