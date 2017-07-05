package exercicios.arrays;

public class ArrayMedia {
	public static void main(String[] args) {
		Array array = new Array();
		
		int soma = 0;
		double media = 0;
		
		for(int numero : array.numeros){
			soma = soma + numero;
		}
		
		media = soma / array.numeros.length;
		System.out.println(media);
	}

}
