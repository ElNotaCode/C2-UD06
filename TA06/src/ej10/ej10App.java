package ej10;

import java.util.Random;

//Autor Eloi Martorell Martin 10/04/2022

import java.util.Scanner;

public class ej10App {

	public static void main(String[] args) {

		System.out.println("Introduce la cantidad de numeros primos a generar:");
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		sc.close();
		
		Random r = new Random();
		int arrayPrimos[] = new int[arraySize];
		
		for (int i = 0; i < arrayPrimos.length; i++) {
			
			int rNumber = 0;
			while (!numeroPrimo(rNumber))
				rNumber = r.nextInt(100);
				
			arrayPrimos[i] = rNumber;
			//System.out.println(arrayPrimos[i]); //testeo

		}
		System.out.println();
		System.out.println("El mayor numero primo de los " + arraySize + " generados es " + calcularMayorNumero(arrayPrimos));

	}
	
	//metodo mayor numero primo
	
	public static int calcularMayorNumero(int array[]) {
		
		int n = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (n < array[i]) {
				//System.out.println(array[i]); //testeo
				n = array[i];
			}
		}
		
		return n;
		
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
