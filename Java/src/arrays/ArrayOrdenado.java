package arrays;

import java.util.Arrays;

public class ArrayOrdenado {
	public static void main(String[] args) {
		Array array = new Array();
		
		Arrays.sort(array.numeros);
		
		for(int numero : array.numeros){
			System.out.println(numero);
	    }
	

	}
}
