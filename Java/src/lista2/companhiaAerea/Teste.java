package lista2.companhiaAerea;


import java.text.DecimalFormat;
import java.util.Arrays;


public class Teste {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat(",000.00");
		
		CompanhiaArea com = new CompanhiaArea();
		
		Boeing boeing1 = new Boeing(50, 100d);
		Boeing boeing2 = new Boeing(50, 100d);
		
		Monomotor monomotor1 = new Monomotor(4, 200d);
		Monomotor monomotor2 = new Monomotor(4, 200d);
		Monomotor monomotor3 = new Monomotor(4, 200d);
		
		Bimotor bimotor1 = new Bimotor(16, 300d);
		Bimotor bimotor2 = new Bimotor(16, 300d);
		
		com.setBoeings(Arrays.asList(boeing1, boeing2));
		com.setMonomotores(Arrays.asList(monomotor1, monomotor2, monomotor3));
		com.setBimotores(Arrays.asList(bimotor1, bimotor2));
		
		System.out.println("Faturamento total: R$ " + df.format(com.retornaFaturamentoPassagens()));
				

	}

}
