public abstract class Cuenta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    //variable de la clase (no de la instancia)
    private static int total = 0;


    //Constructor por defecto
    public Cuenta () {
        total++;
        System.out.println("Cuenta No. " + total);
    }

    //Constructor
    public Cuenta (int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        Cuenta.total++;
    }

    //Getters and Setters
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
        else
        {
            System.out.println("No se permiten valores negativos");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }



    //Métodos...

    //Método estático de la clase para obtener el número de cuentas instanciadas
    public static int getTotal (){
        return total;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
}
