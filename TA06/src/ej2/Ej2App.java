package ej2;

import java.util.Random;
import java.util.Scanner;

//Autor Eloi Martorell Martin 07/04/2022

public class Ej2App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//pedir numero de numeros
		System.out.println("Cuantos numeros quieres generar?");
		int cantidad = sc.nextInt();
		
		//pedir rango de numeros
		System.out.println("Ahora el rango entre el que se van a generar.");
		System.out.println("Numero minimo:");
		int numMinimo = sc.nextInt();
		System.out.println("Numero máximo:");
		int numMaximo = sc.nextInt();
		
		generadorNumeros(cantidad,numMinimo,numMaximo);
		
		sc.close();
	}
	
	//metodo que procese la información captada y imprima los numeros en pantalla
	public static void generadorNumeros(int cantidad, int min, int max) {
		
		Random r = new Random();
		
		for (int i = 0; i < cantidad; i++) {
			
			System.out.print((r.nextInt(max-min) + min) + " ");
			
		}
		
	}
	
}
