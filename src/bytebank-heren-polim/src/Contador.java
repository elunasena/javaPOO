public class Contador extends Funcionario {

    public Contador (){
        System.out.println("Se ingresa al constructor Contador");
    }

    @Override
    public double getBonificacion() {
        return super.getBonificacion();
    }
}
