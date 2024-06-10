public class ControlBonificacionPolimosfismo {
    private double suma;

    //Aplicación de polimorfismo
    //Se usa el método que espera un Funcionario y se puede hacer uso para
    // aquellos elementos que son heredados
    public double registrarSalario(Funcionario funcionario){
        this.suma += funcionario.getBonificacion();
        System.out.printf("Calculo actual: %.2f\n",  this.suma);
        return this.suma;
    }

}
