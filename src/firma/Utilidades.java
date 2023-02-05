package firma;

public class Utilidades {

    // firma o signature
    public static void imprimirSaludo() {
        // cuerpo del metodo o implementacion
        System.out.println("Hola");
    }

    public static void imprimirSaludo(String saludo) {
        System.out.println(saludo);
    }

    public static int sumarEnteros(int entero1, int entero2) {
        // 1 sumar los numeros
        int res = entero1 + entero2;
        // 2 devolver el resultado
        return res;
    }

    // Crear un metodo que reciba dos numeros float y devuelva la resta de ambos numeros.
    public static float restarFloat(float minuendo, float sustraendo) {
        return (minuendo - sustraendo);
    }

    // Crear un metodo que reciba dos numeros double y devuelva la multiplicacion de ambos numeros.
    public static double multiplicarDouble(double num1, double num2) {
        return num1 * num2;
    }

    // Crear un metodo que reciba un entero y devuelva un booleano indicando si el numero es par o no.
    public static boolean esPar(int numero) {

        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
        /*
        if (numero % 2 == 0) {
            return true;
        }
        return false;
        return numero % 2 == 0;
        */
    }
}
