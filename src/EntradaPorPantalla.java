import java.util.Scanner;

public class EntradaPorPantalla {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in); // Método para añadir a la variable Int el valor
        System.out.println("Ejercicio 1: Recoge la edad del usuario");
        System.out.print("Introduce tu edad: "); // Impresión en pantalla para solicitar la introducción de datos
        int edad = scan.nextInt(); // Se declara el tipo de variable y se indica que se obtendrá introduciendo por el teclado
        System.out.println("Has introducido " + edad + " años"); // Impresión en pantalla del resultado, texto y variable

        System.out.println("----------------------------------");

        System.out.print("Introduce tu nueva edad: ");
        edad = scan.nextInt();
        System.out.println("Has introducido " + edad + " años");

        System.out.println("----------------------------------");

        int edad2;
        System.out.print("Introduce la edad2: ");
        edad2 = scan.nextInt();
        System.out.println("La segunda edad es: " + edad2 + " años");

        System.out.println("----------------------------------");

        System.out.println("Ejercicio 2: Recoge la altura del usuario");
        System.out.print("Introduce tu altura (en metros): ");
        float altura = scan.nextFloat();
        System.out.println("Has introducido " + altura + "m");

        System.out.println("----------------------------------");

        System.out.println("Controla si un alumno es repetidor o no");
        System.out.print("¿Eres repetidor? ");
        boolean esRepetidor = scan.nextBoolean();
        System.out.println("Repite?: " + esRepetidor);

        System.out.println("----------------------------------");

        System.out.println("Resultado de un número complejo");
        System.out.print("Cálculo bestialmente grande: ");
        double calc = scan.nextDouble();
        System.out.println("Has introducido " + calc);

        System.out.println("----------------------------------");

        System.out.println("Recoger el género de un usuario");
        System.out.print("Género: ");
        String genero = scan.next(); // En String, como no es una variable como tal, no se declara en el escáner
        System.out.println("Has introducido " + genero);

        System.out.println("----------------------------------");

        System.out.println("Recoger el cambio a devolver a un cliente en la panadería");
        System.out.print("Su cambio: ");
        float cambio = scan.nextFloat();
        System.out.println("Has introducido: " + cambio + "€");

        System.out.println("----------------------------------");

        System.out.println("Recoger el DNI");
        System.out.print("Introduce su DNI: ");
        String dni = scan.next();
        System.out.println("Has introducido: " + dni);

        System.out.println("----------------------------------");

        System.out.println("Recoger la matrícula");
        System.out.print("Introduce su matrícula: ");
        String matricula = scan.next();
        System.out.println("Has introducido: " + matricula);

        System.out.println("----------------------------------");

        System.out.println("Recoge la edad del usuario");
        System.out.print("Introduce tu edad: "); // Impresión en pantalla para solicitar la introducción de datos
        int age = scan.nextInt(); // Se declara el tipo de variable y se indica que se obtendrá introduciendo por el teclado
        System.out.println("Has introducido " + age + " años"); // Impresión en pantalla del resultado, texto y variable

        System.out.println("----------------------------------");

        System.out.println(edad+9);
        System.out.println(edad);
        age = age + 1;
        age += 4; // Esto equivale a escribir edad = edad + 1
        age -= 2; // Resta la edad
        age *= 3; // Multiplica la edad
        age /= 5; // Divide la edad
        age--; // Operador de decremento, coge la variable y le resta 1, es equivalente a -=
        age++; // Operador de decremento, coge la variable y le suma 1, es equivalente a +=
        System.out.println("Valor final de edad: " + age);
        System.out.println("4%2 ->" + 4%2); // Operador Módulo. "4 módulo 2". Lo que muestra es el RESTO de la división resultante. En este caso es 0
        System.out.println("5%2 ->" + 5%2);
        System.out.println(age%2);
        float valor = 3 + (4/2 * 5) - 1;
        System.out.println(valor);// Aunque se sepa el orden de jerarquía, se usa paréntesis para declarar el orden de operaciones.
        System.out.println("FIN");

        //EJERCICIOS JUEVES 5 OCTUBRE

        System.out.println("1. Imprime por pantalla tu nombre.");
        System.out.println("José Antonio");

        System.out.println("----------------------------------");

        System.out.println("2. Imprime por pantalla tu nombre y dos apellidos, cada uno en una línea.");
        System.out.println("José Antonio");
        System.out.println("Márquez");
        System.out.println("Flores");

        System.out.println("----------------------------------");

        System.out.println("3.a Repite el ejercicio anterior pero imprimiendo todo en la misma línea.");
        System.out.println("José Antonio Márquez Flores");

        System.out.println("----------------------------------");

        System.out.println("3.b Repite el ejercicio anterior imprimiendo todo en la misma línea, usando tres instrucciones de impresión.");
        String name = "José Antonio";
        String surname1 = "Márquez";
        String surname2 = "Flores";
        System.out.println(name + " " + surname1 + " " + surname2);

        System.out.println("----------------------------------");

        System.out.println("4. Imprime tu edad.");
        System.out.println(35 + " años");

        System.out.println("----------------------------------");

        System.out.println("5. Imprime el primer digito de tu edad en una línea, y el segundo en otra.");
        System.out.println(3);
        System.out.println(5);

        System.out.println("----------------------------------");

        System.out.println("6. Imprime el primer digito de tu edad. Tras ello y con una nueva instrucción, imprime el segundo. Tienen que aparecer ambos en la misma línea.");
        System.out.print(3);
        System.out.println(5);

        System.out.println("----------------------------------");

        System.out.println("7. Imprime al revés tu nombre, de forma que cada letra aparezca en una línea.");
        System.out.println("é");
        System.out.println("s");
        System.out.println("o");
        System.out.println("J");

        System.out.println("----------------------------------");

        System.out.println("8. Repite lo anterior, pero entre cada letra debe aparecer una línea en blanco.");
        System.out.println("J");
        System.out.println();
        System.out.println("o");
        System.out.println();
        System.out.println("s");
        System.out.println();
        System.out.println("é");

        System.out.println("----------------------------------");

        System.out.println("9. Imprime por pantalla tu nombre concatenándolo con tu edad, de forma que quede un espacio en blanco entre ambos.");
        System.out.println("José Antonio " + 35);

        System.out.println("----------------------------------");

        System.out.println("10. Imprime por pantalla el número 3 concatenándolo con el número 7. Comprueba si tu compañero lo ha hecho igual que tú.");
        System.out.println('3'+'7');

        System.out.println("----------------------------------");

        System.out.println("11. Imprime por pantalla la cadena \"Hola mundo\" y a continuación, la cadena \"Hola\\nmundo\". ¿Para qué sirve el '\\n'? ¿Puede utilizarse varias veces seguidas?");
        System.out.println("Hola mundo");
        System.out.println("Hola\n\n\n\nmundo");
        System.out.println("Respuesta: sí, se puede usar \\n tantas veces como se quiera. Este componente se llama secuencia de escape.");

        System.out.println("----------------------------------");

        System.out.println("12. ¿Para qué sirve el operador '+'?");
        System.out.println("Respuesta: para concatenar elementos");
        System.out.println("FIN");

        //EJERCICIO JUEVES 6 OCTUBRE


        System.out.println("1. Crear una variable entera e imprimirla por pantalla sin asignarle ningún valor.\n" +
                "* ¿Qué se ha impreso?");
        int eje1 = 0;
        System.out.println(eje1);

        System.out.println("----------------------------------");

        System.out.println("2. Crear una variable entera con el valor 0. Incrementar su valor en 3 unidades utilizando el operador\n" +
                "de suma + y asignación =, e imprimirla por pantalla.\n");
        int eje2 = 0;
        eje2 += 3;
        System.out.println(eje2);

        System.out.println("----------------------------------");

        System.out.println("2. Decrementar su valor en una unidad utilizando el operador de decremento --. Imprimirla por pantalla.\n");
        eje2 -= 1;
        System.out.println(eje2);

        System.out.println("----------------------------------");

        System.out.println("3. Incrementar su valor en 4 unidades sin utilizar el operador de suma + y asignación =, e imprimirla por pantalla.\n");
        eje2++;
        eje2++;
        eje2++;
        eje2++;
        System.out.println(eje2);

        System.out.println("----------------------------------");

        System.out.println("4. Crear otra variable entera y asignarle el valor 48.76.\n");
        float eje4 = 48.76f; // No es posible crear un entero con decimales, la única forma es declararlo, al menos, como tipo float.
        System.out.println(eje4);
        System.out.println("o");
        int eje5 = 48;
        System.out.println(eje5);

        System.out.println("----------------------------------");

        System.out.println("5. Modifica la variable dividiéndola por 50 e imprimir el resultado por pantalla.\n");
        eje4 /= 50;
        System.out.println(eje4);

        System.out.println("----------------------------------");

        System.out.println("6. Modificarla sumándole 1 y multiplicando por 48 e imprimir el resto de dividirla entre 46.\n");
        eje4 += 1;
        eje4 *= 48;
        System.out.println(eje4%46);

        System.out.println("----------------------------------");

        System.out.println("7. Sin modificar el valor de la variable, imprimir por pantalla el resultado de elevarla al cuadrado.\n");

        System.out.println("El número anterior elevado al cuadrado es: " +Math.pow(eje4, 2));

        System.out.println("----------------------------------");

        System.out.println("8. Crear dos variables de tipo float, dándoles un valor inicial e imprimiéndolas por pantalla.\n");
        float a,b;
        System.out.println("Da valor a la variable a: ");
        a = scan.nextFloat();
        System.out.println("Da valor a la variable b: ");
        b = scan.nextFloat();
        System.out.println("Las dos variables son: " + a +" y "+ b);

        System.out.println("----------------------------------");

        System.out.println("9. Imprimir por pantalla el resultado de comprobar si la primera es mayor que la segunda.\n");

        if (a > b) {

            System.out.println("a es mayor que b");
        }

        else {
            System.out.println("a es menor que b");
        }

        System.out.println("También se puede declarar como:");
        System.out.println("a>b");
        boolean result = (a>b);
        System.out.println(result);

        System.out.println("----------------------------------");

        System.out.println("10. Cambiar la primera con el valor de la segunda multiplicado por dos, y volver a imprimir por pantalla\n" +
                "el resultado de la comprobación anterior.");
        a = b*2;
        System.out.println(a>b);//10

        System.out.println("----------------------------------");

        System.out.println("11. Imprimir por pantalla el resultado de comprobar si la primera es menor o igual que la segunda.");

        System.out.println(a<b); //11

        System.out.println("----------------------------------");

        System.out.println("12. Repetir el ejercicio anterior pero almacenando el resultado de la comprobación\n" +
                "en una variable, e imprimiendo después por pantalla dicha variable.");

        boolean resultado = a<=b;
        System.out.println(resultado);

        System.out.println("----------------------------------");

        System.out.println("Entrada por pantalla. Boletín 4");
        System.out.println("1. Lee por pantalla un nombre y almacénalo en una variable. Imprime la variable\n" +
                "         * por pantalla.");

        System.out.println("Ingrese su nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Tu nombre es: "+nombre+".");
        System.out.println("---------------------");

        System.out.println("2. Lee por pantalla una edad y almacénalo en una variable. Imprime la variable\n" +
                "         * por pantalla.");
        int age2 = scan.nextInt();
        System.out.println("Ingrese su edad: ");
        System.out.println("Tu edad es: "+age2+ " años.");
        System.out.println("---------------------");

        System.out.println("3. ¿Pueden modificarse los ejercicios anteriores para ahorrarse la variable?");
        scan.nextLine();
        System.out.println("Cómo te llamas: ");
        System.out.println(nombre);
        System.out.println("---------------------");

        System.out.println("4.a Lee por pantalla una temperatura en grados Celsius e imprímela por pantalla.");
        float celsius = scan.nextFloat();
        System.out.println("Indique los grados: ");
        System.out.println("La temperatura es de: "+celsius +"ºC.");
        System.out.println("---------------------");

        System.out.println("4.b Repite pero imprimiendo por pantalla en grados Kelvin (hay que convertir).");
        float kelvin = scan.nextFloat();
        System.out.println("La temperatura es de: "+(kelvin+273.15) +" K.");
        System.out.println("---------------------");

        System.out.println("5. Crea un programa que calcule el área de un rectángulo (base x altura),\n" +
                "         * pidiendo por pantalla los datos necesarios.");
        float base;
        float height;
        System.out.println("Ingrese el valor de la base: ");
        base = scan.nextFloat();
        System.out.println("Ingrese el valor de la base: ");
        height = scan.nextFloat();
        System.out.println("El área del rectángulo es: "+base*height);
        System.out.println("---------------------");

        System.out.println("6. Crea un programa que calcule el Índice de Masa Corporal (IMC), pidiendo\n" +
                "         * por pantalla los datos necesarios.");
        float pesoIMC,alturaIMC;
        System.out.println("Ingrese el valor de su peso en kg: ");
        pesoIMC = scan.nextFloat();
        System.out.println("Ingrese el valor de su altura en m: ");
        alturaIMC = scan.nextFloat();
        //float IMC = pesoIMC/(alturaIMC*alturaIMC);
        double IMC = pesoIMC/(Math.pow(alturaIMC,2));
        if (IMC<18.5){
            System.out.println("Su índice IMC es: "+IMC+" Composición corporal está por debajo de la media");
        } else if (18.5<IMC && IMC<24.9){
            System.out.println("Su índice IMC es: "+IMC+" Composición corporal está en la media");
        } else if (25.0<IMC && IMC<29.9){
            System.out.println("Su índice IMC es: "+IMC+" Composición corporal es superior a la media");
        }else
            System.out.println("Su índice IMC es: "+IMC+" y su composición corporal es obesidad");

        System.out.println("---------------------");

        System.out.println("7. Crea un programa que lea el precio sin IVA de un producto e imprima\n" +
                "         * el valor final con IVA del mismo.");
        float sinIVA,IVA;
        System.out.println("Ingrese el importe del producto sin IVA: ");
        sinIVA = scan.nextFloat();
        System.out.println("Ingrese el IVA a aplicar: ");
        IVA = scan.nextFloat();
        System.out.println("El precio del producto con IVA es: "+sinIVA*(1+IVA/100)+" €.");

        System.out.println("---------------------");

        System.out.println("8. Crea un programa que lea el precio sin IVA de tres productos e imprima\n" +
                "         * el valor total con IVA que paga el comprador, así como el valor medio con y sin\n" +
                "         * IVA.");
        float pro1,pro2,pro3,IVA2,total;
        System.out.println("Ingrese el precio del producto 1: ");
        pro1 = scan.nextFloat();
        System.out.println("Ingrese el precio del producto 2: ");
        pro2 = scan.nextFloat();
        System.out.println("Ingrese el precio del producto 3: ");
        pro3 = scan.nextFloat();
        System.out.println("Ingrese el % de IVA a aplicar: ");
        IVA2 = scan.nextFloat();
        total = pro1*(1+IVA2/100)+pro2*(1+IVA2/100)+pro3*(1+IVA2/100);
        System.out.println("El valor total de todos los productos es: "+total+" € y la media" +
                "es "+total/3+" €.");
        System.out.println("----------------------");

        System.out.println("9. Crea un programa que lea el nombre de una persona, y a continuación su edad\n" +
                "         * y altura, e imprima todo por pantalla en una misma línea. ¿Funciona?");
        System.out.println("Ingrese su nombre: ");
        String name2 = scan.nextLine();
        System.out.println("Ingrese su edad: ");
        int age3 = scan.nextInt();
        System.out.println("Ingrese su altura en m: ");
        float height2 = scan.nextFloat();
        System.out.println("Su nombre es "+name2+" tiene "+age3+" años y mide "+height2+" m de altura");
        System.out.println("----------------------");

        System.out.println("10. Repita el ejercicio anterior pero leyendo primero los numeros y después\n" +
                "         * el nombre. ¿Funciona?");
        System.out.println("Ingrese su edad: ");
        int age4 = scan.nextInt();
        System.out.println("Ingrese su altura en m: ");
        float height3 = scan.nextFloat();
        scan.nextLine();//Hay que declararlo por el problema del salto de línea.
        System.out.println("Ingrese su nombre: ");
        String name3 = scan.next();
        System.out.println("Su nombre es "+name3+" tiene "+age4+" años y mide "+height3+" m de altura");
        System.out.println("----------------------");
    }
}
