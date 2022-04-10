package ej7;

import java.util.Scanner;

//Autor Eloi Martorell Martin 07/04/2022

public class Ej7App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de euros €");
		double cantidad = sc.nextDouble();
		
		System.out.println("Convertir a libras £, dolares $ o yenes ¥");
		String moneda = new String(sc.next());
		
		conversor(cantidad,moneda.toUpperCase()); //to upper case para control
		
		sc.close();

	}
	
	//conversor (tasas en la actualidad)
	public static void conversor(double cantidad, String moneda) {
		
		//switch
		switch (moneda) {
		case "LIBRAS":
			System.out.println(cantidad + "€ equivalen a " + (cantidad * 0.83) + " libras £");

			break;
		case "DOLARES":
			System.out.println(cantidad + "€ equivalen a " + (cantidad * 1.09) + " dolares $");
			
			break;
		case "YENES":
			System.out.println(cantidad + "€ equivalen a " + (cantidad * 134.97) + " yenes ¥");
			
			break;

		default:
			System.out.println("Introduce libras £, dolares $ o yenes ¥"); //control
			break;
		}
		
	}

}
