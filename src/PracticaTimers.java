import java.util.Arrays;
import java.util.Scanner;

public class PracticaTimers {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique qué ejercicio quiere resolver: ");
        int n;
        do {
            n = sc.nextInt();

            if (n > 0 || n <= 5){

            switch (n) {
                case 1:
                    System.out.println("1 y 2: Crear un programa que lea por pantalla un numero entre 0 y 59, ambos incluidos y forzando\n" +
                            "al usuario que esté dentro de ese rango. Tras ello, crear un timer de tipo cuenta atrás, que\n" +
                            "comience presentando el numero introducido y lo vaya decrementando e imprimiendo en una\n" +
                            "nueva línea. Tras imprimir el cero, el programa acaba imprimiendo la palabra FIN.");
                    int num; // Para While
                    boolean dentroBucle = false; // Definimos este booleano para comprobar si el número que se pasa por el teclado cumple los límites.

                    do {
                        System.out.println("Introduce un número entre 0 y 59: ");
                        num = sc.nextInt();
                        if (num < 0 || num > 59) {
                            System.out.println("Error. Introduce un número entre 0 y 59: ");
                        } else {
                            dentroBucle = true;
                        }
                    } while (!dentroBucle); // Cuando el número está dentro de los valores, se rompe el bucle y termina de ejecutarlo.

                    while (num >= 0) {
                        if (num >= 10) {
                            System.out.println(num);
                        } else {
                            System.out.println("0" + num);
                        }
                        num--;
                    }
                    System.out.println("FIN");
                    break;

                case 2:
                    System.out.println("2. Modifique el programa anterior de forma que aparezca la siguiente línea justo después del\n" +
                            "println que está utilizando para imprimir cada número:\n" +
                            "Thread.sleep(1000);");
                    int num2; // Para While
                    boolean dentroBucle2 = false; // Definimos este booleano para comprobar si el número que se pasa por el teclado cumple los límites.

                    do {
                        System.out.println("Introduce un número entre 0 y 59: ");
                        num2 = sc.nextInt();
                        if (num2 < 0 || num2 > 59) {
                            System.out.println("Error. Introduce un número entre 0 y 59: ");
                        } else {
                            dentroBucle2 = true;
                        }
                    } while (!dentroBucle2); // Cuando el número está dentro de los valores, se rompe el bucle y termina de ejecutarlo.

                    while (num2 >= 0) {
                        if (num2 >= 10) {
                            System.out.println(num2);
                        } else {
                            System.out.println("0" + num2);
                        }
                        Thread.sleep(1000);
                        num2--;
                    }
                    System.out.println("FIN");
                    break;

                case 3:
                    System.out.println("3. Modifique el programa anterior, justo la línea donde tiene el println que imprime el número.\n" +
                            "En lugar de println pruebe a usar print para que se imprima siempre en la misma línea, pero\n" +
                            "concatene al número un retorno de carro “\\r” antes del mismo. Por ejemplo, si tiene el\n" +
                            "numero almacenado en una variable i, modifique el println para que sea como el que sigue:");
                    int num3; // Para While
                    boolean dentroBucle3 = false; // Definimos este booleano para comprobar si el número que se pasa por el teclado cumple los límites.

                    do {
                        System.out.println("Introduce un número entre 0 y 59: ");
                        num3 = sc.nextInt();
                        if (num3 < 0 || num3 > 59) {
                            System.out.println("Error. Introduce un número entre 0 y 59: ");
                        } else {
                            dentroBucle3 = true;
                        }
                    } while (!dentroBucle3); // Cuando el número está dentro de los valores, se rompe el bucle y termina de ejecutarlo.

                    while (num3 >= 0) {
                        if (num3 >= 10) {
                            System.out.print("\r" + "00: " + num3);
                        } else if (num3 == 0) {
                            System.out.println("FIN");
                        } else {
                            System.out.print("\r" + "00:" + num3);
                        }
                        Thread.sleep(1000);
                        num3--;
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("4. Modifique el programa anterior para que el formato de los números impresos sea el\n" +
                            "siguiente:");
                    int num4; // Para While
                    boolean dentroBucle4 = false; // Definimos este booleano para comprobar si el número que se pasa por el teclado cumple los límites.

                    do {
                        System.out.println("Introduce un número entre 0 y 59: ");
                        num4 = sc.nextInt();
                        if (num4 < 0 || num4 > 59) {
                            System.out.println("Error. Introduce un número entre 0 y 59: ");
                        } else {
                            dentroBucle4 = true;
                        }
                    } while (!dentroBucle4); // Cuando el número está dentro de los valores, se rompe el bucle y termina de ejecutarlo.

                    while (num4 >= 0) {
                        if (num4 >= 10) {
                            System.out.print("\r" + "00: " + num4);
                        } else if (num4 == 0) {
                            System.out.println("FIN");
                        } else {
                            System.out.print("\r" + "00:" + num4);
                        }
                        Thread.sleep(1000);
                        num4--;
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("4. Modifique el programa anterior para que el formato de los números impresos sea el\n" +
                            "siguiente:");
                    int segundos;
                    int minutos;
                    boolean dentroBucle5 = false; // Definimos este booleano para comprobar si el número que se pasa por el teclado cumple los límites.

                    do {
                        System.out.println("Introduce los minutos entre 0 y 59: ");
                        minutos = sc.nextInt();
                        if (minutos < 0 || minutos > 59) {
                            System.out.println("Error. Introduce los minutos entre 0 y 59: ");
                        } else {
                            dentroBucle5 = true;
                        }
                    } while (!dentroBucle5);// Cuando el número está dentro de los valores, se rompe el bucle y termina de ejecutarlo.

                    do {
                        System.out.println("Introduce los segundos entre 0 y 59: ");
                        segundos = sc.nextInt();
                        if (segundos < 0 || segundos > 59) {
                            System.out.println("Error. Introduce los segundos entre 0 y 59: ");
                        } else {
                            dentroBucle5 = true;
                        }
                    } while (!dentroBucle5);

                    while (segundos < 0 || segundos < 59){

                        while (minutos >= 0){ // Mientras los minutos sean mayores o iguales a cero se cumple que
                            if (minutos >= 10){ // Se imprima en pantalla los minutos
                                System.out.print("\r" + minutos);
                            } else {
                                System.out.print("\r" + "0" + minutos); // Pero si los minutos son menores a 10, se añade un 0 por delante.
                            }

                            if(segundos >= 10){
                                System.out.print(":" + segundos);
                            } else {
                                System.out.print(":0" + segundos);
                            }

                            Thread.sleep(1000);

                            if (segundos == 0){
                                minutos--;
                                segundos = 60;
                            }
                            segundos--;
                        }
                        System.out.print("\nFIN");
                    }

                default:
                    System.out.println("Número incorrecto. Vuelve a introducirlo.");
                    break;
                }
            }
        } while (n < 0 || n > 5);
    }
}
