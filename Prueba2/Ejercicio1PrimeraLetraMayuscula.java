package Cadenas;

import java.util.Scanner;

public class Ejercicio1PrimeraLetraMayuscula {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame una palabra");
		String palabra=sc.next();
		String nueva=palabra.substring(0, 1).toUpperCase()+palabra.substring(1).toLowerCase();
		System.out.println(nueva);
		
	
	}

}
