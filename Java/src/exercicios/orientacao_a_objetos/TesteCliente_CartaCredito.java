package exercicios.orientacao_a_objetos;

public class TesteCliente_CartaCredito {
	public static void main(String[] args) {
		CartaoCredito cdc = new CartaoCredito();
		Cliente c = new Cliente ();
		cdc.cliente = c;
		
		cdc.cliente.nome = "Guilherme";
		cdc.cliente.codigo = "256";
		
		System.out.println("Cliente: " + cdc.cliente.nome + " código: " + cdc.cliente.codigo);
	}
	
}
