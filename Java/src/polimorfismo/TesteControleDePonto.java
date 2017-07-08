package polimorfismo;

public class TesteControleDePonto {
	public static void main(String[] args) {
		Gerente ger = new Gerente();
		ger.setNome("Guilherme");
		
		Telefonista tel = new Telefonista();
		tel.setNome("Julia");
		
		ControleDePonto cdp = new ControleDePonto();
		cdp.registraEntrada(ger);
		cdp.registraEntrada(tel);
		cdp.registraSaida(ger);
		cdp.registraSaida(tel);
	}

}
