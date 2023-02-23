package POO.Persona;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jouse", 36, "23313454X", 'H', 120, 182);
        Persona persona2 = new Persona("Alberto", 20, 'H');
        Persona persona3 = new Persona();
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

        // Comprobar DNI
        System.out.println(persona2.generarDNI());

        /*
        * Ahora, crea una clase ejecutable que haga lo siguiente:
         Pide por teclado el nombre, la edad, sexo, peso y altura.
         Crea 3 objetos de la clase anterior, el primer objeto obtendrá las
        anteriores variables pedidas por teclado, el segundo objeto
        obtendrá todos los anteriores menos el peso y la altura y el último
        por defecto, para este último utiliza los métodos set para darle a
        los atributos un valor.
         Para cada objeto, deberá comprobar si está en su peso ideal, tiene
        sobrepeso o por debajo de su peso ideal con un mensaje.
         Indicar para cada objeto si es mayor de edad.
         Por último, mostrar la información de cada objeto.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = sc.next();




    }
}
