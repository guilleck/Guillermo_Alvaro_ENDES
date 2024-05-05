package Matrices;

import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio6Diagonal {

	public static void main(String[] args) {
		int nFilas=10;
		int nColumnas=10;
		int matriz [][]= new int [nFilas][nColumnas];
		

		for(int i=0; i<nFilas;i++) {
			System.out.println();
			for(int j=0;j<nColumnas; j++) {
				matriz[i][j]=(int)(1+Math.random()*100);
				System.out.print(matriz[i][j]+ "\t");
					
			}
			System.out.println();
		}
		diagonal(matriz);
		System.out.println();
		diagonalArray(matriz);
	}

	private static void diagonal(int[][] matriz) {
		System.out.println("\nDiagonal desde la esquina superior izquierda");
		System.out.println("a la esquina inferior derecha");
		int maximo= matriz[0][0];
		int minimo= matriz[0][0];
		int contador=0;
		int suma=0;
		for(int i=0; i < 10; i++) {
			int numero= matriz[i][i];
			System.out.print(numero+ "\t");
			if(numero>maximo) {
				maximo=numero;
			}
			if(numero<minimo) {
				minimo=numero;
			}
			suma=suma+numero;
			contador++;
			}
		System.out.println("\nMaximo:"+maximo);
		System.out.println("Minimo:"+minimo);
		System.out.println("Media:"+((double)suma/contador));
	}
		public static void diagonalArray(int [][]matriz) {
			int []principal=new int [10];
			for(int i=0;i<10;i++) {
				principal[i]=matriz[i][i];
				
			}
			Arrays.sort(principal);
			System.out.println("\nMaximo:"+principal[principal.length-1]);
			System.out.println("Minimo:"+principal[0]);
			double suma=0;
			for (int i = 0; i < principal.length; i++) {
				suma=suma+principal[i];
				
			}
			System.out.println("Media:"+((double)suma/principal.length));
		}
	}

