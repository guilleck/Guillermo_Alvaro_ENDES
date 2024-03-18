package Matrices;

public class Ejercicio1HacerMatriz {

	public static void main(String[] args) {
		int nFilas=3;
		int nColumnas=4;
		int numero=1;
		int matriz[][]=new int [nFilas][nColumnas];
		
		for(int i=0; i<nFilas;i++) {
			for(int j=0;j<nColumnas; j++) {
				matriz[i][j]=numero;
				numero++;
			}
		}
		for(int i=0; i<nFilas; i++) {
			System.out.println();
			for(int j=0;j<nColumnas; j++) {
				System.out.print(matriz[i][j]+ "\t");
				
			}
		}
	}

}
