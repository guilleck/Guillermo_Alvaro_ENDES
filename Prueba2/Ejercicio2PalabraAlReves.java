package Cadenas;

import java.util.Scanner;

public class Ejercicio2PalabraAlReves {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame una palabra");
		String palabra=sc.next();
		for(int i=palabra.length()-1;i>=0;i--)
			System.out.print(palabra.charAt(i));

	}

}
