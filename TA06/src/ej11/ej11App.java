package ej11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Autor Eloi Martorell Martin 10/04/2022

public class ej11App {

	public static void main(String[] args) {
		//array 1 con el size pedido por teclado
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array: ");
		int arraySize = sc.nextInt();
		sc.close();
		
		//creamos el array uno con numeros aleatorios
		int array1[] = new int[arraySize];
		array1 = rellenarArray(array1);
		
		//creamos el nuevo array asignandole el valor del primero
		//int array2[] = Arrays.copyOf(array1, array1.length); //también podría ser array size
		int array2[] = Arrays.copyOf(array1, array1.length);
		array2 = rellenarArray(array2);
	
		int array3[] = multiplicarArrays(array1, array2);
		
		mostrarArrays(array1, "1");
		mostrarArrays(array2, "2");
		mostrarArrays(array3, "3");

	}
	//metodo para generar arrays aleatorios
	private static int[] rellenarArray(int array[]) {
		Random r = new Random(); //le asignamos valores aleatorios
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(10) + 1;
			//System.out.println(array[i]); //testeo
		}
		return array;
		
	}
	
	
	//metodo con los dos arrays como parametro que multiplique entre ellos y cree uno nuevo con los resultados
	private static int[] multiplicarArrays(int array1[],int array2[]) {
		int[] array3 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i] * array2[i];
		}
		
		return array3;
		
	}
	
	//metodo para mostrar arrays
	private static void mostrarArrays(int array[], String numero) {
		System.out.print("Array" + numero + ": ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(); // salto de linea
	}

}
