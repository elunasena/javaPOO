public class Cliente {
    private String nombre;
    private String documento;
    private String telefono;

    //Constructor
    //Constructor por defecto
    public Cliente () {

    }

    //Geeters and Setters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
