package ej5Alternativo;

import java.util.Scanner;

//Autor Eloi Martorell Martin 07/04/2022

public class Ej5AlternativoApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero (puede ser decimal):");
		long decimal = (long) sc.nextDouble();
		
		System.out.println(pasarBinario(decimal));
		
		sc.close();

	}
	
	//metodo para pasar a binario
	public static String pasarBinario(long decimal) {
		
		return Long.toBinaryString(decimal);
		
	}

}