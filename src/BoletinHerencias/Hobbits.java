package BoletinHerencias;

import javax.naming.OperationNotSupportedException;

public class Hobbits extends Hombres{

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

    public Hobbits(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    @Override
    public String toString() {
        return "Hobbits desciende de " +
                super.toString() +
                "}";
    }

    public void fumarPipa(){
        System.out.println(nombre + "ha fumado pipa.");
    }

    public void comer(){
        System.out.println(nombre + "está comiendo.");
    }

    public void dispararArco(String target){
        System.out.println(nombre + " disparó una flecha a " + target);
    }

    public void lanzarPiedra(String target){
        System.out.println(nombre + " tiró una piedra a " + target);
    }

    public void usarEspada(String target) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Los hobbits no saben usar espada.");
    }
}
