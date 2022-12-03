public class CadenaCaracteres {
    public static void main (String[]arg) throws InterruptedException{
        // Numerosos lenguajes de programación implementan una función printf (print formatted),
        // para mostrar una cadena con formato. Esta, originaria del lenguaje de programación C,
        // tiene un prototipo similar al siguiente:
        System.out.print("hola\\tio\n");
        System.out.print("hola\"tio\n");
        System.out.printf("%d\n",30); // Imprime una un número entero
        System.out.printf("%f\n",30.0f); // Imprime un Float
        System.out.printf("%f\n",30.09); // Imprime un Double
        System.out.printf("%s\n","Hola"); // Imprime una Cadena. NOTA: Tipo Char no se puede.

        int edad = 35;
        float altura = 1.8f, peso = 140.2f;
        String domicilio = "Calle San Ignacio";
        System.out.println("El usuario tiene" +edad+ "años y" +altura+ "metros de altura."); // No optimizado
        // Para imprimir con anchura determinada, se sigue la siguiente fórmula:
        // printf("%[#_de_dígitos_a_la_derecha_del_punto].[#_de_dígitos_a_la_izquierda_del_punto]d")
        System.out.printf("El usuario tiene %d años y %1.2f m de altura, peso %3.2f kg y vivo en la %s\n"
                ,edad,altura,peso,domicilio); // Optimizado
        System.out.printf("%02d\n",3); // Imprimimos 3 con anchura 2, rellenado con ceros.
        System.out.printf("%05d\n",3); // Imprimimos 3 con anchura 5, rellenado con ceros.
        System.out.printf("%05d\n",30000000);
        //System.out.printf("%*s\n",);
        int horas=3, minutos=5, segundos=4;
        System.out.printf("%02d:%02d:%02d",horas,minutos,segundos); // Imprimir en formato MM:SS
        System.out.printf("%.1f",peso); // Imprimir con 1 decimal. Se configura indicando %.1f.
        System.out.println("hola\thola"); // Tabulación entre caracteres.
        System.out.println(" ' "); // Imprimir comilla simple.
        System.out.println(" \" "); // Cuando se quiera imprimir una comilla doble.
        System.out.println("\\"); // Imprimir un Slash
        System.out.println("%34");
    }
}
