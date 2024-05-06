package RepasoEyS;

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
                case 4: //se debe realizar manejo de excepciones cuando se vea el tema
                    getValuesArray(array);
                    System.out.print("Ingrese el indice del elemento de la lista que desea cambiar: ");
                    int index = Integer.parseInt(t.readLine());
                    System.out.print("Ingrese el valor del indice que desea cambiar: ");
                    n = Integer.parseInt(t.readLine());
                    replaceValue(array, index, n);
                    getValuesArray(array);
                    break;
                case 5: //se debe realizar manejo de excepciones cuando se vea el tema
                    getValuesArray(array);
                    System.out.print("Ingrese el índice del elemento que desea remover de la lista: ");
                    n = Integer.parseInt(t.readLine());
                    removeElement(array, n);
                    getValuesArray(array);
                    break;
                case 6:
                    removeAll(array);
                    break;
                case 7:
                    bandera = false;
                    System.out.print("VALORES FINALES DE LA LISTA: \n");
                    getValuesArray(array);
                    break;
                default:
                    System.out.print("¡Valor no válido!\nIngrese uno de los valores indicados en el menú.\n");
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
        System.out.print("\n6.\tRemover todos los elementos de la lista.");
        System.out.print("\n7.\tPara salir.\n");
        System.out.print("********************************\nIngrese opción: ");

    }

    public static void addValue(ArrayList<Integer> array, Integer a)
    {
        array.add(a);
    }

    public static void getValuesArray(ArrayList<Integer> array)
    {
        System.out.printf("Tamaño de la lista: %d\n",array.size());
        System.out.print("Valores de la lista:\n");
        for (int i = 0; i < array.size(); i++)
        {
            System.out.printf("array[%d]:\t%d\n", i, array.get(i));
        }
        /*Obteniendo los datos del arreglo con el bucle for each
        System.out.print("valores del arreglo:\n");
        for (Integer i : array){
            System.out.printf("%d\n", i);
        }*/
    }

    public static void containsValue(ArrayList<Integer> array, int num)
    {
        boolean value = array.contains(num);
        String result = (value) ? "Valor encontrado en el indice: " + array.indexOf(num) + "\n" : "No se encuentra el valor en la lista.\n";
        System.out.print(result);
    }

    public static void replaceValue (ArrayList<Integer> array, int index, int value)
    {
        int n = array.get(index);//manejar excepción*** java.lang.IndexOutOfBoundsException
        array.set(index, value);//Manejar excepción*** java.lang.IndexOutOfBoundsException
        System.out.printf("¡Lista actualizada!\n Se reemplazó el valor %d por %d en el indice %d de la lista...", n, value, index);
        getValuesArray(array);
    }

    public static void removeElement (ArrayList<Integer> array, int n)
    {
        array.remove(n);
    }

    public static void removeAll (ArrayList<Integer> array)
    {
        if (array.size() > 0 ) {
            while (array.size() > 0)
            {
                array.remove(array.size() - 1);
            }
        } else
        {
            System.out.print("¡La lista se encuentra vacia!\n");
        }
        getValuesArray(array);
    }
}
