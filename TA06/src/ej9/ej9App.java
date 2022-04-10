package ej9;

import java.util.Random;
import java.util.Scanner;

//Autor Eloi Martorell Martin 10/04/2022

public class ej9App {

	public static void main(String[] args) {
		// array de numeros donde indicamos por teclado el tamaño, pasamos el tamaño por parametro
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de numeros a generar:");
		int arraySize = sc.nextInt(); //lo pongo en ingles porque no me gusta pasar variables con ñ
		procesarArray(crearArrayAleatorio(arraySize));
		sc.close();

	}
	
	//metodo donde rellenamos el array con numeros aleatorios del 0 al 9
	public static int[] crearArrayAleatorio (int arraySize) {
		
		int[] arrayAleatorio = new int[arraySize];
		Random r = new Random();
		
		for (int i = 0; i < arrayAleatorio.length; i++) {
			arrayAleatorio[i] = r.nextInt(10); //le tenemos que añadir un un numero de mas
			//System.out.println(arrayAleatorio[i]); //testeo
		}
		
		return arrayAleatorio;
		
	}
	
	//metodo para mostrar cada contenido y luego sumar
	public static void procesarArray (int array[]) {
		int suma = 0; // creamos la variable para sumar y la inicializo
		System.out.println("Array generado: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Posición " + (i+1) + ": ");
			System.out.println(array[i]);
			suma += array[i];
		}
		
		System.out.println("El total del array generado es " + suma + ".");
		
	}

}
