public class testControlBonificacionPolimorf {
    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setSalario(2000);
        Gerente gerente = new Gerente();
        gerente.setSalario(10000);
        Contador alexis = new Contador();
        alexis.setSalario(2000);

        ControlBonificacionPolimosfismo controlBonifi = new ControlBonificacionPolimosfismo();
        controlBonifi.registrarSalario(diego);
        controlBonifi.registrarSalario(gerente);
        controlBonifi.registrarSalario(alexis);



    }
}
