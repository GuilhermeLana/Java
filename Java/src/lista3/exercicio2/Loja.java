package lista3.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Loja {
	public static void main(String[] args) {
		Livros livro1 = new Livros("Ponto de Impacto", 30d, "00000001", "Dan Brown");
		Livros livro2 = new Livros("Sherlock Holmes", 55d, "00000002", "Arthur Conan Doyle");
		
		CDs cd1 = new CDs("Foo Fighters - Sonic Highways", 20d, "00000003", "8");
		CDs cd2 = new CDs("Linkin Park - Meteora", 30d, "00000004", "12");
		
		DVDs dvd1 = new DVDs("U2 360 - Live in Rose Bowl", 50d, "00000005", "2h20m");
		
		List<Produto> lProduto = new ArrayList<>();
		lProduto.add(livro1);
		lProduto.add(livro2);
		lProduto.add(cd1);
		lProduto.add(cd2);
		lProduto.add(dvd1);
		
		for (Produto produtos : lProduto) {
			System.out.println(produtos.imprimirDados());
		}
		
		for (Produto produto : lProduto) {
			System.out.println(produto.toString());
		}
		
		System.out.println(cd1.equals(cd2));
		
		buscaProdutos(cd1, lProduto);
		
		
	}
	
	private static void buscaProdutos (Produto produto, List<Produto> lProduto){
		boolean verif = false;
		for (Produto prod : lProduto) {
			if(prod.equals(produto)){
				System.out.println(lProduto.indexOf(prod));
				verif = true;
			} 
			
		}
		if (verif == false) {
			System.out.println("O produto não foi encontrado.");
		}
	}

}
