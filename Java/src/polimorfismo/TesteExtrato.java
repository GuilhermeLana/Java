package polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteExtrato {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Extrato ex = new Extrato();
		
		Agencia ag = new Agencia();
		ag.setNumAgencia("2565-8");
		
		Cliente cl = new Cliente();
		cl.setNome("Guilherme Lana");
		cl.setCpf("414.399.928-1");
		cl.setDtNasc(sdf.parse("08/08/1993"));
		
		Corrente co = new Corrente();
		co.setNumConta("265489-8");
		co.setSaldo(500);
		co.setAgencia(ag);
		co.setCliente(cl);
		
		ex.geradorDeExtratos(co);
		
	}

}
