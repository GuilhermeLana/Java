package orientacao_a_objetos;

public class TesteTurma {
	public static void main(String[] args) {
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();
		turma1.periodo = "Noturno";
		turma1.serie = '1';
		turma1.sigla = 'A';
		turma1.tipo_ensino = "Ensino Médio";
		turma2.periodo = "Matutino";
		turma2.serie = '3';
		turma2.sigla = 'B';
		turma2.tipo_ensino = "Ensino Médio";
		System.out.println(turma1.periodo);
		System.out.print(turma1.serie);
		System.out.println("º" + turma1.sigla);
		System.out.println(turma1.tipo_ensino);
		System.out.println("----------------------------------------------------");
		System.out.println(turma2.periodo);
		System.out.print(turma2.serie);
		System.out.println("º" + turma2.sigla);
		System.out.println(turma2.tipo_ensino);
	}

}
