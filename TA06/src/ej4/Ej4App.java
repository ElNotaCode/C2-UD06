package ej4;

import java.util.Scanner;

//Autor Eloi Martorell Martin 07/04/2022

public class Ej4App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int numero = sc.nextInt();
		
		if (numero >= 0) {
		System.out.println("El resultado es " + calcularFactorial(numero));
		}else {
			System.out.println("Introduce un numero natural.");
		}
		
		sc.close();
	}
	
	//metodo factorial
	public static long calcularFactorial(int numero) {
		
		long fact = 1; // con numeros grandes va mal
		//for
		for (int i = 1; i <= numero; i++) {
			fact *= i;
		}
		
		return fact; //testeado con 4, 5, 6 y 10.
		
	}

}