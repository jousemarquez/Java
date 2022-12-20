import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BoletinStrings1 {

    Scanner sc = new Scanner(System.in);

    public void menuEjercicio() {
        String opc = " ";

        do {
            System.out.println();
            System.out.print("----- Menú Principal -----"
                    + "\nA. Ejercicio 1"
                    + "\nB. Ejercicio 2"
                    + "\nC. Ejercicio 3"
                    + "\nD. Ejercicio 4"
                    + "\nE. Ejercicio 5"
                    + "\nF. Ejercicio 6"
                    + "\nG. Ejercicio 7"
                    + "\nH. Ejercicio 8"
                    + "\nI. Ejercicio 9"
                    + "\nJ. Ejercicio 10"
                    + "\nK. Ejercicio 11"
                    + "\nL. Calculadora Polaca InversaApp"
                    + "\nZ. Salir"
                    + "\nIngrese una opción: ");
            opc = sc.nextLine();

            switch (opc) {
                case "A":
                    ejercicio1();
                    break;
                case "B":
                    ejercicio2();
                    break;
                case "C":
                    ejercicio3();
                    break;
                case "D":
                    ejercicio4();
                    break;
                case "E":
                    ejercicio5();
                    break;
                case "F":
                    ejercicio6();
                    break;
                case "G":
                    ejercicio7();
                    break;
                case "H":
                    ejercicio8();
                    break;
                case "I":
                    ejercicio9();
                    break;
                case "J":
                    ejercicio10();
                    break;
                case "K":
                    ejercicio11();
                    break;
                case "L":
                    CalculadoraPolacaInversaApp();
                    break;
                case "Z":
                    System.out.println("Fin del programa.");
                    break;
                default:
                System.out.println("Gracias por usar la aplicación. Vuelva Pronto");
                break;
            }

        } while (!opc.equalsIgnoreCase("Z"));
    }

    public void ejercicio1() {
        System.out.println("Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida" +
                "por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.\n");
        String miNombre = "Jouse"; // Cadena literal
        String miNombre2 = new String("Jouse"); // Constructor
        System.out.println("Bienvenido "+miNombre);
    }

    public void ejercicio2() {
        System.out.print("Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir.");
        String nombreSolicitado = sc.nextLine();
        String nombreSolicitado2 = new String(sc.nextLine()); // Scanner con constructor
        System.out.println("Bienvenido "+nombreSolicitado);
    }

    public void ejercicio3() {
        System.out.println("Escribe una aplicación con un String que contenga una contraseña cualquiera." +
                "Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no" +
                "pedirá más la contraseña y mostrará un mensaje diciendo “Enhorabuena”. Piensa bien en la" +
                "condición de salida (3 intentos y si acierta sale, aunque le queden intentos).\n");
        int intentos = 3;
        String checkerContraseña = new String("Mordekaiser");
        boolean checker;
        do {
            System.out.print("Introducir la contraseña: ");
            String contraseña = sc.nextLine();
            checker = checkerContraseña.equals(contraseña);
            if (checker == true) {
                System.out.println("La contraseña es correcta");
            } else {
                intentos--;
                System.out.println("La contraseña es incorrecta. Tienes " + intentos + " intentos.");
            }
        } while (!checker);
        if (intentos == 0) {
            System.out.println("Has superado los intentos para introducir la contraseña. Los GEO van en camino.");
        } else {
            System.out.println("Accediendo el programa...");
        }

        // Método de Jorge
        String password = "Abcd1234";
        boolean fallo = true;
        for (int i = 0; i<3 && fallo; i++){
            System.out.print("Introduce tu password: ");
            String leida = sc.nextLine();
            fallo = !password.equals(leida);
        }
        if (!fallo){
            System.out.println("¡Enhorabuena! La contreña es correcta.");
        } else {
            System.out.println("Has agotado los intentos. La contreña es incorrecta.");
        }
    }

    public void ejercicio4() {
        System.out.println("Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuántas" +
                "vocales hay en total (recorre el String con un bucle y charAt).");
        int conteo = 0;
        String dicho = new String("La lluvia en Sevilla es una maravilla");
        String dicho2 = dicho.toLowerCase(); // Pasamos el método .toLowerCase() para convertir toda la
        // frase en minúscula.
        for (int vocal = 0; vocal < dicho2.length(); vocal++){
            if (dicho2.charAt(vocal) == 'a' || dicho2.charAt(vocal) == 'e' || dicho2.charAt(vocal) == 'i' ||
                    dicho2.charAt(vocal) == 'o' || dicho2.charAt(vocal) == 'u') {
                conteo++;
            }
        }
        System.out.printf("Hay un total de %d vocales\n", conteo);

        // Ejemplo de Jorge
        String frase = "La lluvia en Sevilla es una maravilla";
        String vocales = "aeiouAEIOU";
        int contador = 0;
        for (int i = 0; i<frase.length();i++) {
            char letra = frase.charAt(i); // con el contador extraemos el carácter en la posición i.
            if(vocales.contains(letra+"")) { // El método .contains() recibe el argumento una cadena y retorna
                // si incluye el argumento. Como el método solo funciona con Strings, se debe convertir tal que así.
                contador++;
            }
        }
        System.out.printf("Hay un total de %d vocales\n", contador++);
    }

    public void ejercicio5() {
        System.out.println("Reemplaza todas las a del String anterior por una e.");
        String dicho = new String("La lluvia en Sevilla es una maravilla");
        System.out.println(dicho); // Se imprime la cadena original
        System.out.println(dicho.replace('a','e'));

        // Método Jorge
        String frase6 = sc.nextLine();
        String vocales = "aeiouAEIOU";
        int contadores = 0;
        for (int i = 0; i<frase6.length();i++) {
            char letra = frase6.charAt(i); // con el contador extraemos el carácter en la posición i.
            if(vocales.contains(letra+"")) { // El método .contains() recibe el argumento una cadena y retorna
                // si incluye el argumento. Como el método solo funciona con Strings, se debe convertir tal que así.
                contadores++;
            }
        }
        System.out.printf("Hay un total de %d vocales\n", contadores++);
    }

    public void ejercicio6() {
        System.out.println("Dada una cadena mostrar por pantalla la cantidad de vocales que tiene." +
                "Ejemplo:\n" +
                "Entrada: cad = \"Hola tu\"\n" +
                "Salida: La cantidad de vocales es 3");
        int contador = 0;
        String cad = new String("Hola tu");
        for (int vocal = 0; vocal < cad.length(); vocal++){
            if (cad.charAt(vocal) == 'a' || cad.charAt(vocal) == 'e' || cad.charAt(vocal) == 'i' ||
                    cad.charAt(vocal) == 'o' || cad.charAt(vocal) == 'u') {
                contador++;
            }
        }
        System.out.printf("La cantidad de vocales es %d\n", contador);
    }

    public void ejercicio7() {
        System.out.println("Dada una cadena invertir la misma y mostrar por pantalla." +
                "Ejemplo:\n" +
                "Entrada: \"casa blanca\"\n" +
                "Salida: \"acnalb asac\"");
        String casaBlanca = new String("casa blanca");
        String invertida = new String(""); // Se declara una nueva string para almacenar la invertida.
        // Recorremos la original con un bucle for desde el final hasta el inicio
        for (int indice = casaBlanca.length()-1; indice >= 0; indice-- ){
            // Se van concatenando cada caracter en la nueva cadena
            invertida += casaBlanca.charAt(indice);
            invertida.concat(casaBlanca.charAt(indice)+""); // Otra forma de realizar el ejercicio con .concat()
        }
        System.out.printf("La cadena original es %s.", casaBlanca);
        System.out.printf("La cadena invertida es %s.", invertida);
    }

    public void ejercicio8() {
        System.out.println("Dada una cadena cad, y un carácter car, verificar cuántas veces se repite" +
                "el carácter 'a' en la cadena cad." +
                "Ejemplo:\n" +
                "Entrada: cad = \"casa blanca\", car = 'a'\n" +
                "Salida: El carácter 'a' se repite 4 veces");
        int contador8 = 0;
        String frase8 = new String("casa blanca");
        char car = 'a';
        for (int i = 0; i < frase8.length(); i++ ){
            char caracterLeido = frase8.charAt(i);
            if (caracterLeido == 'a'){
                contador8++;
            }
        }
        System.out.printf("Resultado: el carácter 'a' se repite %d veces.\n", contador8);
    }

    public void ejercicio9() {
        System.out.println("Lee un número por teclado y muestra por consola, el carácter al que pertenece" +
                "en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.");
        System.out.print("Introduce un número entero: ");
        int valor = sc.nextInt();
        char caracter = (char) valor; // Aquí se hace un casting para pasar el entero a carácter.
        System.out.println(caracter);
    }

    public void ejercicio10() {
        System.out.println("Modifica el ejercicio anterior para que, en lugar de pedir un número," +
                "pida un carácter y muestre su código en la tabla ASCII.");
        System.out.print("Introduce un carácter: ");
        String cadena10 = sc.nextLine();
        char caracter10 = cadena10.charAt(0);
        System.out.println((int) caracter10);
    }

    public void ejercicio11() {
        System.out.println("Recorre el String del ejercicio anterior y transforma cada carácter a su código ASCII." +
                "Muéstralos en línea recta, separados por un espacio entre cada carácter.");
        String emosido = "emosido engañados";
        for (int i=0; i<emosido.length();i++){
            System.out.print((int) emosido.charAt(i));
            System.out.print(" ");
        }
        System.out.println();
    }

    public void CalculadoraPolacaInversaApp() {
        System.out.println("Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos" +
                "(int, pero se leerán como String y luego se convertirán) y un signo aritmético (String)," +
                "según este último se realizará la operación correspondiente." +
                "" +
                "Al final mostrará el resultado en consola. Los signos aritméticos disponibles son:\n" +
                "+: suma los dos operandos.\n" +
                "-: resta los operandos.\n" +
                "*: multiplica los operandos.\n" +
                "/: divide los operandos, este debe dar un resultado con decimales (double)\n" +
                "^:  1º operando como base y 2º como exponente.\n" +
                "%:  módulo, resto de la división entre operando1 y operando2.");
        System.out.println("Bienvenido a CalculadoraPolacaInversaApp.");
        System.out.print("Introduce el primer operando: ");
        String operando1 = sc.nextLine();
        System.out.print("Introduce el segundo operando: ");
        String operando2 = sc.nextLine();
        System.out.println("Ahora introduzca la operación matemática que desee realizar\n" +
                "(Sumar +, Restar -, Multiplicar *, Dividir /, Potencia ^ o Resto %): ");
        String signoAritmetico = sc.nextLine();
        int entero1 = Integer.parseInt(operando1);
        int entero2 = Integer.parseInt(operando2);

        if (signoAritmetico.equals("+")) {
            int resultadoSumar = entero1+entero2;
            System.out.println("El resultado es: " + resultadoSumar);
        } else if (signoAritmetico.contains("-")) {
            int resultadoRestar = entero1 - entero2;
            System.out.println("El resultado es: " + resultadoRestar);
        } else if (signoAritmetico.equals("*")) {
        int resultadoMultiplicar = entero1 * entero2;
        System.out.println("El resultado es: " + resultadoMultiplicar);
        } else if (signoAritmetico.equals("/")) {
            int resultadoDividir = entero1 / entero2;
            System.out.println("El resultado es: " + resultadoDividir);
        } else if (signoAritmetico.equals("%")) {
            int resultadoModulo = entero1 % entero2;
            System.out.println("El resultado es: " + resultadoModulo);
        } else {
            System.out.println("La operación introducida no es correcta.");
        }
    }

    public static void main(String[] args) {
        BoletinStrings1 fc = new BoletinStrings1();
        fc.menuEjercicio();
    }
}


