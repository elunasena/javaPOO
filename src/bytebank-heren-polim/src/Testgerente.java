public class Testgerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setClave("1234");
        System.out.println(gerente.iniciarSesion("1234"));
    }
}
