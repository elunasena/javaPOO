public class TestFuncionario {

    public static void main(String[] args) {

        Funcionario diego = new Funcionario();
        diego.setNombre("Diego");
        diego.setDocumento("1214718347");
        diego.setSalario(1000);
        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }

}
