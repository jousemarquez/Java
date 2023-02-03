package booleans;

import java.util.Scanner;
public class PracticaBooleana{
        public static void main(String[] args) {
            {
         /*
         * Paso 1: Instancia 2 variables de tipo booleano cuyo nombre sean:
         * 	-predicado1
         * 	-predicado0
         *
         * Paso 2: Asignale a predicado1 el valor verdadero y a predicado0 el valor falso
         *
         * Paso 3: Imprime por pantalla con salto de linea las siguientes concatenaciones:
         *
         * 	-"Verdadero: " + predicado1
         * 	-"No verdadero: " + !predicado1
         * 	-"Falso: " + predicado0
         * 	-"No Falso: " + !predicado0
         *
         * 	-"Verdadero y Falso: " + (predicado1 && predicado0)
         * 	-"Verdadero y Verdadero: " + (predicado1 && predicado1)
         * 	-"Falso y Falso: " + (predicado0 && predicado0)
         * 	-"Falso y Verdadero: " + (predicado0 && predicado1)
         *
         * 	-"Verdadero o Falso: " + (predicado1 || predicado0)
         * 	-"Verdadero o Verdadero: " + (predicado1 || predicado1)
         * 	-"Falso o Falso: " + (predicado0 || predicado0)
         * 	-"Falso o Verdadero: " + (predicado0 || predicado1)
         *
         * 	-"¿Verdadero = Falso?: " + (predicado1 == predicado0)
         * 	-"¿Verdadero = Verdadero?: " + (predicado1 == predicado1)
         * 	-"¿Falso = Falso?: " + (predicado0 == predicado0)
         * 	-"¿Falso = Verdadero?: " + (predicado0 == predicado1)
         *
         * 	-"¿Verdadero distinto de Falso?: " + (predicado1 != predicado0)
         * 	-"¿Verdadero distinto de Verdadero?: " + (predicado1 != predicado1)
         * 	-"¿Falso distinto de Falso?: " + (predicado0 != predicado0)
         * 	-"¿Falso distinto de Verdadero?: " + (predicado0 != predicado1)
         */
           boolean predicado1=true,predicado0=false; // Paso 1 y 2
           System.out.println();
           System.out.println("Verdadero: " + predicado1); // Paso 3
           System.out.println("No verdadero: " + !predicado1);
           System.out.println("Falso: " + predicado0);
           System.out.println("No Falso: " + !predicado0);

           System.out.println("Verdadero y Falso: " +(predicado1 && predicado0));
           System.out.println("Verdadero y Verdadero: " +(predicado1 && predicado1));
           System.out.println("Falso y Falso: " +(predicado0 && predicado0));
           System.out.println("Falso y Verdadero: " +(predicado0 && predicado1));

           System.out.println("Verdadero o Falso: " +(predicado1 || predicado0));
           System.out.println("Verdadero y Verdadero: " +(predicado1 || predicado1));
           System.out.println("Falso y Falso: " +(predicado0 || predicado0));
           System.out.println("Falso o Verdadero: " +(predicado0 || predicado1));

           System.out.println("¿Verdadero = Falso?: " +(predicado1 == predicado0));
           System.out.println("¿Verdadero = Verdadero?: " +(predicado1 == predicado1));
           System.out.println("¿Falso = Falso?: " + (predicado0 == predicado0));
           System.out.println("¿Falso = Verdadero?: " + (predicado0 == predicado1));

           System.out.println("¿Verdadero distinto de Falso?: " + (predicado1 != predicado0));
           System.out.println("¿Verdadero distinto de Verdadero?: " + (predicado1 != predicado1));
           System.out.println("¿Falso distinto de Falso?: " + (predicado0 != predicado0));
           System.out.println("¿Falso distinto de Verdadero?: " + (predicado0 != predicado1));

           /*
           Paso 4: Copia todas las instrucciones del paso 3 salvo las cuatro primeras.
            * 	Modifica la cadena de caracteres de cada una de las líneas añadiéndole
            * 	un "NO( " al principio del texto, y un ")" justo antes de los dos puntos y
            * 	añadiéndole el operador "!" delante del paréntesis de la operación entre
            * 	booleanos como en el siguiente ejemplo que correspondería a la
            * 	primera línea a modificar:
            *
            * 	-"NO( " + "Verdadero y Falso ): " + !(predicado1 && predicado0)
            */

           System.out.println("NO(Verdadero y Falso): " +!(predicado1 && predicado0));
           System.out.println("NO(Verdadero y Verdadero): " +!(predicado1 && predicado1));
           System.out.println("NO(Falso y Falso): " +!(predicado0 && predicado0));
           System.out.println("NO(Falso y Verdadero): " +!(predicado0 && predicado1));

           System.out.println("NO(Verdadero o Falso): " +!(predicado1 || predicado0));
           System.out.println("NO(Verdadero y Verdadero): " +!(predicado1 || predicado1));
           System.out.println("NO(Falso y Falso): " +!(predicado0 || predicado0));
           System.out.println("NO(Falso o Verdadero): " +!(predicado0 || predicado1));

           System.out.println("NO(¿Verdadero = Falso?): " +!(predicado1 == predicado0));
           System.out.println("NO(¿Verdadero = Verdadero?): " +!(predicado1 == predicado1));
           System.out.println("NO(¿Falso = Falso?): " +!(predicado0 == predicado0));
           System.out.println("NO(¿Falso = Verdadero?): " +!(predicado0 == predicado1));

           System.out.println("NO(¿Verdadero distinto de Falso?): " +!(predicado1 != predicado0));
           System.out.println("NO(¿Verdadero distinto de Verdadero?): " +!(predicado1 != predicado1));
           System.out.println("NO(¿Falso distinto de Falso?): " +!(predicado0 != predicado0));
           System.out.println("NO(¿Falso distinto de Verdadero?): " +!(predicado0 != predicado1));

           /*
            * Paso 5: Copia todas las instrucciones del paso 3 salvo las cuatro primeras.
            * 	Modifica la cadena de caracteres de cada una de las líneas añadiéndole
            * 	un NO delante del segundo valor y añadiéndole el operador "!" delante de
            * 	la segunda variable como en el siguiente ejemplo que correspondería a la
            * 	primera línea a modificar:
            *
            * 	"Verdadero y No Falso: " + (predicado1 && !predicado0)
            */

           System.out.println("NO(Verdadero y Falso): " +(predicado1 && !predicado0));
           System.out.println("NO(Verdadero y Verdadero): " +(predicado1 && !predicado1));
           System.out.println("NO(Falso y Falso): " +(predicado0 && !predicado0));
           System.out.println("NO(Falso y Verdadero): " +(predicado0 && !predicado1));

           System.out.println("NO(Verdadero o Falso): " +(predicado1 || !predicado0));
           System.out.println("NO(Verdadero y Verdadero): " +(predicado1 || !predicado1));
           System.out.println("NO(Falso y Falso): " +(predicado0 || !predicado0));
           System.out.println("NO(Falso o Verdadero): " +(predicado0 || !predicado1));

           System.out.println("NO(¿Verdadero = Falso?): " +(predicado1 == !predicado0));
           System.out.println("NO(¿Verdadero = Verdadero?): " +(predicado1 == !predicado1));
           System.out.println("NO(¿Falso = Falso?): " +(predicado0 == !predicado0));
           System.out.println("NO(¿Falso = Verdadero?): " +(predicado0 == !predicado1));

           System.out.println("NO(¿Verdadero distinto de Falso?): " + (predicado1 != !predicado0));
           System.out.println("NO(¿Verdadero distinto de Verdadero?): " + (predicado1 != !predicado1));
           System.out.println("NO(¿Falso distinto de Falso?): " + (predicado0 != !predicado0));
           System.out.println("NO(¿Falso distinto de Verdadero?): " + (predicado0 != !predicado1));

         /*
         Ejercicio Práctico:	Diseñar un algoritmo que nos indique si podemos salir a la calle.

			Existen aspectos que nos influyen en esta decision: si está lloviendo
			y si hemos terminado nuestras tareas. Solo podemos salir a la calle si
			no está lloviendo y hemos finalizado nuestras tareas. Existe una opción
			en la que, indistintamente de lo anterior, podremos salir a la calle:
			el hecho de que tengamos que ir a la biblioteca (para realizar algún trabajo,
			entregar los libros...). Solicitar al usuario (mediante un booleano) si llueve,
			si ha finalizado las tareas y si necesita ir a la biblioteca. El algoritmo debe
			mostrar mediante un booleano si es posible que se le otorgue permiso para ir a la calle.

			La solución de este ejercicio se dara solo en 9 líneas, que constaran de:
			-La línea de instanciación del scanner: Scanner sc = new Scanner(System.in);
			-Una linea en la que instanciaremos las 3 variables a usar, sin darle valor.
			-6 líneas, las cuales serán una para imprimir por pantalla la pregunta que se le hará al usuario
			 	y otra en la que le daremos valor a la variable solicitándola al usuario por el scanner
			-Una última línea en la que imprimiremos por pantalla: "¿Puedo salir a la calle?" + (la operación lógica de respuesta)
          */

            Scanner sc = new Scanner(System.in);
            boolean biblioteca, lloviendo, tarea;
            System.out.println("¿Está lloviendo?: ");
            lloviendo = sc.nextBoolean();
            System.out.println("¿Ha terminado la tarea: ");
            tarea = sc.nextBoolean();
            System.out.println("¿Necesitas ir a la biblioteca?: ");
            biblioteca = sc.nextBoolean();
            if (!lloviendo && tarea){
                System.out.println("Podemos salir a la calle");
            }
            if (biblioteca){
                System.out.println("Podemos ir a la biblioteca");
            }
            else{
                System.out.println("No podemos salir a la calle");
            }
        }
    }
}