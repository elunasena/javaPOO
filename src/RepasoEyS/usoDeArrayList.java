package RepasoEyS;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class usoDeArrayList
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		System.out.printf("¿Desea crear un nuevo vector? (1. Sí, 2. No.):\t");
		int n = Integer.parseInt(entrada.readLine());
		boolean bandera;
		bandera = (n==1)? true : false;

		while (bandera == true)
		{



			System.out.printf("¿Desea agregar un nuevo vector? (1. Sí, 2. No.):\t");
			n = Integer.parseInt(entrada.readLine());
			bandera = (n==1)? true : false;
		}

	}
	
	
}
