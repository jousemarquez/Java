package POO.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
        * EJERCICIO 3: Haz una clase llamada Password que siga las siguientes
        condiciones:
         Que tenga los atributos longitud y contraseña. Por defecto, la
        longitud será de 8.
         Los constructores serán los siguiente:
        o Un constructor por defecto.
         Un constructor con la longitud que nosotros le pasemos. Generará
        una contraseña aleatoria con esa longitud.
         Los métodos que implementa serán:
        o esFuerte(): devuelve un booleano si es fuerte o no, para que
        sea fuerte debe tener más de 2 mayúsculas, más de 1
        minúscula y más de 5 números.
        o generarPassword():  genera la contraseña del objeto con la
        longitud que tenga.
        o Método get para contraseña y longitud.
        o Método set para longitud.
        Ahora, crea una clase clase ejecutable:
         Crea un array de Passwords con el tamaño que tú le indiques por
        teclado.
         Crea un bucle que cree un objeto para cada posición del array.
         Indica también por teclado la longitud de los Passwords (antes de
        bucle).
         Crea otro array de booleanos donde se almacene si el password
        del array de Password es o no fuerte (usa el bucle anterior).
         Al final, muestra la contraseña y si es o no fuerte (usa el bucle
        anterior). Usa este simple formato:
        contraseña1 valor_booleano1
        contraseña2 valor_bololeano2*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = sc.nextInt();

        System.out.print("Ingrese la cantidad de contraseñas que desea generar: ");
        int cantidad = sc.nextInt();

        Password[] passwords = new Password[cantidad];
        boolean[] fuertes = new boolean[cantidad];

        // Añade tantas contraseñas
        for (int i = 0; i < cantidad; i++) {
            passwords[i] = new Password(longitud);
        }
        // Compruebas
        for (int i = 0; i < cantidad; i++) {
            fuertes[i] = passwords[i].esFuerte();
        }

        System.out.println("Contraseñas generadas:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(passwords[i].getContrasenha() + " " + fuertes[i]);
        }
    }
}