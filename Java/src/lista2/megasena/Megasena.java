package lista2.megasena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Megasena {
	public static void main(String[] args) {
		List<Integer> aposta1 = Arrays.asList(2, 9, 10, 11, 25, 59);
		List<Integer> aposta2 = Arrays.asList(2, 9, 10, 5, 14, 59);
		List<Integer> aposta3 = Arrays.asList(12, 15, 30, 38, 39, 40);
		List<Integer> aposta4 = Arrays.asList(3, 5, 6, 10, 11, 12);
		List<Integer> aposta5 = Arrays.asList(2, 4, 8, 26, 35, 38);
		List<Integer> resultado = Arrays.asList(59, 25, 11, 9, 10, 2);
		List<Integer> apostaComparar = new ArrayList();
		
		int contador = 0;
	
		for (int opcao = 1; opcao < 6; opcao++) {
			
		switch (opcao) {
		case 1:
			apostaComparar = aposta1;
			break;
		case 2:
			apostaComparar = aposta2;
			break;
		case 3:
			apostaComparar = aposta3;
			break;
		case 4:
			apostaComparar = aposta4;
			break;
		case 5:
			apostaComparar = aposta5;
			break;

		default:
			break;
		}
			
		for (int i = 0; i < resultado.size(); i++) {
			for (int j = 0; j < apostaComparar.size(); j++) {
				if (resultado.get(i) == apostaComparar.get(j)){
					contador ++;
				}								
			}			
		}
		if (contador == 6){
			System.out.println("A aposta " + opcao + " foi a sorteada!!!!");
		}else{
			contador = 0; 
		}
		}
		

	}

}
