package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteAluno {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Guilherme";
		aluno1.rg = "414.399.482-9";
		aluno1.data_nasc = sdf.parse("08/08/1993");
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Matheus";
		aluno2.rg = "909.568.498.8";
		aluno2.data_nasc = sdf.parse("16/11/1991");
		System.out.println("Aluno 1");
		System.out.println(aluno1.nome);
		System.out.println(aluno1.rg);
		System.out.println(sdf.format(aluno1.data_nasc));
		System.out.println("----------------------------------------------------");
		System.out.println("Aluno 2");
		System.out.println(aluno2.nome);
		System.out.println(aluno2.rg);
		System.out.println(sdf.format(aluno2.data_nasc));
	}

}
