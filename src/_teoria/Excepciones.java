package _teoria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    // Ejemplo de excepciones

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        try { // Con el bloque "try" se marca el código peligroso
            System.out.print("Introducir numerador y denominador: ");
            System.out.println(scan.nextInt()/scan.nextInt());
            System.out.println("Fin de la división");
        } catch(ArithmeticException e){ // Se invoca AritmeticException en este caso y se declara una variable, normalmente "e"
            System.out.println("Excepción de tipo aritmético!!");
            e.printStackTrace(); // Este método imprime la pila de excepciones que hubiese
        } catch (InputMismatchException e){
            System.out.println("Excepción de tipo input mismatch!!");
        } catch (Exception e){
            System.out.println("Excepción de tipo genérico!!");
        } finally {
            System.out.println("Me ejecuto haya o no haya excepción.");
        }

        //throw new ArithmeticException("Estoy lanzando una excepción");
        System.out.println("FIN");
    }
}