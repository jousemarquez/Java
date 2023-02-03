package _examenes;

import java.util.Scanner;

public class Simulacro {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio 1:");
        int genero;
        int clase;
        System.out.println("Bienvenido/a a Dragones y Vedrunas. Aventurero/a, primero debes elegir género" +
                "para comenzar la aventura (1 = Mujer, 2 = Hombre): ");
        genero = sc.nextInt();

        switch (genero) {
            case 1:
                System.out.println("Ha elegido género Mujer.");
                System.out.println("Ahora debes elegir una clase para tu personaje:\n" +
                        "1 -> Clase Asesina.\n" +
                        "2 -> Clase Druida.\n" +
                        "3 -> Clase Amazona.\n");
                clase = sc.nextInt();

                switch (clase) {

                    case 1:
                        System.out.println("Eres una Asesina.");
                        break;
                    case 2:
                        System.out.println("Eres una Druida.");
                        break;
                    case 3:
                        System.out.println("Eres una Amazona.");
                        break;
                    default:
                        System.out.println("Eres una Asesina.");
                        break;
                }
                System.out.println("Comienza tu aventura, joven aventurera!");
                break;

            case 2:
                System.out.println("Ha elegido género Hombre.");
                System.out.println("Ahora debes elegir una clase para tu personaje:\n" +
                        "1 -> Clase Buscavidas.\n" +
                        "2 -> Clase Guerrero.\n" +
                        "3 -> Clase Mago.\n");
                clase = sc.nextInt();


                switch (clase) {

                    case 1:
                        System.out.println("Eres un Buscavidas.");
                        break;
                    case 2:
                        System.out.println("Eres un Guerrero.");
                        break;
                    case 3:
                        System.out.println("Eres un Mago.");
                        break;
                    default:
                        System.out.println("Eres un Buscavidas.");
                        break;
                }
                System.out.println("Comienza tu aventura, joven aventurero!");
        }
        System.out.println("FIN\n");
        
        System.out.println("Ejercicio 2:");
        int num;
        do {
            System.out.println("Introducir un número entre 0 y 4: ");
            num = sc.nextInt();

            switch (num) {
                case 0:
                    System.out.println("Examen finalizado con éxito!");
                    break;
                case 1:
                    System.out.println("Ejercicio 1 finalizado.");
                    break;
                case 2:
                    System.out.println("Ejercicio 2 finalizado.");
                    break;
                case 3:
                    System.out.println("Ejercicio 3 finalizado.");
                    break;
                case 4:
                    System.out.println("Ejercicio 4 finalizado.");
                    break;
                default:
                    System.out.println("Error, numéro fuera de rango.");
                    break;
            }
            System.out.println("¿Quieres realizar de nuevo la consulta? (0 para finalizar el programa.): ");
            num = sc.nextInt();
        } while (num != 0);
        System.out.println("FIN\n");

        System.out.println("Ejercicio 3:");
        String rojo = "\033[0;31m";
        String amarillo = "\033[0;33m";
        String reset = "\033[0m";
        System.out.println("Introduce la altura de la bandera: ");
        int altura = sc.nextInt();
        for (int i=0;i<altura;i++){
            for(int j=0;j<i+1;j++){
                if (j==i ||j==0){
                    System.out.print(rojo + " * " + reset);

                } else if (j!=i){
                    System.out.print(amarillo + " * " + reset);
                }

            }
            System.out.println();
        }
        for (int i=altura;i>=0;i--){
            for(int j=0;j<i+1;j++){
                if (j==i ||j==0){
                    System.out.print(rojo + " * " + reset);
                } else if (j!=i){
                    System.out.print(amarillo + " * " + reset);
                }
            }
            System.out.println();
        }

        System.out.println("Ejercicio 4: ");
        System.out.println("Has hecho bien el ejercicio 1, 2 y 4?");
        boolean b1 = sc.nextBoolean();
        System.out.println("Has intentado el ejercicio 3?");
        boolean b2 = sc.nextBoolean();
        System.out.println("Has hecho bien el ejercicio 3?");
        boolean b3 = sc.nextBoolean();
        System.out.println("Te has olvidado de los ejercicios 1 y 2?");
        boolean b4 = sc.nextBoolean();

        System.out.println("\n¿Vas por buen camino: " + (b1&&!b2 || b3&&!b4));
    }
}
