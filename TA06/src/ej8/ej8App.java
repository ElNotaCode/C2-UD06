package ej8;

import java.util.Scanner;

public class ej8App {

	public static void main(String[] args) {
		
		//array de 10 ints
		int numeros[] = new int[10];
		pedirNumeros(numeros);
		mostrarNumeros(numeros);
		

	}
	
	//metodo para pedirlos por teclado
	public static int[] pedirNumeros(int numeros[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un numero:");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		return numeros;
	}
	
	//metodo para mostrarlos
	public static void mostrarNumeros(int numeros[]) {
		System.out.println(); // espacio
		System.out.println("Numeros introducidos: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
	}
}
