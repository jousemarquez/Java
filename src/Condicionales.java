import java.util.Scanner;


public class Condicionales {
    public static void main(String[] args, Scanner rand) {
        /*Este programa recoge las prácticas que hemos realizado en clase sobre los Condicionales*/
        /*Ejemplo de IF y ELSE*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        float edad = sc.nextFloat();
        if (edad >= 18) {
            System.out.println("El usuario tiene " + edad + " años, tiene permiso para usar la aplicación.");
        } else {
            System.out.println("El usuario tiene " + edad + " años, no tiene permiso para usar la aplicación.");
        }
        System.out.println("FIN");

        /*Ejemplo de IF, ELSE IF y ELSE*/
        System.out.println("Introduce la temperatura: ");
        float temperatura = sc.nextInt();
        if (temperatura < 0) {
            System.out.println("La temperatura es negativa");
        } else if (temperatura == 0) {
            System.out.println("La temperatura es neutra");
        } else {
            System.out.println("La temperatura es positiva");
        }
        System.out.println("FIN");

        /*Ejemplo de SWITCH. En vez de usar un sistema if-else if para este programa, lo óptimo es usar switch debido a que los Switch está pensado para operar con ciertas variables.*/
        System.out.println("Introduce un día (1-7): ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido");
                break;
        }
        System.out.println("FIN");

        System.out.println("1. Leer dos números enteros e imprimir el mayor de ellos.");
        System.out.println("Ingrese el valor de a: ");
        int eje1a = sc.nextInt();
        System.out.println("Ingrese el valor de b: ");
        int eje1b = sc.nextInt();
        if (eje1a > eje1b) {
            System.out.println("a = " + eje1a);
        } else {
            System.out.println("b = " + eje1b);
        }
        System.out.println("FIN");

        System.out.println("2. Leer un entero y comprobar si es negativo o positivo, imprimiendo por pantalla una frase al respecto. Considere el cero como positivo.");
        System.out.println("Ingrese el valor de a: ");
        int eje2a = sc.nextInt();
        if (eje2a > 0) {
            System.out.println("El valor de a positivo.");
        } else {
            System.out.println("El valor de a es negativo.");
        }
        System.out.println("FIN");

        System.out.println("3. Modifique el ejercicio anterior para que, en caso de introducir un cero, se imprima por pantalla un mensaje específico.");
        System.out.println("Ingrese el valor de a: ");
        int eje3a = sc.nextInt();
        if (eje3a == 0) {
            System.out.println("El valor de a es igual a 0.");
        } else if (eje3a > 0) {
            System.out.println("El valor de a es positivo.");
        } else {
            System.out.println("El valor de a es negativo.");
        }
        System.out.println("FIN");

        System.out.println("4. Leer una edad y comprobar si la persona es mayor de edad, imprimiendo una frase al respecto. Si es menor, imprimir también un mensaje.");
        int eje4a = sc.nextInt();
        if (eje4a > 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
        System.out.println("FIN");

        System.out.println("5. Modificar el ejercicio anterior para que además se compruebe si es jubilado (tiene más de 67años), imprimiendo un mensaje al respecto.");
        int eje5a = sc.nextInt();
        if (eje5a >= 67) {
            System.out.println("Es jubilado.");
        } else if (eje5a < 18) {
            System.out.println("Es menor de edad.");
        } else {
            System.out.println("Es mayor de edad.");
        }
        System.out.println("FIN");

        System.out.println("6. Modificar el ejercicio anterior para que solo se permita una edad válida (0 a 120)." +
                "En caso de ser válida hará todo lo implementado anteriormente." +
                "En caso de ser inválida, se imprimirá un mensaje de error y el programa acabará.");
        System.out.println("Introduce tu edad (0-120): ");
        int eje6a = sc.nextInt();
        if (eje6a < 0 || eje6a > 120) {
            System.out.println("El dato introducido es incorrecto.");
        } else if (eje6a >= 67) {
            System.out.println("Es jubilado.");
        } else if (eje6a <= 18) {
            System.out.println("Es menor de edad.");
        } else {
            System.out.println("El usuario es mayor de edad.");
        }

        //7. Leer seis números y comprobar si coinciden con la combinación ganadora de la primitiva (1, 3, 10, 20, 33, 40),
        // imprimiendo un mensaje al respecto.
        System.out.println("7. Leer seis números y comprobar si coinciden con la combinación ganadora de la primitiva (1, 3, 10, 20, 33, 40), " +
                "imprimiendo un mensaje al respecto.");
        System.out.println("Introduzca el primer número: ");
        int eje7a = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int eje7b = sc.nextInt();
        System.out.println("Introduzca el tercer número: ");
        int eje7c = sc.nextInt();
        System.out.println("Introduzca el cuarto número: ");
        int eje7d = sc.nextInt();
        System.out.println("Introduzca el quinto número: ");
        int eje7e = sc.nextInt();
        System.out.println("Introduzca el sexto número: ");
        int eje7f = sc.nextInt();
        if (eje7a == 1 && eje7b == 3 && eje7c == 10 && eje7d == 20 && eje7e == 33 && eje7f == 40) {
            System.out.println("¡Enhorabuena, ha ganado la LOTERÍA!");
        } else {
            System.out.println("Sigue trabajando en el McDonald's");
        }
        System.out.println("FIN");

        //8. Modificar el ejercicio anterior para que, al leerlos, se compruebe si todos los números leídos tienen el rango apropiado
        // (entre 1 y 49). Si no lo tienen, imprimir un mensaje de error y el programa acabará.
        System.out.println("7. Modificar el ejercicio anterior para que, al leerlos, se compruebe si todos los números leídos tienen el rango apropiado " +
                "(entre 1 y 49). Si no lo tienen, imprimir un mensaje de error y el programa acabará.");
        System.out.println("Introduzca el primer número (1-49): ");
        int eje8a = sc.nextInt();
        System.out.println("Introduzca el segundo número (1-49): ");
        int eje8b = sc.nextInt();
        System.out.println("Introduzca el tercer número (1-49): ");
        int eje8c = sc.nextInt();
        System.out.println("Introduzca el cuarto número (1-49): ");
        int eje8d = sc.nextInt();
        System.out.println("Introduzca el quinto número (1-49): ");
        int eje8e = sc.nextInt();
        System.out.println("Introduzca el sexto número (1-49): ");
        int eje8f = sc.nextInt();
        if (eje8a < 1 || eje8a > 49 || eje8b < 1 || eje8b > 49 || eje8c < 1 || eje8c > 49 || eje8d < 1 || eje8d > 49 || eje8e < 1 || eje8e > 49 || eje8f < 1 || eje8f > 49) {
            System.out.println("El/los datos introducidos no son correctos.");
        } else if (eje8a == 1 && eje8b == 3 && eje8c == 10 && eje8d == 20 && eje8e == 33 && eje8f == 40) {
            System.out.println("¡Enhorabuena, ha ganado la LOTERÍA!");
        } else {
            System.out.println("Sigue trabajando en el McDonald's");
        }
        System.out.println("FIN");

        System.out.println("9. Leer por pantalla un entero y comprobar si es par o impar (use el operador módulo %).");
        System.out.println("Introducir un número: ");
        int eje9a = sc.nextInt();
        if (eje9a % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        System.out.println("FIN");

        System.out.println("Crear un programa que calcule el índice de masa corporal. Lea los datos que sean necesarios, imprima por pantalla el índice, " +
                "y dependiendo de su valor imprima al usuario un mensaje informativo. Por ejemplo: está por debajo de lo normal, " +
                "está normal o está por encima de lo normal.");
        float pesoIMC, alturaIMC;
        System.out.println("Ingrese el valor de su peso en kg: ");
        pesoIMC = sc.nextFloat();
        System.out.println("Ingrese el valor de su altura en m: ");
        alturaIMC = sc.nextFloat();
        //float IMC = pesoIMC/(alturaIMC*alturaIMC);
        double IMC = pesoIMC / (Math.pow(alturaIMC, 2));
        if (IMC < 18.5) {
            System.out.println("Su índice IMC es: " + IMC + " Composición corporal está por debajo de la media");
        } else if (IMC < 24.9) {
            System.out.println("Su índice IMC es: " + IMC + " Composición corporal está en la media");
        } else if (IMC < 30) {
            System.out.println("Su índice IMC es: " + IMC + " Composición corporal es superior a la media");
        } else {
            System.out.println("Su índice IMC es: " + IMC + " y su composición corporal es obesidad");
        }
        System.out.println("FIN");

        System.out.println("11. Leer por pantalla un número entre 1 y 12 e imprimir por pantalla el nombre del mes correspondiente." +
                "En caso de leer un número fuera de rango, imprimir por pantalla un mensaje de error.");
        System.out.println("Introduzca un número para descubrir el mes (1-12): ");
        int mes = sc.nextInt();
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
                System.out.println("Número no válido");
                break;
        }
        System.out.println("FIN");

        System.out.println("12. Establezca un número entre 0 y 9999, que servirá como contraseña. Puede elegir el que desee." +
                "Pida por pantalla un número y si coincide escriba “Contraseña correcta, accediendo al sistema”," +
                "en caso contrario escriba “Contraseña incorrecta, cerrando sesión”.");
        System.out.println("Establezca una contraseña (0-9999): ");
        int eje12a = sc.nextInt();
        if (eje12a < 0 || eje12a > 9999) {
            System.out.println("Contraseña incorrecta, cerrando sesión.");
        } else {
            System.out.println("Contraseña correcta, accediendo al sistema.");
        }
        System.out.println("FIN");

        System.out.println("13. Desarrolle un sistema de cálculo de descuentos para una farmacia. Cuando el usuario introduzca un precio," +
                "usted deberá aplicar un descuento del 15% a ese valor, e imprimir por pantalla el precio final." +
                "Recuerde que debe imprimir el precio final tras aplicar el descuento, no la cantidad que se descuenta.");
        System.out.println("Introduzca un precio: ");
        float precio = sc.nextFloat();
        System.out.println("El precio final del producto es: " + (precio * 0.85f) + " €.");
        System.out.println("FIN");

        System.out.println("14. Modifique el anterior para que además se imprima la cantidad que se descuenta.");
        System.out.println("Introduzca un precio: ");
        float precio2 = sc.nextFloat();
        System.out.println("Descuento aplicado:" + (precio2 * 0.15f) + " €.");
        System.out.println("FIN");

        System.out.println("15. Diseñe un programa que lea la temperatura en centígrados del día e imprima el tipo de clima de acuerdo" +
                "a la siguiente tabla.");
        System.out.println("Introduzca la temperatura en grados C: "); // Método Joaquín = Eficiente
        float temperatura2 = sc.nextInt();
        if (temperatura2 <= 10) {
            System.out.println("Tipo de clima: frio.");
        } else if (temperatura2 < 20) {
            System.out.println("Tipo de clima: nubloso.");
        } else if (temperatura2 < 30) {
            System.out.println("Tipo de clima: caluroso.");
        } else {
            System.out.println("Tipo de clima: tropical.");
        }
        System.out.println("Introduzca la temperatura en grados C: "); // Método Jorge = Lectura
        float temperatura3 = sc.nextInt();
        if (temperatura3 < 10) {
            System.out.println("Tipo de clima: frío.");
        } else if (temperatura3 >= 10 && temperatura3 < 20) {
            System.out.println("Tipo de clima: caluroso.");
        } else if (temperatura3 >= 20 && temperatura3 < 30) {
            System.out.println("Tipo de clima: caluroso.");
        } else {
            System.out.println("Tipo de clima: tropical.");
        }
        System.out.println("FIN");

        System.out.println("16. Pedir un número entre 0 y 99999 y decir cuántas cifras tiene.");
        System.out.println("Ingrese un número (0-99999): ");
        sc.nextLine();
        float eje16a = sc.nextFloat();
        if (eje16a < 10) {
            System.out.println("El número tiene 1 cifra");
        } else if (eje16a < 100) {
            System.out.println("El número tiene 2 cifras");
        } else if (eje16a < 1000) {
            System.out.println("El número tiene 3 cifras");
        } else if (eje16a < 10000) {
            System.out.println("El número tiene 4 cifras");
        } else if (eje16a < 99999) {
            System.out.println("El número tiene 5 cifras");
        } else {
            System.out.println("Error. El número introducido no está en rango correcto (0-99999).");
        }
        System.out.println("FIN");

        // Solución con incrementales
        System.out.println("Ingrese un número (0-99999): ");
        int i, cont = 1;
        i = sc.nextInt();
        if (i > 10) {
            i = i / 10;
            cont++;
        }
        if (i > 10) {
            i = i / 10;
            cont++;
        }
        if (i > 10) {
            i = i / 10;
            cont++;
        }
        if (i > 10) {
            i = i / 10;
            cont++;
        }
        if (i > 10) {
            i = i / 10;
            cont++;
        }
        System.out.println("El número tiene" + cont + "digitos");
        System.out.println("FIN");

        System.out.println("17. La universidad ha categorizado las matrículas de acuerdo a la facultad que va a estudiar el postulante." +
                "Ingrese por teclado el nombre de la facultad donde va a estudiar, y muestre el importe y la mensualidad." +
                "(Use el control switch-case, y recuerde que el nombre que introduzca debe coincidir exactamente con el nombre de universidad).");
        String uni = sc.nextLine();
        sc.nextLine();
        switch (uni) {
            case "Ing. de Sistemas":
                System.out.println("350-650");
                break;
            case "Derecho":
                System.out.println("300-550");
                break;
            case "Ing. Naviera":
                System.out.println("300-500");
                break;
            case "Ing. Pesquera":
                System.out.println("310-460");
                break;
            case "Contabilidad":
                System.out.println("280-490");
                break;
            case "Administración":
                System.out.println("360-520");
                break;
            default:
                System.out.println("Nombre inválido");
                break;
        }
        System.out.println("FIN");

        System.out.println("18. Escriba programa para ingresar 4 notas de un alumno, calcular y mostrar su promedio," +
                "sabiendo que la primera y segunda tiene 20% de peso cada una, la tercera y cuarta tienen 30% de peso cada una.");
        System.out.println("Introduce la nota del alumno ");
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        float nota4 = sc.nextFloat();
        float notaFinal = ((nota1 + nota2) * 0.20f) + ((nota3 + nota4) * 0.30f);
        System.out.println("Las notas son " + notaFinal);
        System.out.println("FIN");


        System.out.println("19. Desarrolle un programa que pida cuantos hombres y mujeres hay en un aula y" +
                "permita calcular el porcentaje de hombres y mujeres.");
        System.out.println("Introduce cuantos hombres hay en tu aula: ");
        int men = sc.nextInt();
        System.out.println("Introduce cuantos mujeres hay en tu aula: ");
        int women = sc.nextInt();
        float Total = men + women;

        System.out.println("Total de porcentaje de hombres: " + (men / Total) * 100 + "%");
        System.out.println("Total de porcentaje de mujeres: " + (women / Total) * 100 + "%");
        System.out.println("FIN");

        System.out.println("21. Leer por pantalla dos números enteros, e imprimirlos por pantalla en orden creciente.");
        System.out.println("Ingrese el primer número: ");
        int eje21a = sc.nextInt();
        System.out.println("Ingrese el primer número: ");
        int eje21b = sc.nextInt();
        if (eje21a < eje21b) {
            System.out.println(eje21a + " " + eje21b);
        } else if (eje21b < eje21a) {
            System.out.println(eje21b + " " + eje21a);
        }
        System.out.println("FIN");

        System.out.println("22. Leer por pantalla tres números enteros, e imprimirlos por pantalla en orden creciente.");
        System.out.println("Ingrese el primer número: ");
        int eje22a = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int eje22b = sc.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int eje22c = sc.nextInt();
        int temp;
        if (eje22a > eje22c) {
            temp = eje22a;
            eje22a = eje22c;
            eje22c = temp;
        }
        if (eje22a > eje22b) {
            temp = eje22a;
            eje22a = eje22b;
            eje22b = temp;
        }
        if (eje22b > eje22c) {
            temp = eje22b;
            eje22b = eje22c;
            eje22c = temp;
        }
        System.out.println(eje22a);
        System.out.println(eje22b);
        System.out.println(eje22c);
        System.out.println("FIN");

        System.out.println("23. Repetir el ejercicio anterior, e imprimirlos en orden decreciente.");
        System.out.println("Ingrese el primer número: ");
        int eje23a = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int eje23b = sc.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int eje23c = sc.nextInt();
        int temp2;
        if (eje23a < eje23c) {
            temp2 = eje23a;
            eje23a = eje23c;
            eje23c = temp2;
        }
        if (eje23a < eje23b) {
            temp2 = eje23a;
            eje23a = eje23b;
            eje23b = temp2;
        }
        if (eje23b < eje23c) {
            temp2 = eje23b;
            eje23b = eje23c;
            eje23c = temp2;
        }
        System.out.println(eje23a);
        System.out.println(eje23b);
        System.out.println(eje23c);
        System.out.println("FIN");

        System.out.println("24. Lea un número por pantalla y determine si es múltiplo de 10 (use el operador módulo).");
        System.out.println("Introduce un número: ");
        int eje24a = sc.nextInt();
        if (eje24a % 10 == 0) {
            System.out.println(eje24a + "Es múltiplo de 10.");
        } else {
            System.out.println(eje24a + "No es múltiplo de 10.");
        }
        System.out.println("FIN");

        System.out.println("25. Leer por pantalla un número de tres cifras, e imprimir cada una de sus cifras en una línea.");
        System.out.println("Introduce un número de 3 cifras (000-999): ");
        int eje25a = sc.nextInt();
        if (eje25a > 999 || eje25a < 100) {
            System.out.println("Error. El número es incorrecto, vuelva a introducir un entero de 3 cifras (000-999).");
        } else {
            System.out.println(eje25a%10);
            eje25a = eje25a / 10;
            System.out.println(eje25a%10);
            eje25a = eje25a / 10;
            System.out.println(eje25a);
        }
        System.out.println("FIN");

        System.out.println("26. Crea una aplicación llamada CalculadoraInversa, que lea por pantalla dos operandos (String)" +
                "y un signo aritmético (String), y según este último se realizará la operación correspondiente." +
                "Al final mostrará el resultado en consola. Los signos aritméticos disponibles son:");
        System.out.println("Soy una calculadora, voy a operar con los numeros que me digas.");
        System.out.println("Dime el numero 1:");
        int eje26a = sc.nextInt();
        System.out.println("Dime el numero 2:");
        int eje26b = sc.nextInt();
        System.out.println("Ahora dime con que operador quieres realizar la operacion:");
        System.out.println("[+]" + "\t" + "[-]" + "\t" + "[/]" + "\t" + "[*]" + "\t" + "[%]");
        String operador = sc.next();
        switch (operador) {
            case "+":
                System.out.println("El resultado es: " + (eje26a + eje26b));
                break;
            case "-":
                System.out.println("El resultado es: " + (eje26a - eje26b));
                break;
            case "/":
                System.out.println("El resultado es: " + (eje26a / eje26b));
                break;
            case "*":
                System.out.println("El resultado es: " + (eje26a * eje26b));
                break;
            case "%":
                System.out.println("El resultado es: " + (eje26a % eje26b));
                break;
            default:
                System.out.println("El dato introducido es erróneo.");
                break;
        }
        System.out.println("FIN");

        System.out.println("27. En un casino de juegos se desea mostrar los mensajes respectivos por el puntaje obtenido en el lanzamiento de tres dados de un cliente, de acuerdo a los siguientes resultados:");
        int dado = 6;
        int dado2 = 6;
        int dado3 = 6;
        int dadoRand = rand.nextInt(dado) + 1;
        int dadoRand2 = rand.nextInt(dado2) + 1;
        int dadoRand3 = rand.nextInt(dado3) + 1;

        System.out.println(dadoRand + " " + dadoRand2 + " " + dadoRand3);
        if (dadoRand == 6 && dadoRand2 == 6 && dadoRand3 == 6) {
            System.out.println("Muy buena suerte.");
        } else if ((dadoRand == 6 && dadoRand2 == 6) || (dadoRand == 6 && dadoRand3 == 6) || (dadoRand2 == 6 && dadoRand3 == 6)) {
            System.out.println("Buena suerte.");
        } else if (dadoRand == 6 || dadoRand2 == 6 || dadoRand3 == 6) {
            System.out.println("Mala suerte");
        } else {
            System.out.println("Muy mala suerte");
        }
        System.out.println("FIN");
    }
}