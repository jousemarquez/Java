package herencias.boletinherencias1;

import javax.naming.OperationNotSupportedException;

public class MortalMen extends BeingMiddleEarth{

    /*
    * Ejercicio 4: los siguientes fueron los hombres mortales, raza hermana de los elfos y
    enanos. Cree la clase Hombre y añádala a la jerarquía como estime conveniente. Los
    hombres fueron bendecidos por el creador con el don de la mortalidad (muchas gracias,
    máquina). Se caracterizan por tanto por el método morir, que no devuelve nada ni recibe
    nada, e imprime por pantalla una frase indicando que el personaje muere. También saben
    usar la espada.
    */

    public MortalMen() {
        super();
    }

    public MortalMen(String name, String lastName, String handle) {
        super(name, lastName, handle);
    }

    @Override
    public String toString() {
        return "MortalMen{" +
                super.toString() +
                "}";
    }

    public void die(){
        System.out.println(name + " has died.");
    }

    public void useSword(String target) throws OperationNotSupportedException {
        System.out.println(name + " used his sword to " + target);
    }
}
