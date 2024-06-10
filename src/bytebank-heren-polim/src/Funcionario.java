public class Funcionario {

    private String nombre;
    private String documento;
    private double salario;

    public Funcionario(){
        System.out.println("Se ingresa al constructor Funcionario");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacion(){
        double factor = 0.05;
        return this.salario*factor;
    }
}
