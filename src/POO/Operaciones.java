package POO;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {

        System.out.println(duplicar(30));
        System.out.println(saludar("Jouse"));
        System.out.println(posicionEntera(28837903, 3));
        System.out.println(invertirStrings("Joaquin"));
        System.out.println(palindromear("Ala"));
        System.out.println(factorializarVariosEnteros(3, 45));
        System.out.println(stringsRepetidos("La lluvia en Sevilla es una maravilla en Sevilla", "Sevilla"));

        int[] array = {3, 2, 1, 3, 4, 55, 31, 2, 33, 1, 0};
        System.out.println(buscar(array, 2));

        int[] arrayBinario = {0, 4, 7, 10, 14, 23, 45, 47, 53};
        System.out.println(buscarBinarios(arrayBinario, 53));
        int pos = buscarBinarios(arrayBinario,53);
        if (pos == -1){
            System.out.println("El elemento no esta presente");
        } else {
            System.out.println("Elemento encontrado en: "
                    + "indice " + pos);
        }
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
    public static void imprimirCabecera(String ejercicio){
        ejercicio = "ejercicio 5".toUpperCase();
        System.out.println("******************");
        System.out.println(ejercicio);
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
     * booleano indicando si el número es positivo (true) o no (false).
     */

    public static boolean esPositivo(int n) {
        return n >= 0;
    }

    /*
     * 9. Crear un método estático de nombre contarPositivos. Este método lee por pantalla números enteros
     * continuamente, y para únicamente cuando el usuario introduce un cero. Cuando esto ocurre, el método
     * devuelve la cantidad de números positivos que el usuario ha introducido por pantalla.
     */

    /*public static void contarPositivos{
        int numero;
    }*/

    public static int contarPositivos() {
        Scanner scan = new Scanner(System.in);
        int contador = 0, num;
        do {
            System.out.println("\nIntroduce un numero positivo: ");
            num = scan.nextInt();
            if (num > 0) {
                contador++;
            }
        } while (num != 0);
        return contador;
    }

    //10: Crear un método estático que reciba la base y la altura de un rectángulo y devuelva su área.

    public static double areaRectangulo(double base, double altura) {
        return (base * altura);
    }

    //11. Crear un método estático que reciba el lado de un cuadrado y devuelva su área.

    public static double areaRectangulo(double lado) {
        return areaRectangulo(lado * lado);
    }

    //12. Crear un método estático que reciba la base y la altura de un triángulo y devuelva su área.
    public static double areaTriangulo(double base, double altura) {
        return areaRectangulo(base * altura) / 2;
    }

    //13. Crear un método estático que reciba la base y la altura de un triángulo y devuelva su área.
    public static double areaTriangulo2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introducir base: ");
        double base = scan.nextDouble();
        System.out.println("Introducir altura: ");
        double altura  = scan.nextDouble();
        return areaRectangulo(base * altura) / 2;
    }

    //14. Crear un método estático que reciba un valor en euros y lo devuelva convertido a dólares americanos.
    public static float cambioMonedaEuroADolar(float euros) {
        return (euros * 1.08f);
    }

    //15. Crear un método estático que haga lo contrario.
    public static float cambioMonedaDolarAEuro(float dolar) {
        return (dolar * 0.98f);
    }

    //16. Crear un método estático que reciba un valor en libras y lo devuelva convertido a euros.
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
    public static int factorializarEnteros(int numero) {
        for (int i = numero; i > 0; i--) {
            numero = numero * i;
        }
        return numero;
    }

    /*21. Crear un método estático que reciba dos números enteros n y r, y devuelva el número combinatorio n sobre r.
    Utilice para ello el método creado en el ejercicio anterior.*/
    public static long factorializarVariosEnteros(long n, long r) {
        long resultado = 0;
        resultado = factorializarEnteros((int) n) / ((factorializarEnteros((int) n) - factorializarEnteros((int) r)
                * factorializarEnteros((int) r)));
        return resultado;
    }

    /*22. Crear un método estático que reciba dos String, y cuente la cantidad de veces que
    el segundo se repite en el primero.*/
    public static int stringsRepetidos(String cadenaBase, String cadenaAComprobar) {
        int contador = 0;
        while (cadenaBase.indexOf(cadenaAComprobar) > -1) {
            cadenaBase = cadenaBase.substring(cadenaBase.indexOf(cadenaAComprobar) + cadenaAComprobar.length(),
                    cadenaBase.length());
            contador++;
        }
        return contador;
    }

    /*MÉTODO DE ALBERTO*/

    public static int contarString(String cadena, String busqueda) {
        int cont = 0;
        do {
            if (cadena.contains(busqueda)) {
                cont++;
                cadena = cadena.substring(cadena.indexOf(busqueda) + busqueda.length());
            } else {
                cadena = cadena.substring(cadena.length());
            }
        } while (!cadena.equals(""));
        return cont;
    }

    /*23. Crear un método estático que reciba un array de algún tipo primitivo y lo imprima por pantalla.*/
    public static void imprimirArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //24. Cree un método que reciba un array de enteros, y por cada entero del array
    //imprima su tabla de multiplicar.
    public static void imprimirTablaMultiplicarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            TablaMultiplicar(array[i]);
        }
    }

    //25. Crear un método que reciba un array 1D de enteros y lo ordene.
    public static void ordenarEnteros(int[] array){
        int cont = 0;
        boolean ordenado = false;
        while(!ordenado) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    cont++;
                }
            }
            if (cont == 0) {
                ordenado = true;
            }
            cont = 0;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*26. Crear un método que reciba un array 1D de enteros y un número,
    y busque dicho número en el array (búsqueda lineal).*/

    public static int buscar(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1; // Este truco se hace porque un array nunca tiene valores negativos, es un estándar.
    }

    /*27. Repetir el anterior pero haciendo una búsqueda binaria.
    Tenga en cuenta los requisitos de este tipo de búsqueda.*/

    // Para que este algoritmo funcione, se debe comprobar si el array está ordenado o no.
    // Primero nos tenemos que posicionar en el elemento central del array.

    // MÉTODO DEL ALGORITMO DE BÚSQUEDA LINEA DE ELEMENTO EN ARRAY
    /*
    Partiendo de un array de enteros ordenado, implemente un algoritmo de búsqueda binaria
    utilizando la plantilla que se le proporciona. El funcionamiento de este algoritmo es el
    siguiente:
    *
    Aprovechando que el array se encuentra ordenado ascendentemente, la idea de la búsqueda
    binaria es comprobar si el elemento que estamos buscando se encuentra en la posición central
    del array (a diferencia de la búsqueda lineal, que comienza en la posición inicial). En caso de
    estar ahí, hemos terminado. En caso de no estar ahí, puede estar en la primera mitad (los
    elementos a la izquierda de la posición central) o en la segunda mitad (los elementos a la
    derecha de la posición central):
    *
    - Si el número que estamos buscando tiene un valor inferior a lo que hay en la posición
    central, entonces nos quedaremos con la primera mitad del array y repetiremos el
    proceso con ella, descartando el resto. En este caso la nueva posición final sería la
    posición central que hemos comprobado menos una unidad.
    *
    - Si el número que buscamos tiene un valor superior a lo que hay en la posición central,
    entonces nos quedaremos con la segunda mitad del array y repetiremos el proceso
    con ella, descartando el resto. En este caso la nueva posición inicial sería la posición
    central que hemos comprobado más una unidad.
    *
    Recuerde que en todo momento debe tener declaradas tres variables: inicio (que apunta al
    primer elemento de la parte del array que se está examinando), fin (que apunta al último
    elemento de la parte del array que se está examinando) y central (que es el punto medio de
    los dos anteriores).
    */
    public static int buscarBinarios(int[] array, int elemento) {
        int pos = -1;
        int inicio = 0;
        int fin = array.length - 1;
        int centro;

        while (inicio <= fin) {
            centro = (inicio + fin) / 2;
            if (array[centro] == elemento) {
                pos = centro;
                break;
            } else if (array[centro] < elemento) { // Si el número de centro es menor que el elemento
                inicio = centro + 1;
            } else {
                // Como el array está ESTRICTAMENTE ordenado, si el valor centro sea menor que el elemento,se mueve el fin.
                fin = centro - 1;
            }
        }
        return pos;
    }

    //28. Crear un método que reciba un array de enteros, un número y una posición, y
    //devuelva un nuevo array que tenga los mismos contenidos del original, pero
    //con sus elementos desplazados a partir de la posición especificada, donde se
    //almacenará además el número pasado en el segundo argumento.
    //Por ejemplo, si el método recibe los siguientes datos:
    //[3, 8, 9]
    //Número: 13
    //Posición: 1
    //El nuevo array devuelto por el método debe ser el siguiente:
    //[3, 13, 8, 9]
    public static int[] introducirValorArray (int[] array, int n, int pos){
        int[] arrayFinal = new int[array.length+1];
        boolean colocado = false;
        for (int i = 0; i < array.length+1; i++) {
            if(i==pos){
                arrayFinal[i] = n;
                colocado = true;
            }else {
                if(colocado){
                    arrayFinal[i] = array[i-1];
                } else{
                    arrayFinal[i] = array[i];
                }
            }
        }
        return arrayFinal;
    }
    //29. Crear un método que reciba dos arrays y un entero, y copie tantos elementos
    //del segundo array en el primer array como diga el entero, comenzando desde
    //la posición cero en ambos. Suponga que no se saldrá de los límites.
    //Por ejemplo, si array1 = [7,2,1,0] y array2=[3,2,2,7,6] y entero=3, al acabar el
    //método el primer array se modificará y su contenido será array1=[3,2,2,0] (en
    //negrita están las posiciones que se han modificado).
    public static int[] modificarArray1(int[] array1, int[] array2, int contenido){
        int[] arrayResult = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < contenido; i++, j++) {
                arrayResult[i] = array2[i];
            }
            arrayResult[i] = array1[i];
        }
        return arrayResult;
    }
    //30. Repetir lo anterior, pero añadiendo un cuarto argumento, que indique la
    //posición del segundo array a partir de la cual se empezará.
    public static int[] modificarArray2(int[] array1, int[] array2, int contenido, int posArray2){
        int[] arrayResult = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = posArray2; j < contenido; i++, j++) {
                arrayResult[i] = array2[i+posArray2];
            }
            arrayResult[i] = array1[i];
        }
        return arrayResult;
    }
    //31. Repetir lo anterior, pero añadiendo un quinto argumento, que indique la
    //posición del primer array a partir de la cual se empezará
    public static int[] modificarArray3(int[] array1, int[] array2, int contenido, int posArray2, int posArray1){
        int[] arrayResult = new int[array1.length];
        for (int i = posArray1; i < array1.length-1; i++) {
            for (int j = posArray2; j < contenido; i++, j++) {
                arrayResult[i] = array2[i+posArray2];
            }
            arrayResult[i] = array1[i+posArray1];
        }
        return arrayResult;
    }

    // MÉTODO DEL ALGORITMO DE LA BURBUJA EN ARRAY DESORDENADO

    /*
    Debe ordenar los elementos del array siguiendo la técnica empleada en clase.
    En ningún momento puede crear un nuevo array, debe trabajar sobre el original.
    Tras ordenar el array, debe devolverlo e imprimirlo en el main.
    */

    public static void burbuja(int[] array) {
        int aux;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }
        imprimirArray(array);
    }
    /*33. Crear un método que permita escribir un fichero de texto desde un array.*/

    public static void writeFile1() {
        try {
            File fout = new File("out.txt");
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            for (int i = 0; i < 10; i++) {
                bw.write("something".concat(String.valueOf(i)));
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error de E/S");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error genérico");
            e.printStackTrace();
        } finally {
            System.out.println("Me ejecuto porque sí");
        }
    }

    /*34: Boletin 1:*/

    public static void imprimirDivision() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Intrduce los dos números que quieres dividir: ");
        try{
            System.out.println(scan.nextInt() / scan.nextInt());
        } catch(ArithmeticException e) {
            System.out.println("Excepcion de tipo aritmético");
            e.printStackTrace(); //Se imprime en la salida de error (orden diferente a la salida estándar)
        } catch (InputMismatchException e){
            System.out.println("Excepcion de tipo input mismatch");
        } catch (Exception e){
            System.out.println("Excepcion generica (clase padre)");
        } finally {
            System.out.println("Me ejecuto haya o no excepcion");
        }
        //LANZAMIENTO DE EXCEPCION (comentado para que el código funcione)
        //throw new ArithmeticException("Lanzando excepción genérica");
        System.out.println("FIN");

    }
}