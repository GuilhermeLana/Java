package lista3.exercicio1;

public class Teste {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("256487", 1000);
		cc.deposita(500);
		cc.saca(500);
		cc.mostrarSaldo();
		
		ContaCorrenteEspecial cce = new ContaCorrenteEspecial("645789", 1000);
		cce.deposita(500);
		cce.saca(500);
		cce.mostrarSaldo();
	}

}
