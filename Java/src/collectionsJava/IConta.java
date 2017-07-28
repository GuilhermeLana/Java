/**
 * Este pacote � respons�vel pelas classes de uma conta.
 */
package collectionsJava;
/**
 * Esta Classe � respons�vel pela Interface de uma conta.
 * 
 * @author Guilherme Lana
 *
 */
public interface IConta {
	/**
	 * Este m�todo � respons�vel pelo dep�sito de uma conta.
	 * @param valor
	 */
	void deposita(double valor);
	/**
	 * Este m�todo � respons�vel pelo saque de uma conta.
	 * @param valor
	 */
	void saca(double valor);
	/**
	 * Este m�todo � respons�vel pelo saldo de uma conta.
	 * @return saldo
	 */
	double getSaldo();

}
