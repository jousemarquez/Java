package herencias.boletinherencias1;

import javax.naming.OperationNotSupportedException;

public class Hobbits extends MortalMen{

    /*
    Ejercicio 6: finalmente llegaron los hobbits. Los sabios creen que esta raza proviene de los
    humanos, puesto que en sus comienzos hablaban la lengua común y no tenían idioma
    propio. Cree la clase Hobbit y añádala a la jerarquía como estime conveniente. Los hobbits
    se caracterizan por dos cosas: fumar hierba para pipa y comer como si no hubiera mañana.
    Saben disparar el arco, tirar piedras pero no usar la espada.
    */

    public Hobbits() {
        super();
    }

    public Hobbits(String name, String lastName, String handle) {
        super(name, lastName, handle);
    }

    @Override
    public String toString() {
        return "Hobbits desciende de " +
                super.toString() +
                "}";
    }

    public void smokePipe(){
        System.out.println(name + "has smoke.");
    }

    public void eat(){
        System.out.println(name + "is eating.");
    }

    public void useBow(String target){
        System.out.println(name + " shot an arrow to " + target);
    }

    public void throwStone(String target){
        System.out.println(name + " throw a stone to " + target);
    }

    public void useSword(String target) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Hobbits can't use swords.");
    }
}
