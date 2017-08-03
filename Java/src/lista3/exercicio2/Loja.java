package lista3.exercicio2;

import java.util.List;
import java.util.Vector;

public class Loja {
	public static void main(String[] args) {
		Livros livro1 = new Livros("Ponto de Impacto", 30d, "Dan Brown");
		Livros livro2 = new Livros("Sherlock Holmes", 55d, "Arthur Conan Doyle");
		
		CDs cd1 = new CDs("Foo Fighters - Sonic Highways", 20d, "8");
		CDs cd2 = new CDs("Linkin Park - Meteora", 30d, "12");
		
		DVDs dvd1 = new DVDs("U2 360 - Live in Rose Bowl", 50d, "2h20m");
		
		List<Livros> lLivros = new Vector<>();
		lLivros.add(livro1);
		lLivros.add(livro2);
		
		List<CDs> lCDs = new Vector<>();
		lCDs.add(cd1);
		lCDs.add(cd2);
		
		List<DVDs> lDVDs = new Vector<>();
		lDVDs.add(dvd1);
		
		for (Livros livros : lLivros) {
			System.out.println(livros.imprimirDados());
		}
		for (CDs cds : lCDs) {
			System.out.println(cds.imprimirDados());
		}
		for (DVDs dvds : lDVDs) {
			System.out.println(dvds.imprimirDados());
		}
	}

}
