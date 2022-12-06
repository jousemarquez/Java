import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);
    int x, y;

    public void menu() {
        String opc = " ";

        do {
            System.out.println();
            System.out.print("----- Menú Principal -----"
                    + "\nA. Ingrese dos números"
                    + "\nB. Sumar números ingresados"
                    + "\nC. Restar números ingresados"
                    + "\nD. Salir"
                    + "\nIngrese una opción: ");
            opc = teclado.nextLine();

            switch (opc) {
                case "a":
                case "A": ingresaDatos(); break;
                case "b":
                case "B": suma();break;
                case "c":
                case "C": resta(); break;
                case "d":
                case "D": System.out.println();
                    System.out.println("Gracias por usar la aplicación. Vuelva Pronto");
            }

        }while(!opc.equalsIgnoreCase("D"));
    }

    public void ingresaDatos() {
        System.out.println();
        System.out.print("Ingrese número 1: ");
        x = teclado.nextInt();
        System.out.print("Ingrese número 2: ");
        y = teclado.nextInt();
        teclado.nextLine();
    }

    public void suma() {
        System.out.println();
        int suma = x + y;
        System.out.printf("La suma de %d y %d es igual a %d", x, y, suma);
    }

    public void resta() {
        System.out.println();
        int resta = x - y;
        System.out.printf("La resta de %d y %d es igual a %d", x, y, resta);
    }

    public static void main(String[] args) {
        Menu fc = new Menu();
        fc.menu();
    }
}