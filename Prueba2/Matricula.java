package Cadenas;

import java.util.Scanner;

public class Matricula {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame una matricula");
		
		String matricula=sc.next();
		if(esMatricula(matricula)) {
			System.out.println("Matricula correcta");
		}else {
			System.out.println("Matricula incorrecta");
		}
	
	}
	public static boolean esMatricula(String mat) {
		if(mat.length()!=7) {
			return false;
		}else {
			for(int i=0; i<=3;i++) 
				if(!Character.isDigit(mat.charAt(i)))
					return false;
				
				for(int i=4; i<=6;i++) 
					if(!Character.isUpperCase(mat.charAt(i)))
						return false;
				
			
		}
		return true;
	}
}
