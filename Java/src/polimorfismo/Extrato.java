package polimorfismo;

public class Extrato {
	
	public void geradorDeExtratos(Conta c){
		System.out.println("Nome: " + c.getCliente().getNome() + "\nAg�ncia: " + c.getAgencia().getNumAgencia() 
		+ "\nConta: " + c.getNumConta() + "\nSaldo: " + c.getSaldo());
	}

}
