package interfaces.conta;

public class TesteConta {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.setNumConta("78945-8");
		cc.setSaldo(500);
		cc.deposita(200);
		System.out.println(cc.getSaldo());
		cc.saca(300);
		System.out.println(cc.getSaldo());
		
	}

}
