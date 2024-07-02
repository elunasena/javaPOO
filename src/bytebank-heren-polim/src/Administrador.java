public class Administrador extends Funcionario{

    private String clave;

   public void setClave (String clave){
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == this.clave;
    }

    @Override
    public double getBonificacion() {
        return 0;
    }


}
