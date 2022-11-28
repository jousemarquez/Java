import java.util.Scanner;

public class PracticaTimers {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        boolean b;
        int n;
        do {
            System.out.println("Indique qué ejercicio quiere resolver: ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("1 y 2: Crear un programa que lea por pantalla un numero entre 0 y 59," +
                            "ambos incluidos y forzando al usuario que esté dentro de ese rango. Tras ello," +
                            "crear un timer de tipo cuenta atrás, que comience presentando el numero introducido" +
                            "y lo vaya decrementando e imprimiendo en una nueva línea. Tras imprimir el cero," +
                            "el programa acaba imprimiendo la palabra FIN.");
                    int num; // Para While
                    boolean dentroBucle = false; // Definimos este booleano para comprobar si el número que se pasa
                    // por el teclado cumple los límites.

                    do {
                        System.out.println("Introduce un número entre 0 y 59: ");
                        num = sc.nextInt();
                        if (num < 0 || num > 59) {
                            System.out.println("Error. Introduce un número entre 0 y 59: ");
                        } else {
                            dentroBucle = true;
                        }
                    } while (!dentroBucle); // Cuando el número está dentro de los valores, se rompe el bucle y
                    // termina de ejecutarlo.

                    for (int i = num; i >= 0; i--) {
                        System.out.printf("%02d\n", i);
                    }
                    System.out.println("FIN");
                    break;

                case 2:
                    System.out.println("2. Modifique el programa anterior de forma que aparezca la siguiente" +
                            "línea justo después del println que está utilizando para imprimir cada número:" +
                            "Thread.sleep(1000);");
                    int num2; // Para While
                    boolean dentroBucle2 = false; // Definimos este booleano para comprobar si el número que se pasa
                    // por el teclado cumple los límites.

                    do {
                        System.out.println("Introduce un número entre 0 y 59: ");
                        num2 = sc.nextInt();
                        if (num2 < 0 || num2 > 59) {
                            System.out.println("Error. Introduce un número entre 0 y 59: ");
                        } else {
                            dentroBucle2 = true;
                        }
                    } while (!dentroBucle2); // Cuando el número está dentro de los valores, se rompe el bucle y
                    // termina de ejecutarlo.

                    for (int i = num2; i >= 0; i--) {
                        System.out.printf("%02d\n", i);
                        Thread.sleep(1000);
                    }
                    System.out.println("FIN");
                    break;

                case 3:
                    System.out.println("3. Modifique el programa anterior, justo la línea donde tiene el println" +
                            "que imprime el número. En lugar de println pruebe a usar print para que se imprima" +
                            "siempre en la misma línea, pero concatene al número un retorno de carro “\\r” antes" +
                            "del mismo. Por ejemplo, si tiene el numero almacenado en una variable i, modifique el" +
                            "println para que sea como el que sigue:");
                    int num3; // Para While
                    boolean dentroBucle3 = false; // Definimos este booleano para comprobar si el número que se
                    // pasa por el teclado cumple los límites.

                    do {
                        System.out.println("Introduce un número entre 0 y 59: ");
                        num3 = sc.nextInt();
                        if (num3 < 0 || num3 > 59) {
                            System.out.println("Error. Introduce un número entre 0 y 59: ");
                        } else {
                            dentroBucle3 = true;
                        }
                    } while (!dentroBucle3); // Cuando el número está dentro de los valores, se rompe el bucle y
                    // termina de ejecutarlo.

                    while (num3 >= 0) {
                        if (num3 >= 10) {
                            System.out.printf("%02d:", num3);
                        } else if (num3 == 0) {
                            System.out.println("FIN");
                        } else {
                            System.out.printf("%02d:", num3);
                        }
                        Thread.sleep(1000);
                        num3--;
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("4. Modifique el programa anterior para que el formato de los números" +
                            "impresos sea el siguiente:");
                    int num4; // Para While
                    boolean dentroBucle4 = false; // Definimos este booleano para comprobar si el número que se
                    // pasa por el teclado cumple los límites.

                    do {
                        System.out.println("Introduce un número entre 0 y 59: ");
                        num4 = sc.nextInt();
                        if (num4 < 0 || num4 > 59) {
                            System.out.println("Error. Introduce un número entre 0 y 59: ");
                        } else {
                            dentroBucle4 = true;
                        }
                    } while (!dentroBucle4); // Cuando el número está dentro de los valores, se rompe el bucle
                    // y termina de ejecutarlo.

                    while (num4 >= 0) {
                        if (num4 >= 10) {
                            System.out.printf("\r%02d", num4);
                        } else if (num4 == 0) {
                            System.out.println("FIN");
                        } else {
                            System.out.printf("\r%02d:", num4);
                        }
                        Thread.sleep(1000);
                        num4--;
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("4. Modifique el programa anterior para que el formato de los números" +
                            "impresos sea el siguiente:");
                    int dias, horas, minutos, segundos;

                    do {
                        System.out.print("\r" + "Introduce los días entre 0 y 364: ");
                        dias = sc.nextInt();
                    } while (dias < 0 || dias > 364);

                    do {
                        System.out.print("\r" + "Introduce las horas entre 0 y 23: ");
                        horas = sc.nextInt();
                    } while (horas < 0 || horas > 23);

                    do {
                        System.out.print("\r" + "Introduce los minutos entre 0 y 59: ");
                        minutos = sc.nextInt();
                    } while (minutos < 0 || minutos > 59);// Cuando el número está dentro de los valores, se rompe el bucle
                    // y termina de ejecutarlo.

                    do {
                        System.out.print("Introduce los segundos entre 0 y 59: ");
                        segundos = sc.nextInt();
                    } while (segundos < 0 || segundos > 59);

                    // Solución con un for
                    for (int i = dias; i >= 0; i--) {
                        for (int j = horas; j >= 0; j--) {
                            for (int k = minutos; k >= 0; k--) {
                                for (int l = segundos; l >= 0; l--) {
                                    System.out.printf("\r%02d:%02d:%02d:%02d", i, j, k, l);
                                    Thread.sleep(1000);
                                }
                                segundos = 59;
                            }
                            minutos = 59;
                        }
                        horas = 23;
                    }
                    System.out.println("\nFIN");
                    // Solución con un while de Jorge

                    while (minutos >= 0) {
                        System.out.printf("\r%02d:%02d", minutos, segundos);
                        Thread.sleep(1000);
                        segundos--;
                        if (segundos < 0) {
                            segundos = 59;
                            minutos--;
                        }
                    }

                    while (minutos >= 0) { // Mientras los minutos sean mayores o iguales a cero se cumple que
                        if (minutos >= 10) { // Se imprima en pantalla los minutos
                            System.out.printf("%01d:\n", minutos);
                        } else {
                            System.out.printf("%02d:\n", minutos); // Pero si los minutos son menores a 10,
                            // se añade un 0 por delante.
                        }

                        if (segundos >= 10) {
                            System.out.printf(":%d\n", segundos);
                        } else {
                            System.out.printf(":%02d\n", segundos);
                        }

                        Thread.sleep(1000);

                        if (segundos < 0) {
                            minutos--;
                            segundos = 59;
                        }
                        segundos--;
                    }
                    System.out.print("\r" + "FIN");
                    break;

                    default:
                    System.out.println("Número incorrecto.");
                    break;
            }
            System.out.println("\n¿Quieres hacer otro ejercicio (Si/No)?");
                b = sc.next().equalsIgnoreCase("si");
        } while (b);
    }
}
