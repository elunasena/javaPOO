public class Principal {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setSaldo(1000);

        Cuenta cuenta2 = new Cuenta();
        cuenta2.setSaldo(1000);

        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuenta2.getAgencia());

    }

}
