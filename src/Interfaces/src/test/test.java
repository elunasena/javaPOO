package test;
import accesodatos.*;

public class test {
    public static void main(String[] args) {

        IAccesoDatos datos = new ImplimentacionMysql();
        datos.listar();

        datos = new ImplementacionOracle();
        datos.listar();

    }
}
