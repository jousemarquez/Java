package BoletinHerencias;

public class Hombres extends SerTierraMedia{

    /*
    * Ejercicio 4: los siguientes fueron los hombres mortales, raza hermana de los elfos y
    enanos. Cree la clase Hombre y añádala a la jerarquía como estime conveniente. Los
    hombres fueron bendecidos por el creador con el don de la mortalidad (muchas gracias,
    máquina). Se caracterizan por tanto por el método morir, que no devuelve nada ni recibe
    nada, e imprime por pantalla una frase indicando que el personaje muere. También saben
    usar la espada.
    */

    void morir(){
        System.out.println("Este personaje ha cascado");
    }

    private void usarEspada(String target){
        // Golpea con la espada al objetivo.
    }

    @Override
    void hablar(String frase) {

    }

    @Override
    void moverse(String lugar) {

    }
}
