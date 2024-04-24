package RepasoEyS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import RepasoEyS.*;


public class RepasoEyS {

	public static void main(String[] args) throws NumberFormatException, IOException {

		suma suma = new suma();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Hola, probemos usar el método sumar de sde suma.java: \n");

		System.out.println("Ingrese un número 1: ");
		int x1 = Integer.parseInt(br.readLine());
		
		System.out.println("Ingrese un número 2: ");
		int x2 = Integer.parseInt(br.readLine());
		
		System.out.println("Suma= " + suma.sumar(x1,x2));	
		System.out.println("La suma es: " + (x1+x2));

	
		suma.saludo();


		int i=1, v1 = 1; int v2 = 45; int random=0;
		System.out.printf("\n");
		do {
			random = (int) ((Math.random() * v2));
			if (random>v1 && random<v2) {
				System.out.println(random);
				i++;
			}
		}while (i<=5);

	}
	}

