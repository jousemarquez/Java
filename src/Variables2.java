import java.util.Scanner;

public class Variables2 {
    public static void main(String[] args)

    {

        Scanner scan  = new Scanner(System.in); // Método para añadir a la variable Int el valor

        //EJERCICIO 1

        /*
         * 1. Crea una variable de tipo entero y asígnale el valor 10.
         * 2. Imprímela por pantalla.
         * 3. Decrementa su valor una vez.
         * 4. Imprímela por pantalla.
         * 5. Multiplícalo por dos.
         * 6. Réstale cuatro unidades.
         * 7. Imprímela por pantalla.
         * 8. Incrementa su valor cuatro veces usando el operador de incremento (++).
         * 9. Imprímela por pantalla.
         * 10. Crea una segunda variable y asígnale el resultado de sumar una unidad a la primera.
         * 11. Imprime las dos variables.
         * 12. Divide la segunda entre dos.
         * 13. Imprime las dos variables y comprueba si el resultado es el correcto comparando con otros
         * compañeros.
         */
        System.out.println("Introduce un valor entero para realizar algunas operaciones.");

        //int eje1 = 10; // 1
        int eje1 = scan.nextInt();
        System.out.println(eje1); // 2
        System.out.println("Decrementa su valor una vez.");
        eje1 -= 1; // 3
        System.out.println(eje1); // 4
        System.out.println("Multiplícalo por dos.");
        eje1 *= 2; // 5
        System.out.println("Réstale cuatro unidades.");
        eje1 -= 4; // 6
        System.out.println(eje1); // 7
        System.out.println("Incrementa su valor cuatro veces usando el operador de incremento (++).");
        eje1++; // 8
        eje1++;
        eje1++;
        eje1++;
        System.out.println(eje1); // 9
        int eje2; // 10
        System.out.println("Crea una segunda variable y asígnale el resultado de sumar una unidad a la primera.");
        eje2 = eje1 + 1;
        System.out.println("x =" +eje1+ "y =" +eje2);
        System.out.println("Divide la segunda entre dos.");
        eje2 /= 2; // 12
        System.out.println(eje1+" "+eje2); // 13

        System.out.println("---FIN---");
        //EJERCICIO 2

        /*
         * Desarrollar un algoritmo para calcular el área de un rectángulo, cuya fórmula es base x altura.
         * Para ello:
         * 1. Cree una variable para almacenar el valor de la base, y asigne un valor.
         * 2. Cree una variable para almacenar el valor de la altura, y asigne un valor.
         * 3. Cree una variable para almacenar el área, y utilice la fórmula anterior para asignarle el valor
         * adecuado.
         * 4. Imprima por pantalla el área, utilizando una instrucción println.
         * 5. Tenga en cuenta que debe elegir el tipo adecuado para cada variable.
         */
        System.out.println("\nDesarrollar un algoritmo para calcular el área\nde un rectángulo, cuya fórmula es base x altura.\n");
        //float b = 3.0f;
        //float h = 4.0f;
        System.out.println("Define la base: ");
        float b = scan.nextFloat();
        System.out.println("Define la altura: ");
        float h = scan.nextFloat();
        float a = b * h;

        System.out.println("El área del rectángulo es: " +a);

        System.out.println("---FIN---");
        /*
         * EJERCICIO 3
         * Desarrollar un algoritmo para convertir de euros a dólares teniendo en cuenta que un euro son
         * 1.16 dólares. Para ello:
         * 1. Cree una variable para almacenar el factor de conversión (1.16).
         * 2. Cree una variable para almacenar la cantidad de euros (no asigne ningún valor aún).
         * 3. Utilice una instrucción de asignación para darle un valor a la variable anterior.
         * 4. Cree una variable para almacenar la cantidad de dólares, y asigne el resultado de multiplicar
         * el factor de conversión por la cantidad de euros.
         * 5. Imprima por pantalla el resultado, utilizando una instrucción println.
         */

        //float eur;
        //eur = 5.0f;
        float conver = 1.16f;
        System.out.println("CALCULADORA");
        System.out.println("Convierte EUR a USD. Tasas de conversión=" +conver);
        System.out.println("Escribe los euros que quieras convertir (ejemplo: 2.5€): ");
        float eur = scan.nextFloat();
        float usd = eur*conver;
        System.out.println("Usted tiene: " +"$"+usd);
        System.out.println("---FIN---");

        /*
         * EJERCICIO 4
         * Modifique el ejercicio 2 para ahorrarnos la creación de la variable del área. Para ello:
         * elimine dicha variable, y ponga en la instrucción println la fórmula del área directamente.
         */
        System.out.println("El área del rectángulo es: "+b*h);
        System.out.println("---FIN---");

        /*
         * EJERCICIO 5
         * Modifique el ejercicio 3 para ahorrarnos la creación de la variable del factor de conversión.
         */
        System.out.println("Los Euros que tiene usted valen: "+"$"+eur*1.16f);
        System.out.println("---FIN---");

        /*
         * EJERCICIO 6
         * 1. Cree una variable de tipo entero y asigne el valor 3.
         * 2. Decremente su valor tres veces con el operador de decremento (- -).
         * 3. Incremente su valor 6 unidades con el operador de suma simplificada (+=).
         * 4. Incremente su valor en una unidad utilizando el operador de incremento (++).
         * 5. Duplique su valor como desee.
         * 6. Utilice el operador módulo (%) para comprobar el resto de dividir la variable entre 2,
         * imprimiendo por pantalla el resultado.
         * 7. ¿Cómo se puede comprobar si un número es par o impar?
         */

        int eje6 = 3;
        eje6--;
        eje6--;
        eje6--;
        eje6+= 6;
        eje6++;
        eje6*= 2;
        eje6%= 2;
        System.out.println("Si el resto es " +eje6 + "es par. Si es 1 es impar.");
        System.out.println("---FIN---");

        System.out.println("7. ¿Cómo se puede comprobar si un número es par o impar?");
        System.out.println("Usando una variable del tipo boolean y aplicando el módulo. Si es 0 es par, si es 1 es impar.");
        int eje7 = 4;
        if (eje7 %2 == 0){
            System.out.println("La variable es par");
        }
        else{
            System.out.println("La variable es impar");
            System.out.println("---FIN---");
        }
    }
}