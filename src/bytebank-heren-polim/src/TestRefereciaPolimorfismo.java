public class TestRefereciaPolimorfismo {
    public static void main(String[] args) {
        //Como Gerente hereda de Funcionario
        //Todo gerente "es un" funcionario
        //El elemento más generico (funcionario) puede ser adaptado al elemento más especifico (gerente)
        //Todos los gerentes son funcionarios...
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Diego");

        //Los funcionarios no son gerentes
        /*Gerente gerente = new Funcionario();*/
        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        funcionario.setSalario(2000);
        gerente.setSalario(5000);

        //Los metodos de gerente no apareceran en el funcionario
        //porque la referencia de funcionario no incluye sus métodos
        /*funcionario.iniciarSesion("111"):*/

    }
}
