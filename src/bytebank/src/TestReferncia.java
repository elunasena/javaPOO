public class TestReferncia {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setSaldo(200);
        Cuenta cuenta2 = cuenta1; //A Cuenta2 se asigna la referencia de cuenta1
        cuenta2.setSaldo(100); //Cambia el saldo de la primera por que la referencia de cuenta2 apunta a la referencia de cuenta1
        //Hasta aquí, las operaciones que haga a cuenta 1 o cuenta 2 afecta realmente a cuenta 1
        //Porque ambos hacen referencia a la primera cuenta


        System.out.printf("Saldo cuenta2: %.2f\n", cuenta2.getSaldo());
        System.out.printf("Saldo cuenta1: %.2f\n", cuenta1.getSaldo());
        cuenta2.depositar(100);
        System.out.println("***Se aumenta 100 a saldo de cuenta2***");
        System.out.printf("Saldo cuenta1: %.2f\n", cuenta1.getSaldo());
        System.out.printf("Saldo cuenta2: %.2f\n", cuenta2.getSaldo());
        cuenta1.depositar(100);
        System.out.println("***Se aumenta 100 a saldo de cuenta1***");
        System.out.printf("Saldo cuenta1: %.2f\n", cuenta1.getSaldo());
        System.out.printf("Saldo cuenta2: %.2f\n", cuenta2.getSaldo());
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        if (cuenta1 == cuenta2)
        {
            System.out.println("Son el mismo objeto");
        }
        else
        {
            System.out.println("No son el mismo objeto");
        }

    }
}
