package RepasoEyS;

        /*Crear un algoritmo que lanze compras para una tarjeta de crédito
          donde se ingrese el valor de una compra y la descripción del producto
          y que no permita exceder el valor del tope de la tarjeta.
          Una vez terminada las compras muestre la exhibición de la lista de compras
          realizadas y ordenadas por valor ascendente.
         */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ejercicioTarjeta {

    public static void main(String[] args) throws IOException {
        BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
        String texto;
        double valor;
        ArrayList<String> TCompras = new ArrayList<>(); //Array para almacenar texto de las compras.
        ArrayList<Double> VCompras = new ArrayList<>();   //Array para almacenar valores de las compras.
        System.out.print("Ingrese el valor del tope de la tarjeta:\t$");
        double topeTC = Double.parseDouble(t.readLine());
        boolean control = true;
        if (topeTC > 0) {
            do
            {
                System.out.print("Ingrese 1 para añadir una comprar ó 0 para salir:\t");
                int n = Integer.parseInt(t.readLine());
                if (n == 0) {
                    control = false;
                } else if (n != 0 && n != 1) {
                    System.out.print("¡Ingrese una opción valida!\n");
                    control = true;
                }
                else
                {
                    System.out.print("\nIngrese la descripción del ártiulo a comprar:\t");
                    texto = t.readLine();
                    System.out.print("\nIngrese el valor del artículo a comprar:\t");
                    valor = Double.parseDouble(t.readLine());
                    if (valor <= topeTC) {
                        topeTC -= valor;
                        TCompras.add(texto);
                        VCompras.add(valor);
                    }
                    else
                    {
                        System.out.println("\n¡El valor del árticulo sobre pasa el valor de su tope en la tarjeta!");
                    }
                }
            } while (control);
        }
        else{
                System.out.print("\n¡Tarjeta sin cupo!");
           }

        if (TCompras.size()==0){
            System.out.print("\n¡No se realizaron compras!");
        }
        else
        {
            //Implementar for each con salida de String de los objetos
        }

    }
}