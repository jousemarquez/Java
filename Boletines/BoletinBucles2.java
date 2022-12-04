import java.util.Scanner;

public class BoletinBucles2 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indique qué ejercicio quiere resolver: ");

        int n = sc.nextInt();
        do {
            switch (n) {
                case 1:
                    System.out.println("1. Leer un nombre por pantalla, y escribir un saludo por pantalla que utilice ese nombre," +
                            "repitiendo dicho saludo hasta que se muestre un total de diez veces.");

                    String nombre = sc.next();
                    int contador = 0;
                    while (contador < 10) {
                        System.out.println("Hola" + nombre);
                        contador++;
                    }

                    // CON DO WHILE

                    do {
                        System.out.println("Hola" + nombre);
                        contador++;
                    } while (contador < 10);
                    System.out.println(contador);
                    System.out.println("FIN");
                    break;

                case 2:
                    System.out.println("2. Leer un número entero, y escribir un mensaje de error tantas veces como diga ese número.");
                    System.out.println("Introduce un entero: ");
                    // Con FOR
                    int num = sc.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.println("Error!!");
                    }

                    // Con DO While
                    int k = 0;
                    while (k < num) {
                        System.out.println("Error!");
                        k++;
                    }
                    System.out.println("FIN");
                    break;

                case 3:
                    System.out.println("3. Crear una contraseña numérica en una variable. Pedir por pantalla la contraseña de inicio" +
                            "hasta que el usuario la acierte.");

                    // Con DO While
                    System.out.println("Introduce su contraseña: ");
                    int pass = 1973;
                    int leida = pass;
                    do {
                        System.out.println("Introduce su contraseña de nuevo: ");
                        leida = sc.nextInt();
                    } while (leida != pass);

                    // Con FOR

                    System.out.println("Introduce su contraseña: ");
                    for (int j = 0; j != pass; j++) {
                        System.out.println("Introduce su contraseña.");
                        int pass2 = sc.nextInt();
                        if (pass2 == pass) {
                            System.out.println("La contraseña es correcta.");
                            break;
                        }
                    }
                    System.out.println("FIN");
                    break;

                case 4:

                    System.out.println("4. Leer por pantalla un entero y comprobar si es negativo o positivo, imprimiendo por pantalla" +
                            "una frase al respecto. Si se mete un cero, volver a pedir un número.");

                    // Mi método con DO While
                    int eje4;
                    do {
                        System.out.println("Introduce un numero distinto de 0: ");
                        eje4 = sc.nextInt();
                    } while (eje4 == 0);
                    if (eje4 > 0) {
                        System.out.println(eje4 + " es un número positivo.");
                    } else {
                        System.out.println(eje4 + " es un número negativo.");
                    }
                    System.out.println("FIN");
                    break;

                case 5:
                    System.out.println("5. Leer por pantalla un entero y comprobar si es par o impar. Si se mete un número negativo o cero," +
                            "volver a pedir un número.");

                    int eje5;
                    do {
                        System.out.println("Introducir un número: ");
                        eje5 = sc.nextInt();
                        if (eje5 % 2 == 0) {
                            System.out.println(eje5 + " es un número par.");
                        } else if (eje5 % 2 == 1) {
                            System.out.println(eje5 + " es un número impar.");
                        } else {
                            System.out.println("Es cero, mete otro número.");
                        }
                    } while (eje5 == 0 || eje5 < 0);
                    System.out.println("FIN");
                    break;

                case 6:
                    System.out.println("6. Introducir una variable contadora en los dos ejercicios anteriores que almacene la cantidad" +
                            "total de números incorrectos que ha introducido el usuario, y la muestre por pantalla antes de finalizar.");

                    int eje6a;
                    int veces = -1;
                    do {
                        System.out.println("Introducir un número: ");
                        eje6a = sc.nextInt();
                        if (eje6a > 0) {
                            System.out.println(eje6a + " es un número positivo.");
                        } else if (eje6a < 0) {
                            System.out.println(eje6a + " es un número negativo.");
                        } else {
                            veces++;
                        }
                    } while (eje6a == 0);
                    System.out.println("Te has equivocado " + veces + "veces.");
                    System.out.println("FIN");

                    int eje6b;
                    int veces2 = -1;
                    do {
                        System.out.println("Introducir un número: ");
                        eje6b = sc.nextInt();
                        if (eje6b % 2 == 0 && eje6b != 0) {
                            System.out.println(eje6b + " es un número par.");
                        } else if (eje6b % 2 == 1) {
                            System.out.println(eje6b + " es un número impar.");
                        } else
                            veces2++;
                        {
                        }
                    } while (eje6b == 0 || eje6b < 0);
                    System.out.println("Te has equivocado " + veces2 + "veces.");
                    System.out.println("FIN");
                    break;

                case 7:
                    System.out.println("7. Leer por pantalla un número entre 1 y 12 e imprimir por pantalla el nombre del mes correspondiente." +
                            "En caso de leer un número fuera de rango, volver a pedir un número entre 1 y 12.");
                    int mes;
                    do {
                        System.out.println("Introducir un número (1-12): ");
                        mes = sc.nextInt();
                    } while (mes < 1 || mes > 12);
                    System.out.println("Error. Número incorrecto.");
                    switch (mes) {
                        case 1:
                            System.out.println("Enero");
                            break;
                        case 2:
                            System.out.println("Febrero");
                            break;
                        case 3:
                            System.out.println("Marzo");
                            break;
                        case 4:
                            System.out.println("Abril");
                            break;
                        case 5:
                            System.out.println("Mayo");
                            break;
                        case 6:
                            System.out.println("Junio");
                            break;
                        case 7:
                            System.out.println("Julio");
                            break;
                        case 8:
                            System.out.println("Agosto");
                            break;
                        case 9:
                            System.out.println("Septiembre");
                            break;
                        case 10:
                            System.out.println("Octubre");
                            break;
                        case 11:
                            System.out.println("Noviembre");
                            break;
                        case 12:
                            System.out.println("Diciembre");
                            break;
                        default:
                            System.out.println("Introduce un número del 1 al 12: ");
                    }
                    System.out.println("FIN");
                    break;
                case 8:
                    System.out.println("8. Leer por pantalla un entero e imprimirlo elevado a la quinta potencia." +
                            "Utilizar un bucle para realizar el cálculo.");
                    System.out.println("Introduce un entero: ");
                    int eje8 = sc.nextInt();
                    int var8 = eje8;
                    for (int i = 5; i >= eje8; i--) {
                        var8 *= eje8;
                    }
                    System.out.println("El número es " + var8);
                    System.out.println("FIN");
                    break;
                case 9:
                    System.out.println("9. Repetir el ejercicio anterior para leer también por pantalla la potencia a la que debe elevarse el número.");
                    System.out.println("Introduce un entero: ");
                    int eje9 = sc.nextInt();
                    int var9 = eje9;
                    System.out.println("Introduce un entero al que elevar n: ");
                    int exponente = sc.nextInt();
                    int var9a = exponente;
                    for (int i = exponente; i >= var9a; i--) {
                        var9a = var9 * exponente;
                    }
                    System.out.println("El número es " + var9);
                    System.out.println("FIN");
                    break;
                case 10:
                    System.out.println("10. Leer por pantalla un número n, e imprimir por pantalla una fila de asteriscos con tantas columnas como diga n.");
                    System.out.println("FIN");
                    for (int i = 0; i < 5; i++){
                        System.out.println("* ");
                    }
                    System.out.println("FIN");
                    break;
                case 11:
                    System.out.println("11. Leer por pantalla un número n, e imprimir por pantalla un cuadrado cuya altura viene dada por n.");
                    System.out.println("Introduce la altura: ");
                    int altura = sc.nextInt();
                    for (int i = 0; i < altura; i++) { // i controla las filas de la matriz
                        for (int j = 0; j < altura; j++) { // j controla las columnas de la matriz
                            System.out.print("* ");
                        }
                    }
                    System.out.println("FIN");
                    break;
                case 12:
                    System.out.println("12. Leer por pantalla un número n, e imprimir por pantalla un cuadrado cuya altura viene dada por n.");
                    int altura12 = sc.nextInt();
                    for (int i = 0; i < altura12; i++) { // i controla las filas de la matriz
                        for (int j = 0; j < altura12; j++) { // j controla las columnas de la matriz
                            if(i==0 || j==0 || i==altura12-1 || j==altura12-1){
                                System.out.print("* ");
                            }else{
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("FIN");
                    break;
                case 13:
                    System.out.println("13. Leer por pantalla un número n, e imprimir por pantalla un triángulo cuya altura viene dada por n.");
                    int n13 = sc.nextInt();
                    for (int i = 0; i < n13; i++) { // i controla las filas de la matriz
                        for (int j = 0; j < i; j++) { // j controla las columnas de la matriz
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("FIN");
                    break;
                case 14:
                    System.out.println("14. (MUY DIFÍCIL) Leer por pantalla un número n, e imprimir por pantalla un triángulo cuyo número" +
                            "de niveles viene dado por n.");
                    int num14  = sc.nextInt();
                    for(int i = 0; i < num14; i++){
                        for(int j = 0; j < num14 - i; j++){ // En este paso se hace el espejo, por la teoría de los espacios finitos.
                            System.out.print(" ");
                        }
                        for(int j = 0; j <= 2 * i; j++){ // para invertir el eje solo hay que restarle el n-1 del eje a cambiar
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("FIN");
                    break;
                case 15:
                    System.out.println("15. (DIFÍCIL) Leer por pantalla un número n, e imprimir por pantalla un triángulo cuyo número" +
                            "de niveles viene dado por n."); // ACTUALIZAR
                    System.out.println("15) Introduce altura: ");
                    int num15 = sc.nextInt();

                    for (int i = 0; i < num15; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= 2 * (num15 - 1 - i); j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("FIN");
                    break;
                case 16:
                    System.out.println("16. (Difícil) Escriba un programa que compruebe si un número es cúbico, es decir," +
                            "si puede expresarse como un producto de tres factores iguales.");
                    System.out.println("16) Introduce numero para calcular su raiz cuadrada: ");
                    float a = sc.nextFloat();
                    float x = 1.0f; // Partimos de 1
                    float errorFino = 0.00001f; // Nos vale con un error fino
                    float derivadaFinaEnX; //Variable en el que guardaremos la derivada con error fino en x
                        /*
                        Pararemos la busqueda cuando el error sea menor que el que nos vale:
                        |x*x*x - a| < 0.00001 siendo x el que estamos probando y a el valor al que queremos calcularle la raíz.
                        */
                    while (Math.abs(x * x * x - a) >= errorFino) {
                        /*
                        La derivada de una función f en el punto x con aproximación i es por definición:
                        f(x) = (f(x+i) - f(x) )/ i
                        */
                        derivadaFinaEnX = ((x + errorFino) * (x + errorFino) * (x + errorFino) - x * x * x) / errorFino;
                        /*
                        Los ceros de una función pueden calcularse mediante el método de Newton de la siguiente manera:
                        -Si x es una aproximación para el punto cero de f, entonces x-f(x)/f'(x) es una mejor aproximación.
                        -El límite de la sucesión x_n definida por:
                        x_0 = 1
                        x_{n+1} = x_n-f(x_n)/f'(x_n)
                        es un cero de f. Es decir, tenemos que buscar la mejor aproximación con fallo menor que el error fino.
                        */
                        x = x - (x * x * x - a) / derivadaFinaEnX;
                    }
                    System.out.println("La raiz cúbica es: " + x);
                    System.out.println("Es cubo perfecto?: "
                            + ((int) Math.round(x) * (int) Math.round(x) * (int) Math.round(x) == (int) a));
                    System.out.println("FIN");
                    break;
                case 17:
                    System.out.println("17. (DIFÍCIL) Leer por pantalla un número entero e indicar si es primo.");
                    System.out.println("17) Introduce numero para comprobar si es primo: ");
                    n = sc.nextInt();
                    boolean esPrimo = true;

                    if (n == 2 || n == 3) { //esPrimo = true;
                    } else if (n % 2 == 0 || n < 2) {
                        esPrimo = false;
                    } else {
                        for (int i = 3; i < n / 2; i+=2) {
                            if (n % i == 0) {
                                esPrimo = false;
                                break;
                            }
                        }
                    }
                    System.out.println("¿Es primo " + n + "? Respuesta: " + esPrimo);
                    System.out.println("FIN");
                    break;
                case 18:
                    System.out.println("18. Imprimir por pantalla todos los números primos entre 0 y 100.");
                    n = sc.nextInt();
                    int mitad;

                    if (n < 2) {
                        System.out.print("No hay primos");
                    }else if (n == 2) {
                        System.out.println(n);
                    }else if (n==3) {
                        System.out.print("2, 3");
                    }
                    else {
                        System.out.print("2, 3");
                        for (int i = 5; i <= n; i+=2) {
                            mitad = i/2;
                            mitad = (mitad%2 == 0) ? mitad + 1 : mitad;
                            for (int j = 3; j <= mitad; j+=2) {
                                if (i%j==0 && j!=mitad) {
                                    break;
                                } else if(i%j!=0 && j==mitad) {
                                    System.out.print(", " + i);
                                }
                            }
                        }
                    }
                    System.out.println(".");
                    System.out.println("FIN");
                    break;
                case 19:
                    System.out.println("19. (MUY DIFÍCIL) Escribe un programa que lea por pantalla un número entero y determine si es un palíndromo.");
                    n = sc.nextInt();
                    int m = n;
                    boolean esPal = true;
                    int longN = (n+"").length();
                    int longM = longN, cifraI, cifraNMenosI;
                    for (int i = 0; i < longN/2; i++) {
                        cifraI = m % 10;
                        cifraNMenosI = m/((int) Math.pow(10,longM-1)) % 10;
                        if (cifraI != cifraNMenosI) {
                            esPal = false;
                            break;
                        }
                        m %= (int) Math.pow(10,longM-1);
                        m /= 10;
                        longM -= 2;
                    }
                    System.out.println(esPal);
                    System.out.println("FIN");
                    break;
                case 20:
                    System.out.println("20. (NO HACER) Leer por pantalla dos números, a y b, y calcular su máximo común divisor.");
                    /*
                    Dato interesante sobre los divisores que no tiene que ver con este ejercicio:
                    Un número n puede descomponerse, mediante sus divisores, de la siguiente manera:
                    n = p * q
                    Como el orden de los factores no altera el producto, vamos a obviar soluciones del tipo
                    n = q * p, ya que sabemos por la operación de dos líneas más arriba que p y q son divisores
                    Por esa lógica, el caso más grande que tenemos que comprobar es cuando n es el resultado de un número
                    por sí mismo, ya que a partir de ahi hacia adelante ya lo habremos comprobado previamente.

                    Por lo tanto, los posibles divisores que hay que comprobar son los raizCuadrada-primeros numeros
                    */
                    System.out.println("20) Introduce primer numero para MCD: ");
                    n = sc.nextInt();
                    System.out.println("20) Introduce segundo numero para MCD: ");
                    m = sc.nextInt();
                    int temp;

                    //Algoritmo de Euclides:
                    /*
                    mcd(a,b) = a, si b = 0
                    = mcd (b, a módulo b), si b > 0
                    */

                    while (m!=0) {
                        temp = n;
                        n = m;
                        m = temp % m;
                    }
                    System.out.println("El máximo común divisor es " + n);
                    int mcd = n;
                    System.out.println("FIN");
                    break;
                case 21:
                    System.out.println("21. (NO HACER) Leer por pantalla dos números, a y b, y calcular su mínimo común múltiplo.");
                    /*
                    n*m = mcm(n,m) * mcd(n,m)
                    */
                    System.out.println("Introduce primer numero para mcm: ");
                    n = sc.nextInt();
                    System.out.println("Introduce segundo numero para mcm: ");
                    m = sc.nextInt();
                    int mcd2 = n;
                    int mcm = n*m/mcd2;

                    System.out.println("El mínimo común múltiplo es " + mcm);
                    System.out.println("FIN");
                    break;
                case 22:
                    System.out.println("22. (NO HACER) Leer por pantalla dos números, a y b, y comprobar si son coprimos" +
                            "(los números coprimos son aquellos que no tienen ningún factor primo en común).");
                    System.out.println("22) Introduce primer numero para ver si es coprimo con el que introducirás posteriormente: ");
                    n = sc.nextInt();
                    System.out.println("22) Introduce segundo numero para ver si es coprimo con el primero: ");
                    m = sc.nextInt();

                    boolean isCop = false;
                    int mcm2 = m;
                    if (n*m == mcm2) {
                        isCop = true;
                    }
                    System.out.println("¿Son coprimos?: Respuesta:" + isCop);
                    System.out.println("FIN");
                    break;
                case 23:
                    System.out.println("23. Leer por pantalla un número n, e imprimir por pantalla los n primeros términos de la sucesión de Fibonacci.");
                    /*
                    f(0) = 0
                    f(1) = 1
                    f(n) = f(n-1) + f(n-2)
                    */

                    System.out.println("Introduce cuantos números quieres de fibonacci :");
                    n = sc.nextInt();

                    int nM2 = 0;
                    int nM1 = 1;
                    int i = 2;

                    System.out.print(nM2 + ", " + nM1);
                    while (i<=n) {
                        temp = nM1 + nM2;
                        nM2 = nM1;
                        nM1 = temp;
                        System.out.print(", " + nM1);
                        i++;
                    }
                    System.out.println(".");

                    System.out.println("FIN");
                    break;
                case 24:
                    System.out.println("24. Leer por pantalla un número n, e imprimir por pantalla los n primeros términos de la sucesión de Pell.");
                    /*
                    f(0) = 0
                    f(1) = 1
                    f(n) = 2*f(n-1) + f(n-2)
                    */
                    System.out.println("24) Introduce cuantos números quieres de Pell :");
                    n = sc.nextInt();

                    nM2 = 0;
                    nM1 = 1;
                    i = 2;

                    System.out.print(nM2 + ", " + nM1);
                    while (i<=n) {
                        temp = 2*nM1 + nM2;
                        nM2 = nM1;
                        nM1 = temp;
                        System.out.print(", " + nM1);
                        i++;
                    }
                    System.out.println(".");
                    System.out.println("FIN");
                    break;
                case 25:
                    System.out.println("25. Escriba un programa que lea por pantalla un número y determine si es un número de Mersenne.");
                    System.out.println("25) Introduce numero para ver si es numero Mersenne :");
                    n = sc.nextInt();
                    m = n+1;
                    boolean isMersenne = false;

                    while (m%2==0) {
                        m /= 2;
                    }
                    if (m==1) {
                        isMersenne = true;
                    }
                    System.out.println(isMersenne);
                    System.out.println("FIN");
                    break;
                case 26:
                    System.out.println("26. Escriba un programa que imprima los 10 primeros números de Fermat.");
                    System.out.println("26) Introduce cuantos numeros quieres de Fermat : :");
                    n = sc.nextInt();

                    for (int j = 0; j < n; j++) {
                        System.out.println((int) Math.pow(2, Math.pow(2,j)) + 1);
                    }
                    System.out.println("FIN");
                    break;
                default:
                    System.out.println("Número incorrecto. Vuelve a introducirlo.");
                    break;
            }
        } while (n < 0 || n <= 26);
    }
}