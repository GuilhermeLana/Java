package orientacao_a_objetos;

import java.text.DecimalFormat;

public class TesteGerente {
	public static void main(String[] args) {
	    DecimalFormat df = new DecimalFormat("#0.00");
	 
	    Gerente ge1 = new Gerente();
	    ge1.codigo = 1;
	    ge1.nome = "Marcos";
	    ge1.salario = 2000;
	    ge1.aumentaSalario();
	    System.out.println(df.format(ge1.salario));
	    
	    Gerente ge2 = new Gerente();
	    ge2.codigo = 1;
	    ge2.nome = "Marcos";
	    ge2.salario = 2000;
	    ge2.aumentaSalario(50);
	    System.out.println(df.format(ge2.salario));
	
	
	
	
	}

}
