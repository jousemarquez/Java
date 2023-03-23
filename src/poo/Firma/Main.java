package poo.Firma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // codigo main
        Scanner scan = new Scanner(System.in);
        float resta1 = Utilidades.restarFloat(7, 10);
        float resta2 = Utilidades.restarFloat(9, 200);
        System.out.println(resta1);
        System.out.println(resta2);
        System.out.println(Utilidades.multiplicarDouble(3.0, 4.0));


        boolean loEs = Utilidades.esPar(8);
        System.out.println(loEs);


        if(Utilidades.esPar(8)) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
