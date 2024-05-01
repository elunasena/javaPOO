package RepasoEyS;

public class Array1DAjustePorReferencia {

	public static void main(String[] args) {

		int n=10;

		//Declaración de arrays unidimensionales
		int [] v, v2, acum;
		double [] random, vsum;
		//Creación de arrays unidimensional con tamaño n
		v = new int[n];
		//Creación de vectores unidimiensionales con tamaño asociado al vector [] v
		v2 = new int[v.length];
		acum = new int [v.length];
		vsum = new double[v.length];
		random = new double [v.length];

		//impresión del tamaño del vector
		System.out.printf("Tamaño de los vectores creados:\nv:\t\t%d\nv2:\t\t%d\nrandom:\t%d\n", v.length, v2.length, random.length);

		//llenado de los vectores de 0 a n con Math.random()
		for (int i = 0; i < v.length;i++ ) {
			v[i] = i+1;
			v2[i] = v[i]*2;
			random[i] = Math.round(Math.random()*(n));
			vsum[i] = v[i] + v2[i] + random[i];
			acum[i] = 0;
		}

		//Ajuste del vector random[] mediante métodos...
		if (comprobarCerosArray(random) == true){
			System.out.println("\nEl arreglo rand[] tuvo corrección en uno de sus subindices para no guardar un cero y evitar un error...");
			corregirArrayDeCeros(random);
			imprimirArrayCorregido(random);
		}

		//distribución de valores random
		for(int i = 0; i < random.length; i++) {
			acum[(int) random[i] - 1] += 1;
		}

		//System.out.printf("\n\nv[]\tvf[]\trand[]\tvsum[]\tacum[]\n");
		System.out.printf("\n\nv[]\trand[]\tacum[]\tv2[]\tvsum[]\n");
		for(int i = 0; i < v.length; i++) {
			//System.out.printf("%2d\t%2d\t%.1f\t%.1f\t%3d\n", v[i], v2[i], random[i], vsum[i], acum[i]);
			System.out.printf("%2d\t%3d\t\t%3d\t\t%2d\t\t%.1f\n", v[i], ((int)random[i]), acum[i], v2[i], vsum[i]);
		}

	}

	static boolean comprobarCerosArray(double [] array) {
		for(int i = 0; i < array.length; i++) {
			if (array[i]==0){
				return true;
			}
		}
		return false;
	}

	static void corregirArrayDeCeros(double [] array) {
		System.out.println("\n\trandom[]");
		//Se imprime el array inicial pasado como argumento
		for(int i = 0; i < array.length; i++) {
			System.out.printf("[%d]:\t%.1f\n", i, array[i]);
		}

		for(int i = 0; i < array.length; i++) {
			if (array[i]==0){
				array[i]=(nuevoValor(array.length));;
			}
		}
	}

	static void imprimirArrayCorregido(double [] array) {
		System.out.println("\n\trandomCorregido[]");
		for(int i = 0; i < array.length; i++) {
			System.out.printf("[%d]:\t%.1f\n", i, array[i]);
		}
	}

	static double nuevoValor(int n) {
		double valor;
		do
		{
		valor = Math.round(Math.random()*(n));
		} while (valor < 1);
		return valor;
	}

}
