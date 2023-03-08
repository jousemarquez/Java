package POO.Examen;

import java.util.Scanner;

public class EjercicioCuatro {

    /*EJERCICIO 4:
    Crear un método estático que reciba un array 1D de cadenas y por cada letra del abecedario, sin contar ch, ñ o ll
    (doble ele), cuente e imprima cuantas veces se repite dicha letra en el total de las cadenas recibidas. Por ejemplo:
        si

        arrEntrada = [“Hola”, “hello”];

        el método imprime:

        a: 1
        b: 0
        c: 0
        d: 0
        e: 1
        …
        h: 2
        …
        l: 3
        …
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String inputAbecedario = scan.nextLine();

        int[] contradorDeLetras = new int[26];
        for (int i = 0; i < inputAbecedario.length(); i++) {
            char c = inputAbecedario.charAt(i);
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                contradorDeLetras[index]++;
            }
        }

        for (int i = 0; i < contradorDeLetras.length; i++) {
            System.out.println("Cantidad de " + (char)(i + 'a') + ": " + contradorDeLetras[i]);
        }

    }

    /*NOTA PARA EL PROFESOR:
     * No he podido lanzar el método por lo que he declarado en el main y devuelve las repeticiones de letras del
     * abecedario.*/
}