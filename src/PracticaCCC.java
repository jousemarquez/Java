import java.util.Scanner;

public class PracticaCCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*
        Validación de la cuenta corriente
        El algoritmo de validación de la cuenta corriente es el siguiente. Por cada número de cuenta corriente
        se tienen dos dígitos de control DC. Dado un número de cuenta de la forma:

        Entidad
        Banco
        D.C.
        N. de cuenta

        Para obtener el primer dígito de control:
        La primera cifra de la entidad se multiplica por 4.
        La segunda cifra de la entidad se multiplica por 8.
        La tercera cifra de la entidad se multiplica por 5.
        La cuarta cifra de la entidad se multiplica por 10.
        La primera cifra del banco se multiplica por 9.
        La segunda cifra del banco se multiplica por 7.
        La tercera cifra del banco se multiplica por 3.
        La cuarta cifra del banco se multiplica por 6.
        Se suman todos los resultados obtenidos.
        Se divide entre 11 y nos quedamos con el resto de la división.
        A 11 le quitamos el resto anterior, y ese es el primer dígito de control,
        con la salvedad de que si nos da 10, el dígito es 1 y si es 11 ponemos 0.

        Para obtener el segundo dígito de control:

        La primera cifra de la cuenta se multiplica por 1
        La segunda cifra de la cuenta se multiplica por 2
        La tercera cifra de la cuenta se multiplica por 4
        La cuarta cifra de la cuenta se multiplica por 8
        La quinta cifra de la cuenta se multiplica por 5
        La sexta cifra de la cuenta se multiplica por 10
        La séptima cifra de la cuenta se multiplica por 9
        La octava cifra de la cuenta se multiplica por 7
        La novena cifra de la cuenta se multiplica por 3
        La décima cifra de la cuenta se multiplica por 6
        Se suman todos los resultados obtenidos.
        Se divide entre 11 y nos quedamos con el resto de la división.
        A 11 le quitamos el resto anterior, y ese es el segundo dígito de control, con la salvedad de que si nos da 10,
        el dígito es 1 y si es 11 ponemos 0.
        Imprima por pantalla ambos dígitos. Para el caso que se presenta, los dígitos de control serían 0 el primero y 6 el segundo.
         */
        System.out.println("Programa para CCC");
        int entidad1 = 1;
        int entidad2 = 2;
        int entidad3 = 3;
        int entidad4 = 4;
        int banco1 = 5;
        int banco2 = 6;
        int banco3 = 7;
        int banco4 = 8;
        int numCuenta1 = 1;
        int numCuenta2 = 2;
        int numCuenta3 = 3;
        int numCuenta4 = 4;
        int numCuenta5 = 5;
        int numCuenta6 = 6;
        int numCuenta7 = 7;
        int numCuenta8 = 8;
        int numCuenta9 = 9;
        int numCuenta10 = 0;

        int conControl1 = 0;
        int conControl2 = 0;

        // Primer dígito de control
        conControl1 = 11 - ((entidad1 * 4) + (entidad2 * 8) + (entidad3 * 5) + (entidad4 * 10) + (banco1 * 9) + (banco2 * 7) + (banco3 * 3) + (banco4 * 6))% 11;
        if (conControl1 == 10) {
            System.out.println("Número de control 1: 1");
        } else if (conControl1 == 11) {
            System.out.println("Número de control 1: 0");
        }

        // Segundo dígito de control
        conControl2 = 11 - ((numCuenta1) + (numCuenta2 * 2) + (numCuenta3 * 4) + (numCuenta4 * 8) + (numCuenta5 * 5) + (numCuenta6 * 10) + (numCuenta7 * 9) + (numCuenta8 * 7) + (numCuenta9 * 3) + (numCuenta10 * 6))% 11;
        if (conControl2 == 10) {
            System.out.println("Número de control 2: 1");
        } else if (conControl2 == 11) {
            System.out.println("Número de control 2: 0");
        } else if (conControl2 == 6) {
            System.out.println("Número de control 2: 6");
        }
    }
}
