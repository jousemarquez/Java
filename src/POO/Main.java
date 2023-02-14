package POO;

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
                    + "\nIngrese una opción (1-34) - 0 para salir: ");

            opc = scan.nextLine();

            switch (opc) {
                case "1":
                    System.out.print("Insertar un número para duplicar: ");
                    System.out.println(Operaciones.duplicar(scan.nextInt()));
                    break;
                case "2":
                    System.out.println(Operaciones.saludar("Hola"));
                    break;
                case "3":
                    System.out.println();
                    break;
                case "4":
                    System.out.println(Operaciones.saludar("Jouse"));
                    break;
                case "5":
                    Operaciones.imprimirCabecera("ejercicio 5");
                    break;
                case "6":
                    Operaciones.imprimirCabeceraCompleta("Ejercicio 6", 6);
                    break;
                case "7":
                    Operaciones.TablaMultiplicar(3);
                    break;
                case "8":
                    System.out.println(Operaciones.esPositivo(3));
                    break;
                case "9":
                    System.out.println(Operaciones.contarPositivos());
                    break;
                case "10":
                    System.out.println(Operaciones.areaRectangulo(3, 5));
                    break;
                case "11":
                    System.out.println(Operaciones.areaRectangulo(3, 3));
                    break;
                case "12":
                    System.out.println(Operaciones.areaTriangulo(3, 3));
                    break;
                case "13":
                    Operaciones.areaTriangulo2();
                    break;
                case "14":
                    System.out.println(Operaciones.cambioMonedaEuroADolar(3));
                    break;
                case "15":
                    System.out.println(Operaciones.cambioMonedaDolarAEuro(8));
                    break;
                case "16":
                    System.out.println(Operaciones.cambioMonedaEuroALibra(8));
                    break;
                case "17":
                    System.out.println(Operaciones.posicionEntera(8, 5));
                    break;
                case "18":
                    System.out.println(Operaciones.invertirStrings("Jouse me llamo"));
                    break;
                case "19":
                    System.out.println(Operaciones.palindromear("Ana"));
                    break;
                case "20":
                    System.out.println(Operaciones.factorializarEnteros(56));
                    break;
                case "21":
                    System.out.println(Operaciones.factorializarVariosEnteros(3, 5));
                    break;
                case "22":
                    System.out.println(Operaciones.stringsRepetidos("La lluvia de Sevilla es una maravilla", "Sevilla"));
                    break;
                case "23":
                    Operaciones.imprimirArray(new int[]{9, 3, 2, 1, 3, 4, 1});
                    break;
                case "24":
                    Operaciones.imprimirTablaMultiplicarArray(new int[]{9, 3, 2, 1, 3, 4, 1});
                    break;
                case "25":
                    Operaciones.ordenarEnteros(new int[]{9, 3, 2, 1, 3, 4, 1});
                    break;
                case "26":
                    Operaciones.buscar(new int[]{9, 3, 2, 1, 3, 4, 1}, 4);
                    break;
                case "27":
                    Operaciones.buscarBinarios(new int[]{9, 3, 2, 1, 3, 4, 1}, 4);
                    break;
                case "28":
                    Operaciones.introducirValorArray(new int[]{9, 3, 2, 1, 3, 4, 1}, 4, 5);
                    break;
                case "29":
                    Operaciones.modificarArray1(new int[]{9, 3, 2, 1, 3, 4, 1}, new int[]{4, 1, 2, 1, 3, 4, 1}, 4);
                    break;
                case "30":
                    Operaciones.modificarArray2(new int[]{9, 3, 2, 1, 3, 4, 1}, new int[]{4, 1, 2, 1, 3, 4, 1}, 4, 2);
                    break;
                case "31":
                    Operaciones.TablaMultiplicar(3);
                    break;
                case "32":
                    int[]array = {2, 4, 5, 6, 1};
                    Operaciones.burbuja(array);
                    break;
                case "33":
                    Operaciones.writeFile1();
                    break;
                case "34":
                    Operaciones.imprimirDivision();
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