package RepasoEyS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import RepasoEyS.*;


public class RepasoEyS {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Suma suma = new Suma();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.printf("***Haciendo uso de la clase Suma*** \n");

		System.out.printf("Ingrese un número 1: ");
		int x1 = Integer.parseInt(br.readLine());
		
		System.out.printf("Ingrese un número 2: ");
		int x2 = Integer.parseInt(br.readLine());
		
		System.out.printf("\nSuma= %d\n", + suma.sumar(x1,x2));
		System.out.printf("La suma es: %d\n", + (x1+x2));

		//Se llama al método saludos desde suma
		suma.saludo();


		int i=1, v1 = 1, v2 = 100, random=0, acum=0;
		do {
			random = (int) ((Math.random() * v2));
			if (random>v1 && random<v2) {
				System.out.println(random);
				i++;
			}
			acum++;
		}while (i<=10);
		System.out.printf("\n Se realizaron %d iteraciones", acum);

	}
	}

