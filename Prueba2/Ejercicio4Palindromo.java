package Cadenas;

import java.util.Scanner;

public class Ejercicio4Palindromo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame una numero o palabra");
		String palabra=sc.next();
		String nuevo="";
		for(int i=palabra.length()-1;i>=0;i--)
			nuevo=nuevo+palabra.charAt(i);
			//System.out.print(palabra.charAt(i));
			System.out.println(nuevo);
			if(nuevo.equalsIgnoreCase(palabra)) {
				System.out.println("Es un palíndromo");
			}else {
				System.out.println("No es un palíndromo");
			}


	}

}
