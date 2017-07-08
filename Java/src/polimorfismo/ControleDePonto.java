package polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	
	public void registraEntrada (Funcionario funcionario){
		Date agora = new Date();
		System.out.println("ENTRADA: " + funcionario.getNome() +
		                   "\nDATA: " + sdf.format(agora));
		
	}
	
	public void registraSaida (Funcionario funcionario){
		Date agora = new Date();
		System.out.println("SAIDA: " + funcionario.getNome() +
		                   "\nDATA: " + sdf.format(agora));
		
	}

}
