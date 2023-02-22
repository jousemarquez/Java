package POO.CuentasBancarias;

public class Main {
    public static void main(String[] args) {

        CCC cuenta1 = new CCC("Jorge", 1000);
        CCC cuenta2 = new CCC("Juan", 10);
        System.out.println("*************");
        System.out.println(cuenta1);
        System.out.println(cuenta2.toString());
        System.out.println(cuenta1.getNumeroDeCuenta());
        System.out.println(cuenta2.getNumeroDeCuenta());
        cuenta1.setReintegro(100);
        cuenta1.setIngreso(10);
        System.out.println(cuenta1);
        String[] datos = cuenta1.getDatosCuenta();
        System.out.println("Primer dato de cuenta1: " + datos[0]);
        System.out.println("Primer dato de cuenta2: " + datos[1]);
        System.out.println("Primer dato de cuenta3: " + datos[2]);

        // Respuesta de transferencia
        OperacionesBanco.transferir(cuenta1,cuenta2,450);
        System.out.println(cuenta1.getSaldoDeCuenta());
    }
}