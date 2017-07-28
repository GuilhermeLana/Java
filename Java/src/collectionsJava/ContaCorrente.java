package collectionsJava;

public class ContaCorrente extends Conta{
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void deposita(double valor) {
		setSaldo(getSaldo() + valor);
	}

	@Override
	public void saca(double valor) {
		setSaldo(getSaldo() - valor);
	}
	
	public double getSaldo() {
		return super.getSaldo();
	}

	
	
	

}
