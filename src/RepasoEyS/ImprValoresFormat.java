package RepasoEyS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImprValoresFormat {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader t = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("Ingrese un valor entero: ");
        int entero = Integer.parseInt(t.readLine());
        System.out.printf("Ingrese un valor real: ");
        double decimal = Double.parseDouble(t.readLine());
        System.out.printf("Ingrese una cadena: ");
        String cadena = new String(t.readLine());
        char caracter ='p';

        // Imprimir valores formateados
        System.out.printf("Entero: %d\n", entero);
        System.out.printf("Decimal: %.2f\n", decimal); // %.2f para imprimir dos decimales
        System.out.printf("Carácter: %c\n", caracter);
        System.out.printf("Cadena: %s\n", cadena);

    }


}
