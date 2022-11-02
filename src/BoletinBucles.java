import java.util.Scanner;

public class BoletinBucles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("4. Crea un programa que lea un número, e imprima en una misma línea tantos ceros como diga el número." +
                "Por ejemplo: si se lee el 3 debe imprimirse: 0 0 0");
        System.out.println("Introduzca un número: ");
        int num4 = scan.nextInt();
        int incr = 0;
        while (incr < num4) { //
            System.out.print(" 0 ");
            incr++;
        }
        System.out.println("FIN");

        System.out.println("5. Modifica el ejercicio 4 para que la primera columna siempre imprima un 1." +
                "Por ejemplo, si se lee el 3 debe imprimirse: 1 0 0");
        System.out.println("Introduzca un número: ");
        int num5 = scan.nextInt();
        num5-=1;
        int incr2 = 0;
        System.out.print(" 1 ");
        while (incr2 < num5){
            System.out.print(" 0 ");
            incr2++;
        }
        System.out.println("FIN");

        System.out.println("6. Modifica el ejercicio 4 para que la última columna siempre imprima un 1." +
                "Por ejemplo, si se lee el 3 debe imprimirse: 0 0 1");
        System.out.println("Introduzca un número: ");
        int num6 = scan.nextInt();
        num6-=1;
        int incr3 = 0;
        while (incr3 < num6){
            System.out.print(" 0 ");
            incr3++;
        }
        System.out.print(" 1 ");
        System.out.println("FIN");

        System.out.println("7. Modifica el ejercicio 4 para que la columna central (o la más cercana en caso de no haber central)" +
                "siempre imprima un 1. Por ejemplo, si se lee el 3 debe imprimirse: 0 1 0");

        System.out.print("Introduce un numero: ");
        int num7 = scan.nextInt();
        for(int i=0; i < num7; i++) {
            if(i>0) {
                System.out.print("0 ");
            } else {
                System.out.print("1 ");
            }
        }
        System.out.println("FIN");

        System.out.println("8.Crea un programa que lea un número, y repita el ejercicio 4 tantas veces como diga\n" +
                "ese número. Por ejemplo: si se lee el 3 debe imprimirse:\n" +
                "0 0 0\n" +
                "0 0 0\n" +
                "0 0 0");
        System.out.println("Introduzca el número: ");
        int num8 = scan.nextInt();
        for (int i = 0; i < num8; i++) { // i controla las filas de la matriz
            for (int j = 0; j < num8; j++) { // j controla las columnas de la matriz
                System.out.print("0 ");
            }
        }
        System.out.println();
        System.out.println("FIN");

        System.out.println("9.Modifica el ejercicio 8 para que la primera línea siempre imprima unos. Por ejemplo, si\n" +
                "se lee el 3 debe imprimirse:\n" +
                "1 1 1\n" +
                "0 0 0\n" +
                "0 0 0");
        System.out.println("Introduzca el número: ");
        int num9 = scan.nextInt();
        for (int i = 0; i < num9; i++) {
            for (int j = 0; j < num9; j++){
                if (i==0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            System.out.println();
            }
        }
        System.out.println("FIN");

        System.out.println("10.Modifica el ejercicio 8 para que la primera columna siempre imprima unos. Por\n" +
                "ejemplo, si se lee el 3 debe imprimirse:\n" +
                "1 0 0\n" +
                "1 0 0\n" +
                "1 0 0");
        System.out.println("Introduzca el número: ");
        int num10 = scan.nextInt();
        for (int i = 0; i < num10; i++) {
            for (int j = 0; j < num10; j++){
                if (j==0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            System.out.println();
            }
        }

        System.out.println("11. Modifica el ejercicio 8 para que la última línea siempre imprima unos. Por ejemplo, si\n" +
                "se lee el 3 debe imprimirse:\n" +
                "0 0 0\n" +
                "0 0 0\n" +
                "1 1 1");
        System.out.println("Introduzca el número: ");
        int num11 = scan.nextInt();
        for (int i = 0; i < num11; i++) {
            for (int j = 0; j < num11; j++){
                if (i == num11-1){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }System.out.println();
        }

        System.out.println("12. Modifica el ejercicio 8 para que la última columna siempre imprima unos. Por ejemplo,\n" +
                "si se lee el 3 debe imprimirse:\n" +
                "0 0 1\n" +
                "0 0 1\n" +
                "0 0 1");
        System.out.println("Introduzca el número: ");
        int num12 = scan.nextInt();
        for (int i = 0; i < num12; i++) {
            for (int j = 0; j < num12; j++){
                if (j == num12-1){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }System.out.println();
        }*/

        System.out.println("13.Modifica el ejercicio 8 para que la primera fila y columna siempre imprima unos. Por\n" +
                "ejemplo, si se lee el 3 debe imprimirse:\n" +
                "1 1 1\n" +
                "1 0 0\n" +
                "1 0 0");
        System.out.println("Introduzca el número: ");
        int num13 = scan.nextInt();
        for (int i = 0; i < num13; i++) {
            for (int j = 0; j < num12; j++) {
                if (i == 0 || j == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }System.out.println();
        }/*

        System.out.println("14. Modifica el ejercicio 8 para que la diagonal siempre imprima unos. Por ejemplo, si se\n" +
                "lee el 3 debe imprimirse:\n" +
                "0 0 1\n" +
                "0 0 1\n" +
                "1 1 1");


        System.out.println("15. Modifica el ejercicio 8 para que el marco siempre imprima unos. Por ejemplo, si se lee\n" +
                "el 3 debe imprimirse:\n" +
                "1 1 1\n" +
                "1 0 1\n" +
                "1 1 1");


        System.out.println("16. Modifica el ejercicio 8 para que la diagonal principal siempre imprima unos. Por\n" +
                "ejemplo, si se lee el 3 debe imprimirse:\n" +
                "1 0 0\n" +
                "0 1 0\n" +
                "0 0 1");


        System.out.println("17. Leer dos enteros e imprimir una tabla o matriz de tantas filas y columnas como los\n" +
                "números leídos. La tabla o matriz solo debe contener ceros. Por ejemplo si se leen el 2\n" +
                "y 4, se imprimiría:\n" +
                "0 0 0 0\n" +
                "0 0 0 0");


        System.out.println("18. Modificar el ejercicio anterior para que contenga la sucesión 1,2,3,4,…, etc, con tantos\n" +
                "términos como posiciones tenga la tabla o matriz. Para el caso del ejercicio anterior, se\n" +
                "imprimiría:\n" +
                "1 2 3 4\n" +
                "5 6 7 8");


        System.out.println("19. Crea un programa que lea un número e imprima dicho número por pantalla siete\n" +
                "veces. Por ejemplo, si se lee el 6, debe imprimirse:\n" +
                "6\n" +
                "6\n" +
                "6\n" +
                "6\n" +
                "6\n" +
                "6\n" +
                "6");


        System.out.println("20. Modifica el programa para que el número se imprima tantas veces como diga el propio\n" +
                "número. Por ejemplo si se lee el 4, debe imprimirse:\n" +
                "4\n" +
                "4\n" +
                "4\n" +
                "4");


        System.out.println("21. Modifica el ejercicio anterior, para que además del número se lea un carácter, y se\n" +
                "imprima dicho carácter tantas veces como diga el número. Por ejemplo, si se lee 3 y\n" +
                "‘A’, debe imprimirse:\n" +
                "A\n" +
                "A\n" +
                "A");


        System.out.println("22. Crea un programa que lea un número, e imprima por pantalla los primeros números\n" +
                "positivos. Por ejemplo, si se lee el 5 debe imprimirse:\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5");


        System.out.println("23. Modifica el ejercicio anterior para que se imprima todo en la misma línea.");


        System.out.println("24. Crea un programa que lea un número, e imprima por pantalla los primeros números\n" +
                "pares. Por ejemplo, si se lee el 5 debe imprimirse:\n" +
                "2\n" +
                "4\n" +
                "6\n" +
                "8\n" +
                "10");


        System.out.println("25. Modifica el ejercicio anterior para que imprima los primeros números impares.");


        System.out.println("26. Modifica los dos anteriores para que todo se imprima en la misma línea, pero\n" +
                "separando los números por coma en lugar de espacios en blanco.");*/


    }
}