package polimorfismo;

public class Extrato {
	
	public void geradorDeExtratos(Conta c){
		System.out.println("Ag�ncia: " + c.getAgencia() + "\nConta: " + c.getNumero() 
		+ "\nSaldo: " + c.getSaldo());
	}

}
