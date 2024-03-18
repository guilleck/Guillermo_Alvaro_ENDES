package Cadenas;

import java.util.Scanner;

public class Ejercicio5LetrasQueContiene {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame una palabra");
		String palabra=sc.next();
		int contadorA=0;
		int contadore=0;
		for(int i=0; i<palabra.length();i++) {
		if(palabra.charAt(i)=='a'|| palabra.charAt(i)=='A')
			contadorA++;
		
		if(palabra.charAt(i)=='e' || palabra.charAt(i)=='E')
			contadore++;
		
		
		}
		System.out.println("Numeros de letras A: "+contadorA);
		System.out.println("Numeros de letras E: "+contadore);
	}
}
