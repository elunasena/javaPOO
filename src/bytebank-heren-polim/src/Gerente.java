public class Gerente implements Autenticable{

    private String clave;

    public Gerente (){
        System.out.println("Se ingresa al constructor Gerente");
    }

    public void setClave (String clave){
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == this.clave;
    }

    public double getBonificacion (){
        //la bonificación de gerente es = su mismo salario + la bonificación asignada a un funcionario
        return super.getSalario() + this.getSalario()*0.05;
    }


}
