package Matrices;

import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el numero de filas");
		int nFilas=sc.nextInt();//matriz.length
		System.out.println("Dame el numero de columnas");
		int nCol=sc.nextInt();//matriz[0].length
		
		do {
			System.out.println("Dame el numero de filas");
			 nFilas=sc.nextInt();
			System.out.println("Dame el numero de columnas");
			 nCol=sc.nextInt();
		}while(nFilas<0 || nCol<0 || nFilas <1 || nCol<1 || nFilas>10 || nCol>10);
		
	
		//Comprobar que son correctos
		int [][]matriz=new int[nFilas][nCol];
		generarMatriz(matriz);
		
		//Imprimir matriz
		imprimeMatriz(matriz);
		
		//Buscar numero
		int numero=0;
		System.out.println("\r Dame un numero y te digo donde esta");
		numero=sc.nextInt();
		buscarMatriz(numero,matriz);
		
		//Suma mayor
		filasumaMayor(matriz);
		
		//Cuadrada
		if(esCuadrada(matriz)) {
			System.out.println( "Es cuadrada");
		}else {
			System.out.println("No es cuadrada");
		}
	
	
		//Suma pares
		sumaPares(matriz);
		
		//Suma impares
		sumaImpares(matriz);
		
		//Suma diagonal
		sumaDiagonal(matriz);
		
		//Convertir en triangular superior
		convierteTriangularSuperior(matriz);
	}

	 public static void convierteTriangularSuperior(int [][]m) {
			for(int i=0; i<m.length;i++) {
				for(int j=0; j<m[0].length;j++) {
					if(i<j)
						m[i][j]=0;
				}
			}
	 }
	private static void sumaDiagonal(int[][] matriz) {
		int suma=0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				if(matriz[i]==matriz[j]) {
					suma+=matriz[i][j];
				}
		}
	}
		System.out.println("La suma de la diagonal es: "+suma);
		
	}

	private static void sumaImpares(int[][] matriz) {
		int suma=0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				if(matriz[i][j]%2==1) {
					suma=suma+matriz[i][j];
				}
		}
	}
		System.out.println("La suma de los impares es: "+suma);
		
	}

	private static void sumaPares(int[][] matriz) {
		int suma=0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				if(matriz[i][j]%2==0) {
					suma=suma+matriz[i][j];
				}
		}
	}
		System.out.println("La suma de los pares es: "+suma);
}

	private static boolean esCuadrada(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				if(matriz.length==matriz[0].length) {
					return true;
				}else {
					return false;
				}
			
		}	
	}
		return false ;
}

	private static void filasumaMayor(int[][] matriz) {
		int suma=0;
		int mayor=0;
		for(int i=0; i<matriz.length; i++) {
			suma=matriz.length+matriz.length;
			
		}
		System.out.println("La suma de la fila mayor es: "+suma);
	}

	private static void buscarMatriz(int numero,int[][] matriz) {
		int contador=0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
			if(matriz[i][j]==numero) {
				System.out.println("Se ha encontrado el numero en la posicion " +i+ " - "+j);
				contador++;
			}
			}	
		}
		System.out.println("El numero se ha encontrado "+contador+ " veces");
	}

	private static void imprimeMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			System.out.println();
			for(int j=0; j<matriz[0].length; j++) {
				 System.out.print(matriz[i][j]+"\t ");
			}
		}
		
	}

	private static void generarMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				matriz[i][j]=(int)(Math.random()*21);
			}
		}
		
		
	}

}
