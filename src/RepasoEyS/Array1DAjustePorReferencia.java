package RepasoEyS;

public class Array1DAjustePorReferencia {

	public static void main(String[] args) {

		int n=10;

		//Declaración y creación de arrays unidimensionales con tamaño n
		int [] v, v2, acum;
		v = new int[n];
		v2 = new int[v.length];
		acum = new int [v.length];
		double [] random, vsum;
		vsum = new double[v.length];
		random = new double [v.length];

		//impresión del tamaño del vector
		System.out.printf("v:\t%d\nv2:\t%d\nrandom:\t%d\n", v.length, v2.length, random.length);

		//llenado de los vectores
		for (int i = 0; i < v.length ;i++ ) {
			v[i] = i+1;
			v2[i] = v[i]*2;
			random[i] = Math.round(Math.random()*(n));
			vsum[i] = v[i] + v2[i] + random[i];
			acum[i] = 0;
		}

		//Ajuste del vector random[] mediante métodos...
		if (comprobarCerosArray(random) == true){
			System.out.println("\nEl arreglo rand[] tuvo corrección en uno de sus subindices para no generar error...");
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
			System.out.printf("%2d\t%3d\t%3d\t%2d\t%.1f\n", v[i], ((int)random[i]), acum[i], v2[i], vsum[i]);
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

	static double nuevoValor(double n) {
		double valor;
		do
		{
		valor = Math.round(Math.random()*(n));
		} while (valor < 1);
		return valor;
	}

}
