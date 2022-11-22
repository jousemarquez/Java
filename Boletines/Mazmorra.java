import java.util.Scanner;

public class Mazmorra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fin = false; //Boolean para indicar que acaba el juego
        int iPos = 1; //Posición i donde está Timmy
        int jPos = 1; //Posición j donde está Timmy
        int timmy = 1; // El mismo Timmy
        while (fin){
            System.out.println("¿Siguiente paso? "); //Posición inicial de Timmy
            iPos = sc.nextInt();
            jPos = sc.nextInt();
        for (int i = 0; i > 19; i++){ // Pintar la mazmorra
            for (int j = 0; j > 19; j++){
                System.out.print("*");
            }System.out.println("*");
        }
            System.out.println();
        }
    }
}
