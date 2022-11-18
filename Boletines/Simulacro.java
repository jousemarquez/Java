import java.util.Scanner;

public class Simulacro {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio 1:");
        int genero;
        int clase;
        System.out.println("Bienvenido/a a Dragones y Vedrunas. Aventurero/a, primero debes elegir género para comenzar la aventura (1 = Mujer, 2 = Hombre): ");
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
        for (int i = 0; i < altura*2; i++) {
            for (int j = 0; j < i; j++) {
                if (i==0 || j==0) {
                    System.out.print(rojo + " * " + reset);
                } else {
                    System.out.print(amarillo + " * " + reset);
                }
            }
            System.out.println();
        }
        System.out.println("FIN");
        String rojo2 = "\033[0;31m";
        String amarillo2 = "\033[0;33m";
        String reset2 = "\033[0m";
        System.out.println("Pide la altura2: ");
        int numFilas = sc.nextInt();
        System.out.println();
        for(int altura2 = 0; altura2<=(numFilas); altura2++){
            //Espacios en blanco
            for(int asteriscos = 0; asteriscos<altura2; asteriscos++){
                if (asteriscos == 0 || altura2 == 0) {
                    System.out.print(rojo + " * " + reset);
                } else {
                    System.out.print(amarillo + " * " + reset);
                }
            }
            System.out.println();
        }

        for(int altura2 = (numFilas)+1; altura2>0; altura2--){
            //Espacios en blanco
            for(int asteriscos = 0; asteriscos<altura2; asteriscos++){
                if (asteriscos == 0 || altura2 == 0) {
                    System.out.print(rojo + " * " + reset);
                } else {
                    System.out.print(amarillo + " * " + reset);
                }
            }
            System.out.println();
        }
    }
}
