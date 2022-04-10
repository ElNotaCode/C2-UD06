package ej6;

import java.util.Scanner;

//Autor Eloi Martorell Martin 07/04/2022

public class ej6App {

	public static void main(String[] args) {
		
		//llamamos metodos
		numeroCifras(insertarIntPositivo());

	}
	
	public static int insertarIntPositivo() {
		
		Scanner sc = new Scanner(System.in);
		//variable inicializada
		int numero = 0;
		
		//hacemos el control
		while(numero <= 0) {
			System.out.println("Introduce un numero entero positivo:");
			numero = sc.nextInt();
		}
		
		sc.close();
		return numero;
		
	}
	
	//numero cifras
	public static void numeroCifras(int numero) {
		
		//pasamos el int a string
		String numeroString = new String(numero + "");		
		System.out.println("El numero introducido tiene " + numeroString.length() + " digitos");
		
	}

}
