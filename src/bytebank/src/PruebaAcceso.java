public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        System.out.println(cuenta.getTitular());
        System.out.println(cliente);
        cuenta.setTitular(cliente);
        System.out.println("************");
        System.out.println(cuenta.getTitular());
        System.out.println(cliente);
        System.out.println(cuenta.getTitular().getNombre());

    }
}
