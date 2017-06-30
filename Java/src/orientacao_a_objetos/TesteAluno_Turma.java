package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteAluno_Turma {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
		Aluno alu = new Aluno();
		Turma tur = new Turma();
		alu.turma = tur;
		alu.turma.periodo = "Noturno";
		alu.turma.serie = '3';
		alu.turma.sigla = 'B';
		alu.turma.tipo_ensino = "Ensino Médio";
		alu.nome = "Guilherme";
		alu.rg = "414.399.482-9";
		alu.data_nasc = sdf.parse("08/08/1993");
		System.out.println("Aluno: " + alu.nome + "\nData de Nascimento: " 
				+ sdf.format(alu.data_nasc) + "\nRG: " + alu.rg
				+ "\nEstá no " + alu.turma.serie + "º ano, turma: " + alu.turma.sigla 
				+ " do " + alu.turma.tipo_ensino + " no periodo " + alu.turma.periodo);
		
	}	

}
