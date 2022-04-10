package ej1;

import java.util.Scanner;

//Autor Eloi Martorell Martin 07/04/2022

public class Ej1App {

	public static void main(String[] args) {
		
		//declaramos la constante
		

		Scanner sc = new Scanner(System.in);
		//pedimos la forma
		System.out.println("Introduce la figura para calcular el area (circulo, triangulo o cuadrado):");
		String forma = new String(sc.next());
		forma = forma.toUpperCase(); //Controlamos las maneras de ponerlo
		
		switch (forma) {
		case "CIRCULO":
			
			System.out.println("Introduce el radio:");
			double r = sc.nextDouble();
			
			System.out.println("El area del circulo es " + areaCirculo(r));
			
			break;
		case "TRIANGULO":
			
			System.out.println("Introduce la base:");
			double b = sc.nextDouble();
			
			System.out.println("Introduce la altura:");
			double a = sc.nextDouble();
			
			System.out.println("El area del triangulo es " + areaTriangulo(b, a));
			
			break;

		case "CUADRADO":
			
			System.out.println("Introduce el lado de el cuadrado: ");
			double c = sc.nextDouble();
			System.out.println("El area del cuadrado es: " + areaCuadrado(c));
	
			break;
			
		default:
			System.out.println("La figura que has introducido no es correcta!");
			break;
		}
		
		sc.close();

	}
	
	//creamos los metodos antes que nada
	public static double areaCirculo(double r) {
		
		final double PI = 3.14;
		return (r*r)*PI;
	}
	
	public static double areaTriangulo(double b, double a) {
		
		return (b*a)/2;
	}
	
	public static double areaCuadrado(double l) {
		
		return l*l;
	}

}
