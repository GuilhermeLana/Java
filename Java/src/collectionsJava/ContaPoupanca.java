package collectionsJava;

public class ContaPoupanca extends Conta{

	private double jurosRendimento;

	public double getJurosRendimento() {
		return jurosRendimento;
	}

	public void setJurosRendimento(double jurosRendimento) {
		this.jurosRendimento = jurosRendimento;
	}
	
	@Override
	public void deposita(double valor) {
		this.setSaldo(getSaldo() + valor);
	}

	@Override
	public void saca(double valor) {
		this.setSaldo(getSaldo() - valor);
	}

	@Override
	public double getSaldo() {
		return super.getSaldo();
	}
	

	

}
