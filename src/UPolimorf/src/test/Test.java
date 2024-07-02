package test;
import domain.*;

public class Test {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan",100.5);
        //System.out.println("empleado= " + empleado.obtenerDetalles());
        imprimir(empleado);


        Gerente gerente = new Gerente("Karla", 200.5, "contabilidad");
        //System.out.println("gerente: " + gerente.obtenerDetalles());
        imprimir(gerente);
    }

    //Método donde se aplica el polimorfismo
    public static void imprimir(Empleado empleado){
        System.out.println("empleado= " + empleado.obtenerDetalles());
    }


}
