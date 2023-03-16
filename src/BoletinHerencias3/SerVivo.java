package BoletinHerencias3;

public class SerVivo {

    /*
    1. Cree una clase SerVivo que tenga en sus atributos las tres dimensiones posibles (alto, ancho y largo).
    Todo ser vivo se caracteriza porque puede realizar las siguientes tres acciones: interactuar con el medio,
    nutrirse y reproducirse. La implementación de estas acciones (y la del resto de ejercicios) no es relevante,
    vale con que al ejecutarse se imprima un mensaje por pantalla con un texto relativo a la acción.
    */

    float alto, ancho, largo;

    public void interactuarConElMedio(){
        System.out.printf("Interactúa con el medio");
    }

    public void nutrir(){
        System.out.println("Se nutre");
    }

    public void reproducirse(){
        System.out.println("Se reproduce");
    }
}