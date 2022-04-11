package ej12;

import java.util.Random;
import java.util.Scanner;

//Autor Eloi Martorell Martin 10/04/2022

public class ej12App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //he intentado hacer un metodo para crear el array pero solo me deja invocar el scaner una vez
		
		System.out.println("Introduce el tamaño del array: ");
		int arraySize = sc.nextInt();
		
		int array[] = new int[arraySize];
		
		int digito = 0;
		boolean digitoCheck = false;
		
		while (!digitoCheck) {
			System.out.println("Introduce solo un digito: ");
			digito = sc.nextInt(); // en caso que tuviera esto en un metodo me da error el sc, al igual se puede arreglar con un metodo que use el scanner para todo,
			//otros ejercicios intentaré ver si se puede hacer
			
			if(digito < 10 && digito > -1)
				digitoCheck = true;
		}
		
		array = rellenarArray(array);
		int arrayDigito[] = comprobarDigito(array, digito);
		

			System.out.print("De los " + arraySize + " numeros generados, ");
			imprimirArray(arrayDigito);
			System.out.print(" terminan con el numero " + digito + ".");
		
		
		sc.close();

	}
	
	//metodo para imprimir array
	public static void imprimirArray (int array[]) {
		
		for (int i = 0; i < array.length; i++) 
			System.out.print(array[i] + " ");
		
		
	}
	
	//metodo para generar arrays aleatorios
	private static int[] rellenarArray(int array[]) {
		Random r = new Random(); //le asignamos valores aleatorios
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(300) + 1;
			//System.out.println(array[i]); //testeo
		}
		return array;
		
	}
	
	//metrodo comprobar digito
	public static int[] comprobarDigito(int array[], int digito) {
		int counter = 0;
		int x = 0;
		//recorremos el array y si terminan con el digito introducido
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] % 10 == digito)
				counter++;
			
		}
		
		int arrayDigito[] = new int [counter];
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] % 10 == digito)
				arrayDigito[x++] = array[i];
			
		}
		
		return arrayDigito;
		
	}

}
