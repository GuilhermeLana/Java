package orientacao_a_objetos;

public class TesteAluno {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		aluno1.nome = "Guilherme";
		aluno1.rg = "414.399.482-9";
		aluno1.data_nasc = "08/08/1993";
		aluno2.nome = "Matheus";
		aluno2.rg = "909.568.498.8";
		aluno2.data_nasc = "16/11/1991";
		System.out.println(aluno1.nome);
		System.out.println(aluno1.rg);
		System.out.println(aluno1.data_nasc);
		System.out.println("----------------------------------------------------");
		System.out.println(aluno2.nome);
		System.out.println(aluno2.rg);
		System.out.println(aluno2.data_nasc);
	}

}
