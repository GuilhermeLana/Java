package arrays;

public class ArrayMaiorNum {
	public static void main(String[] args) {
		Array array = new Array();
		
		int maior = 0;
		
		for(int numero : array.numeros){
			if(numero > maior){
				maior = numero;
			}
		}
		
		System.out.println(maior);
	}

}
