package ej12;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

//Autor Eloi Martorell Martin 10/04/2022

public class ej12App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //he intentado hacer un metodo para crear el array pero solo me deja invocar el scaner una vez
		
		System.out.println("Introduce el tamaño del array: ");
		int arraySize = sc.nextInt();
		
		int array[] = new int[arraySize];
		boolean digitoCheck = false;
		
		while (!digitoCheck) {
			System.out.println("Introduce solo un digito: ");
			int digito = sc.nextInt();
			
			if(digito < 10 && digito > -1)
				digitoCheck = true;
		}
		
		array = rellenarArray(array);
		
		sc.close();

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
	
	//metodo recorrer el array y generar uno nuevo a partir de lo sacado

}
