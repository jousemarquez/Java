package MetodosEstaticos;

import java.util.Scanner;

public class Main {

    /*
     * Cree primero el código del método. Puede crearlo en el mismo fichero de código fuente donde tenga el main,
     * o bien puede crearse una clase nueva donde desarrollar los métodos de este boletín.
     * Cuando acabe cada método, implemente en el main una llamada para probarlo.
     */

    Scanner scan = new Scanner(System.in);
    private int num;

    public void menuMetodosEstaticos() {
        String opc = " ";

        do {
            System.out.print("----- Menú Principal -----"
                    + "\nIngrese una opción (1-31) - 0 para salir: ");

            opc = scan.nextLine();

            switch (opc) {
                case "1":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "2":
                    System.out.println(MetodosEstaticos.Operaciones.saludar("Hola"));
                    break;
                case "3":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "4":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "5":
                    System.out.println(MetodosEstaticos.Operaciones.imprimirCabecera(5));
                    break;
                case "6":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "7":
                    MetodosEstaticos.Operaciones.TablaMultiplicar(3);
                    break;
                case "8":
                    System.out.println(MetodosEstaticos.Operaciones.esPositivo(3));
                    break;
                case "9":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "10":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "11":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "12":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "13":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "14":
                    MetodosEstaticos.Operaciones.TablaMultiplicar(3);
                    break;
                case "15":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "16":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "17":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "18":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "19":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "20":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "21":
                    MetodosEstaticos.Operaciones.TablaMultiplicar(3);
                    break;
                case "22":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "23":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "24":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "25":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "26":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "27":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "28":
                    MetodosEstaticos.Operaciones.TablaMultiplicar(3);
                    break;
                case "29":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "30":
                    System.out.println(MetodosEstaticos.Operaciones.duplicar(3));
                    break;
                case "31":
                    MetodosEstaticos.Operaciones.TablaMultiplicar(3);
                    break;
                case "0":
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Gracias por usar la aplicación. Vuelva Pronto");
                    break;
            }

        } while (!opc.equals("0"));
    }

    public static void main(String[] args) {
        Main fc = new Main();
        fc.menuMetodosEstaticos();
    }
}