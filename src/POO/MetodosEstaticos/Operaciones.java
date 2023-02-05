package POO.MetodosEstaticos;

public class Operaciones {

    public static void main(String[] args) {

        float num = 4.0f;
        System.out.println(duplicar(num));
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
    public static void imprimirCabecera(String ejercicio) {
        System.out.println("******************");
        System.out.println("EJERCICIO " + ejercicio + "");
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
    *****/
    public static void imprimirCabeceraCompleta(String ejercicio, int asteriscos) {
        for (int i = 0; i < asteriscos; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println(ejercicio);
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

    public static void TablaMultiplicar(int multiplicando){
    String ejercicio = "TABLA DE MULTIPLICAR DEL";
    }
}
