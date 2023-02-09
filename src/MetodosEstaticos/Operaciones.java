package MetodosEstaticos;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {

        System.out.println(duplicar(30));
        System.out.println(saludar("Jouse"));
        System.out.println(posicionEntera(28837903,3));
        System.out.println(invertirStrings("Joaquin"));
        System.out.println(palindromear("Ala"));
        System.out.println(factorializarVariosEnteros(3,45));
        System.out.println(stringsRepetidos("La lluvia en Sevilla es una maravilla en Sevilla","Sevilla"));
    }

    /*
    * 1. Crear un método estático que tenga la siguiente firma:

    public static float duplicar(float num)

    e implementarlo: el método debe devolver el valor num multiplicado por 2.
    */

    public static float duplicar(float num) {
        return (num * 2);
    }

    /*
    * 2. Crear un método estático que tenga la siguiente firma:

    public static void saludar(String nombre)

    e implementarlo: el método debe imprimir por pantalla la cadena “Hola nombre”, donde nombre será la cadena
    * que se recibe como argumento.*/

    public static String saludar(String nombre) {
        System.out.println("Hola " + nombre);
        return nombre;
    }

    /*
    * 3. Observe la siguiente firma y responda antes de desarrollar cualquier código:

    public static void saludar()

    ¿Le dará algún error si crea este método justo debajo del método del ejercicio anterior?
    * Piense que se llaman igual y que devuelven lo mismo. Desarrolle a continuación el método dejando el cuerpo vacío.
    * ¿Ocurre lo que pensó antes?
    * ¿Por qué?*/

    /*
     * 4. Desarrolle el cuerpo del método anterior. El método únicamente imprime por pantalla la palabra Hola,
     * pero debe hacerlo mediante una llamada al método del ejercicio 2
     */

    public static void saludar() {
        saludar();
    }

    /*
    * 5. Crear un método que se utilice para poder separar con claridad el final de un ejercicio del boletín
    * y el comienzo del siguiente, de forma que cuando se llame a este método de la siguiente forma:

    imprimirCabecera(“ejercicio 5”);

    se imprima por pantalla lo siguiente:

    ******************
    EJERCICIO 5
    ******************
    * */
    public static void imprimirCabecera(String titulo) {
        System.out.println("******************");
        System.out.println(titulo.toUpperCase());
        System.out.println("******************");
    }

    /*
    * 6. Modificar el ejercicio anterior, para que el método reciba un segundo argumento de tipo int,
    * que serán la cantidad de asteriscos que deben imprimirse en cada una de las dos líneas.
    * De esta forma, cuando se llame a este método de la siguiente forma:

    imprimirCabecera(“ejercicio 2”, 4);

    se imprima por pantalla lo siguiente:

    ****
    EJERCICIO 2
    ****
    */
    public static void imprimirCabeceraCompleta(String ejercicio, int asteriscos) {
        for (int i = 0; i < asteriscos; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println(ejercicio.toUpperCase());
        for (int i = 0; i < asteriscos; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /*
    * 7. Crear un método estático que reciba un número e imprima la tabla de multiplicar de dicho número con
    * el siguiente formato (ejemplo para una entrada de 2):
    =========================
    TABLA DE MULTIPLICAR DEL 2
    =========================
    2 x 0 = 0
    2 x 1 = 2
    2 x 2 = 4
    …
    2 x 10 = 20
    =========================

    Pruebe el método imprimiendo la tabla de multiplicar de todos los números del 1 al 10
    */

    public static void TablaMultiplicar(int multiplicando) {
        int ejercicio = multiplicando;
        imprimirCabecera("Tabla de Multiplicar del" + multiplicando);
        for (int i = 0; i <= 10; i++) {
            if (i * multiplicando < 10) {
                System.out.printf("%d x %d = 0%d\n", multiplicando, i, multiplicando * i);
            } else {
                System.out.printf("%d x %d = %d\n", multiplicando, i, multiplicando * i);
            }
        }
        System.out.println("=========================");
    }

    /*
     * 8. Crear un método estático de nombre esPositivo, que reciba un número entero y devuelva un valor
     * booleano indicando si el número es positivo (true) o no (false).*/

    public static boolean esPositivo(int n) {
        return n >= 0;
    }

    /*
     * 9. Crear un método estático de nombre contarPositivos. Este método lee por pantalla números enteros
     * continuamente, y para únicamente cuando el usuario introduce un cero. Cuando esto ocurre, el método
     * devuelve la cantidad de números positivos que el usuario ha introducido por pantalla.*/

    /*public static void contarPositivos{
        int numero;
    }*/

    public static int contarPositivos() {
        Scanner sc = new Scanner(System.in);
        int contador = 0, num;
        do {
            System.out.println("\nIntroduce un numero positivo: ");
            num = sc.nextInt();
            if (num > 0) {
                contador++;
            }
        } while (num != 0);
        return contador;
    }

    /*
     * 10:*/
    public static float areaRectangulo(float base, float altura) {
        return (base * altura);
    }

    /*11:*/
    public static float areaRectangulo(float lado) {
        return areaRectangulo(lado * lado);
    }

    /*12:*/
    public static float areaTriangulo(float base, float altura) {
        return areaRectangulo(base * altura) / 2;
    }

    /*14:*/
    public static float cambioMonedaEuroADolar(float euros) {
        return (euros * 1.08f);
    }

    /*15:*/
    public static float cambioMonedaDolarAEuro(float dolar) {
        return (dolar * 0.98f);
    }

    /*16:*/
    public static float cambioMonedaEuroALibra(float euros) {
        return (euros * 1.18f);
    }

    /*
    17: Crear un método estático que reciba un número entero y una posición,
    y devuelva el dígito que se encuentra en dicha posición.
    */

    public static int posicionEntera(int numero, int posicion) {
        // Se convierte el número en un array de String y se aplica el método split para separarlo por piezas
        String arr[] = invertirStrings(String.valueOf(numero)).split("");
        return Integer.parseInt(arr[posicion]);
    }

    /*OTRA FORMA DE HACER EJERCICIO 17*/

    public static int localizarPorPosicion(int numero, int posicion) {
        for (int i = posicion; i > 0; i--) {
            numero /= 10;
        }
        return numero % 10;
    }

    /*OTRA FORMA DE HACER EJERCICIO 17 PASANDO A CADENA Y EMPEZANDO DESDE EL FINAL*/

    public static int devolverPosicion(long numero, int posicion) {
        String numStr = String.valueOf(numero);
        posicion = numStr.length() - posicion; // Comienza desde la primera posición y empezando como posición 1.
        return Integer.parseInt(String.valueOf(numStr.charAt(posicion)));
    }

    /*18: Crear un método estático que reciba un String, y lo devuelva del revés.*/
    public static String invertirStrings(String palabra) {
        // Se recibe un String y se mete dentro de un bucle para invertir la cadena
        String invertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }
        return invertida;
    }

    /*19. Crear un método estático que reciba un String, y compruebe si es un palíndromo.
    Debe usar el método del ejercicio anterior.*/
    public static boolean palindromear(String palabra) {
        return (palabra.equalsIgnoreCase(invertirStrings(palabra)));
    }

    /*20. Crear un método estático que reciba un número entero y devuelva el factorial de dicho número.*/
    public static int factorializarEnteros(int numero){
        for (int i = numero; i > 0 ; i--) {
            numero=numero*i;
        }
        return numero;
    }

    /*21. Crear un método estático que reciba dos números enteros n y r, y devuelva el número combinatorio n sobre r.
    Utilice para ello el método creado en el ejercicio anterior.*/
    public static long factorializarVariosEnteros(long n, long r){
        long resultado = 0;
        resultado = factorializarEnteros((int) n)/((factorializarEnteros((int) n)-factorializarEnteros((int) r)*factorializarEnteros((int) r)));
        return resultado;
    }

    /*22. Crear un método estático que reciba dos String, y cuente la cantidad de veces que
    el segundo se repite en el primero.*/
    public static int stringsRepetidos(String cadenaBase, String cadenaAComprobar){
        int contador = 0;
        while (cadenaBase.indexOf(cadenaAComprobar) > -1) {
            cadenaBase = cadenaBase.substring(cadenaBase.indexOf(cadenaAComprobar)+cadenaAComprobar.length(),cadenaBase.length());
            contador++;
        }
        return contador;
    }

    /*ALBERTO*/

    public static int contarString (String cadena, String busqueda){
        int cont = 0;
        do{
            if (cadena.contains(busqueda)){
                cont++;
                cadena = cadena.substring(cadena.indexOf(busqueda)+busqueda.length());
            }
            else {
                cadena = cadena.substring(cadena.length());
            }
        }while(!cadena.equals(""));
        return cont;
    }

    /*23. Crear un método estático que reciba un array de algún tipo primitivo y lo imprima por pantalla.*/
    public static void imprimirArrays(){



        /*SEGUIMOS POR AQUÍ*/
    }
}










