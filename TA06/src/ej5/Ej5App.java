package ej5;

import java.util.Scanner;

//Autor Eloi Martorell Martin 07/04/2022

public class Ej5App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero (puede ser decimal):");
		long decimal = (long) sc.nextFloat();
		
		System.out.println(pasarBinario(decimal));
		
		sc.close();

	}
	
	//metodo para pasar a binario
	public static String pasarBinario(long decimal) {
		
		//dividir entre 2 sucesivamente
		//apuntar el resultado (par 0 impar 1)
		//apuntar lista de ceros y unos de abajo a arriba
		
		//inspiración : https://parzibyte.me/blog/2019/04/18/decimal-a-binario-java/
		
		if (decimal <= 0) {
			return "0";
		}
		
		StringBuilder binario = new StringBuilder();
		
		while(decimal > 0) {
			
			short residuo = (short) (decimal % 2);
			decimal /= 2;
			//metemos el digito;
			binario.insert(0, String.valueOf(residuo));
		}
		
		return binario.toString();
		
	}

}