package ej3;

import java.util.Scanner;

//Autor Eloi Martorell Martin 07/04/2022

public class Ej3App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int numero = sc.nextInt();
		
		if(numeroPrimo(numero)) {
			System.out.println("Es un numero primo.");
		}else {
			System.out.println("No es un numero primo.");
		}
		
		sc.close();
	}
	
	//metodo numero primo
	
	public static boolean numeroPrimo(int num) {
		
		//operación
		if (num <= 1) {
			return false;
		}else {
			for (int i = 2; i < num; i++)
				if(num%i == 0)
					return false;
			return true;
		}
		
	}

}