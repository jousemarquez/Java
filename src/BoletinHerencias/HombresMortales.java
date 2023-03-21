package BoletinHerencias;

public class HombresMortales extends SerTierraMedia{

    /*
    * Ejercicio 4: los siguientes fueron los hombres mortales, raza hermana de los elfos y
    enanos. Cree la clase Hombre y añádala a la jerarquía como estime conveniente. Los
    hombres fueron bendecidos por el creador con el don de la mortalidad (muchas gracias,
    máquina). Se caracterizan por tanto por el método morir, que no devuelve nada ni recibe
    nada, e imprime por pantalla una frase indicando que el personaje muere. También saben
    usar la espada.
    */

    public HombresMortales() {
        super();
    }

    public HombresMortales(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    private void morir(){
        System.out.println(nombre + " ha muerto");
    }


    private void usarEspada(String target){
        System.out.println(nombre + " usó espada contra " + target);
    }
}
