package RepasoEyS;

import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(null);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(null);

        System.out.println("Índices de los elementos nulos en la lista:");
        int index = 0;
        for (Integer element : array) {
            if (element == null) {
                System.out.println("Índice: " + index);
            }
            index++;
        }
    }
}

