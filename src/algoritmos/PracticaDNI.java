package algoritmos;

import java.util.Scanner;

public class PracticaDNI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Validación de datos del usuario
        Se pretende realizar una aplicación web para un negocio de compras online.
        Por cada cliente que se registra en la plataforma, hay que validar sus datos personales.
        Se pretende validar el DNI del usuario y su cuenta bancaria.

        Validación del DNI
        Introduce por pantalla el número de tu DNI y almacénalo en una variable de tipo int de nombre ‘numDni’.
        Para calcular la letra, cogeremos el resto de dividir nuestro DNI entre 23, el resultado debe estar entre 0 y 22.
        Utilice un switch-case para comprobar que letra toca (ver documento adjunto).
         */
        System.out.println("Introduce su DNI (entero de 8 dígitos: ");
        int numDni = sc.nextInt();
        int letraDni;
        if (numDni < 0 || numDni > 99999999){
            System.out.println("El DNI introducido es incorrecto");
        } else {
            letraDni = numDni%23;

            switch (letraDni) {
                case 0:
                    System.out.println("El DNI es " + numDni + "T");
                    break;
                case 1:
                    System.out.println("El DNI es " + numDni + "R");
                    break;
                case 2:
                    System.out.println("El DNI es " + numDni + "W");
                    break;
                case 3:
                    System.out.println("El DNI es " + numDni + "A");
                    break;
                case 4:
                    System.out.println("El DNI es " + numDni + "G");
                    break;
                case 5:
                    System.out.println("El DNI es " + numDni + "M");
                    break;
                case 6:
                    System.out.println("El DNI es " + numDni + "Y");
                    break;
                case 7:
                    System.out.println("El DNI es " + numDni + "F");
                    break;
                case 8:
                    System.out.println("El DNI es " + numDni + "P");
                    break;
                case 9:
                    System.out.println("El DNI es " + numDni + "D");
                    break;
                case 10:
                    System.out.println("El DNI es " + numDni + "X");
                    break;
                case 11:
                    System.out.println("El DNI es " + numDni + "B");
                    break;
                case 12:
                    System.out.println("El DNI es " + numDni + "N");
                    break;
                case 13:
                    System.out.println("El DNI es " + numDni + "J");
                    break;
                case 14:
                    System.out.println("El DNI es " + numDni + "Z");
                    break;
                case 15:
                    System.out.println("El DNI es " + numDni + "S");
                    break;
                case 16:
                    System.out.println("El DNI es " + numDni + "Q");
                    break;
                case 17:
                    System.out.println("El DNI es " + numDni + "V");
                    break;
                case 18:
                    System.out.println("El DNI es " + numDni + "H");
                    break;
                case 19:
                    System.out.println("El DNI es " + numDni + "L");
                    break;
                case 20:
                    System.out.println("El DNI es " + numDni + "C");
                    break;
                case 21:
                    System.out.println("El DNI es " + numDni + "K");
                    break;
                case 22:
                    System.out.println("El DNI es " + numDni + "E");
                    break;
            }
        }
    }
}