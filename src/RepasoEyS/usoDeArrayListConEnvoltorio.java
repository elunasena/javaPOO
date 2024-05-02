package RepasoEyS;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class usoDeArrayListConEnvoltorio
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{

		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> array = new ArrayList<>();

		System.out.printf("¿Desea añadir un valor al array? (1. Sí, 2. No.):\t");
		int n = Integer.parseInt(t.readLine());
		boolean bandera;
		bandera = (n==1)? true : false;

		while (bandera == true)
		{
			System.out.printf("Ingrese el valor (entero) a añadir al array: ");
			int x = Integer.parseInt(t.readLine());
			array.add(x);

			System.out.printf("¿Desea añadir un valor al array? (1. Sí, 2. No.):\t");
			n = Integer.parseInt(t.readLine());
			bandera = (n==1)? true : false;
		}

		for (int i = 0; i < array.size(); i++){
			System.out.printf("\narray[%d]: %d.", i, array.get(i));
		}

	}
	
	
}
