package poo.Persona;

import java.util.Scanner;

public class EjecutablePersona {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pide por teclado los datos de la primera persona
        System.out.println("Introduce los datos de la primera persona:");
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Sexo (H/M): ");
        char sexo = sc.nextLine().charAt(0);
        System.out.print("Peso (kg): ");
        float peso = sc.nextFloat();
        System.out.print("Altura (cm): ");
        float altura = sc.nextFloat();

        // Crea el primer objeto Persona
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        // Pide por teclado los datos de la segunda persona (sin peso ni altura)
        Persona persona2 = new Persona(nombre, edad, sexo);

        // Crea el tercer objeto Persona con los valores por defecto y usa los métodos set para darles valores
        Persona persona3 = new Persona();
        persona3.setNombre("Persona 3");
        persona3.setEdad(30);
        persona3.setSexo(Persona.MUJER);
        persona3.setPeso(80.5f);
        persona3.setAltura(180.0f);

        // Comprueba el estado de peso de cada objeto
        System.out.println("Estado de peso de cada persona:");
        System.out.println("Persona 1: " + persona1.calcularIMC());
        System.out.println("Persona 2: " + persona2.calcularIMC());
        System.out.println("Persona 3: " + persona3.calcularIMC());

        // Comprueba si cada objeto es mayor de edad
        System.out.println("¿Es mayor de edad cada persona?");
        System.out.println("Persona 1: " + persona1.esMayorDeEdad());
        System.out.println("Persona 2: " + persona2.esMayorDeEdad());
        System.out.println("Persona 3: " + persona3.esMayorDeEdad());

        // Muestra la información de cada objeto
        System.out.println("Información de cada persona:");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }

    public static void imprimirIMC(Persona persona){
        if (persona.calcularIMC() == Persona.PESOBAJO){
            System.out.println("Peso bajo");
        } else if (persona.calcularIMC() == Persona.PESOMEDIO) {
            System.out.println("Peso medio");
        } else if (persona.calcularIMC() == Persona.PESOALTO) {
            System.out.println("Peso alto");
        }
    }
}

