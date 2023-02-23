package POO.CuentasBancarias;

public class OperacionesBanco {

    /*Método 2*/
    public static void transferir(CCC cuentaOrigen, CCC cuentaDestino, double cantidad){
        cuentaOrigen.setReintegro(cantidad);
        cuentaDestino.setIngreso(cantidad);
    }
}
