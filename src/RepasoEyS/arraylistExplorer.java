package RepasoEyS;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraylistExplorer {

    public static void main(String[] args) throws IOException {
        BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<>();
        boolean bandera = true;

        do
        {
            verMenu();
            int n = Integer.parseInt(t.readLine());
            switch (n)
            {
                case 1:
                    System.out.print("Ingrese el valor (entero) que desea añadir a la lista: ");
                    n = Integer.parseInt(t.readLine());
                    addValue(array, n);
                    break;
                case 2:
                    getValuesArray(array);
                    break;
                case 3:
                    System.out.print("Ingrese el valor que desea consultar en la lista: ");
                    n = Integer.parseInt(t.readLine());
                    containsValue(array, n);
                    break;
                case 4:
                    System.out.print("Ingrese el indice del elemento de la lista que desea cambiar: ");
                    int index = Integer.parseInt(t.readLine());
                    System.out.print("Ingrese el valor del indice que desea cambiar: ");
                    n = Integer.parseInt(t.readLine());
                    replaceValue(array, index, n);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8: bandera = false;
                    break;
                default:
                    System.out.print("\n¡Valor no válido!\nIngrese un valor que se especifique en el menú. ");
                    bandera = true;

            }


        } while (bandera);




    }

    public static void verMenu()
    {
        System.out.print("**************Menú***************");
        System.out.print("\n1.\tAñadir un nuevo elemento a la lista.");
        System.out.print("\n2.\tConocer cuántos y cuales son los elementos exitentes de la lista.");
        System.out.print("\n3.\tConsultar sí existe un  elemento en la lista.");
        System.out.print("\n4.\tReemplazar un elemento de la lista.");
        System.out.print("\n5.\tRemover un elemento de la lista.");
        System.out.print("\n7.\tRemover todos los elementos de la lista.");
        System.out.print("\n8.\tPara salir.\n");
        System.out.print("********************************\nIngrese opción: ");

    }

    public static void addValue(ArrayList<Integer> array, Integer a)
    {
        array.add(a);
    }

    public static void getValuesArray(ArrayList<Integer> array)
    {
        System.out.printf("Tamaño de la lista: %d\n",array.size());
        System.out.printf("Valores de la lista:\n");
        for (int i = 0; i < array.size(); i++)
        {
            System.out.printf("array[%d]:\t%d\n", i, array.get(i));
        }
    }

    public static void containsValue(ArrayList<Integer> array, int num)
    {
        boolean value = array.contains(num);
        String result = (value==true) ? "Valor encontrado en el indice: " + array.indexOf(num) : "No se encuentra el valor en la lista.\n";
        System.out.print(result);
    }

    public static void replaceValue (ArrayList<Integer> array, int index, int value)
    {
        int n = array.get(index);//manejar excepción*** java.lang.IndexOutOfBoundsException
        array.set(index, value);//Manejar excepción*** java.lang.IndexOutOfBoundsException
        System.out.printf("¡Lista actualizada!\n Se reemplazó el valor %d por %d en el indice %d de la lista...", n, value, index);
        getValuesArray(array);
    }


}
