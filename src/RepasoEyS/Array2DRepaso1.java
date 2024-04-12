package RepasoEyS;

public class Array2DRepaso1 {

	// Si estás trabajando con un array de tipos primitivos (como int, double, etc.), los valores se inicializarán a sus valores predeterminados (0 para int, 0.0 para double, etc.) en lugar de null. 

	
	public static void main(String[] args) {
		
		//Declaración e inicialización de matriz 4x4
		int [][] matriz = new int [4][4];
		
		
		
		//matriz de 4x4 inicializada
		int [][] m1  = {{87, 96, 70, 80},
                {68, 87, 90, 70},
                {94, 100, 90, 60},
                {100, 81, 82, 50}};
		
		//matriz irregular de 4x4 inicializada
				int [][] m2  = {{87, 96, 70, 80},
		                {68, 87},
		                {94, 100, 90},
		                {100, 81, 82, 50}};
		
		//llenado de la matríz con números aleatorios.
		//llenarMatriz(matriz, 15);
		
		
		//imprimir matriz con múmeros aleatorios
		imprimirMatriz(m2);
		//imprimirMatriz(m2);
		//promFilas(m2);
		promColumn(m2);
		promFilas(m2);
		

	}	
	
	static public void llenarMatriz (int [][]matriz, int n) {
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length;j++){
				matriz [i][j] = (int)(Math.random()*n);
			}
		}
	}
	
	static public void imprimirMatriz(int [][]matriz) {
		System.out.printf("\nValores de la matriz:\n");
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length;j++){
				System.out.printf("%d\t", matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	static public void promFilas(int [][] matriz){
		double [] promF = new double [matriz.length];
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz [i].length; j++) {
				promF [i] += matriz [i][j]; 
			}
			promF[i] /= matriz [i].length;
		}
		for (int j = 0; j < promF.length; j++){
			System.out.printf("\n%.2f", promF[j]);
		}
	}
	
	static public void promColumn(int [][] matriz) {
		int nColumn=0; //Variable para conocer el número de colunmas
		int []v;//Declaración de vector donde se guardará el número de valores por columna
		for(int i=0; i < matriz.length; i++) { //ciclo para conocer el número de columnas.
			for(int j=0; j <= matriz[i].length; j++ ) {
				if(j>nColumn)
				nColumn = j;
			}
		}
		v = new int [nColumn]; //se asigna el número culmnas por fila al vector
		for(int i=0; i < nColumn; i++) {
			v[i] = matriz[i].length;
		}
		System.out.println();
		for (int i = 0; i < v.length; i++) {//Ciclo para mostrar el número de valores de cada columna  
			System.out.println(v[i]);
		}
		System.out.println();
		
		double [] promCol = new double [v.length]; //Declaración e inicialización de vector para el cálculo del promedio por columna
		int [] valPorCol = new int [v.length];
		
		System.out.println("n columnas array con cero: " + promCol.length);
		
		for(int i=0; i < matriz.length; i++){//ciclo para signar la suma de los valores por colunma
			for (int j = 0; j < matriz[i].length; j++){
				promCol[j] += matriz[i][j];
				valPorCol[j] += 1; //suma cuantos valores hay por columna
				}
		}		
		for(int i = 0; i < promCol.length; i ++ ) {//promedio de los valores por culumna
			promCol[i] /= valPorCol[i];
		}
		
		for (int j = 0; j < promCol.length; j++){//impresión de los promedios de las columnas
			System.out.printf("\nPromedio de la columna %d:\t%.2f \nValores de ValPorCol[]:\t\t%d", j+1, promCol[j], valPorCol[j]);
		}
		
	}
	
	}
