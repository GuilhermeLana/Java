/**
 * Este pacote é responsável pelas classes de uma conta.
 */
package collectionsJava;
/**
 * Esta Classe é responsável pela Interface de uma conta.
 * 
 * @author Guilherme Lana
 *
 */
public interface IConta {
	/**
	 * Este método é responsável pelo depósito de uma conta.
	 * @param valor
	 */
	void deposita(double valor);
	/**
	 * Este método é responsável pelo saque de uma conta.
	 * @param valor
	 */
	void saca(double valor);
	/**
	 * Este método é responsável pelo saldo de uma conta.
	 * @return saldo
	 */
	double getSaldo();

}
