package POO.CuentasBancarias;

public class OperacionesBanco {

    /*Método 1*/
    public void realizarTransferenciaEntreCuentas(CCC cuentaDestino, double cantidad) {
        this.setReintegro(cantidad);
        cuentaDestino.setIngreso(cantidad);
    }

    /*Método 2*/
    public static void transferir(CCC cuentaOrigen, CCC cuentaDestino, double cantidad){
        cuentaOrigen.setReintegro(cantidad);
        cuentaDestino.setIngreso(cantidad);
    }
}
