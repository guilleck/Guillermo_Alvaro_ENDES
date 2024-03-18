package Cadenas;

import java.util.Scanner;

public class Ejercicio7Correcto {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el NIF");
		String NIF=sc.next();
	if(esNIFCorrecto(NIF)) {
		System.out.println("NIF correcto");
	}else {
		System.out.println("NIF Incorrecto");
	}
	}			
		
	
			

	private static boolean esNIFCorrecto(String nif) {
		
		if(nif.length()==9) {//longitud bien
			//XXXXXXXXL NIF 0-7 numeros
			if(Character.isUpperCase(nif.charAt(8))) {//ultimo una letra
				for(int i=0; i<=7;i++) {
					
					if(!Character.isDigit(nif.charAt(i))) {
						return false;
					}
					
				}
			}else {
				return false;
			}
			
		}else {
			return false;
		}
		return true;
	
	
	
	}
}