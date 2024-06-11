public class CuentaCorriente extends Cuenta{

    //Constructor heredado
    //super llama al constructor de la clase padre
    public CuentaCorriente(int agencia, int numero){
        //Supper accede a los métodos de la clase padre.
        super(agencia, numero);
    }

    //Metodos


    @Override
    public boolean saca(double valor) {
        double comision = 0.5;
        return super.saca(valor+comision);
    }
}
