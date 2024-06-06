public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.setSaldo(300);
        System.out.println(c1.getSaldo());
        c1.depositar(500);
        System.out.println(c1.getSaldo());

        Cuenta c2 = new Cuenta();
        c2.depositar(1000);
        System.out.println("***********");
        System.out.println(c2.getSaldo());
        c2.transferir(500,c1);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}
