public class TestReferencia2 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cuenta  cuenta1 = new Cuenta();

        cliente1.setNombre("Diego");
        cuenta1.setTitular(cliente1);

        System.out.println(cuenta1.getTitular().getNombre());

    }

}
