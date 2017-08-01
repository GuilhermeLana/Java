package lista3.exercicio1;

public class ContaCorrenteEspecial extends ContaCorrente{

	public ContaCorrenteEspecial(String numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public void saca(double valor) {
		double taxa = valor * (0.1 / 100);
		setSaldo(getSaldo() - (valor + taxa));
	}
	
	

}
