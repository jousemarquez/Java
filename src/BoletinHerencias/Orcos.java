package BoletinHerencias;

public class Orcos extends Elfos{

    /*
    Ejercicio 5: los orcos fueron creados a partir de los elfos, mediante técnicas de tortura y
    corrupción. Cree la clase Orco y añádala a la jerarquía como estime conveniente. Los orcos,
    además de disparar con arco y hacer encantamientos, saben envenenar flechas.
    Implemente dicho método como los anteriores.
    */

    public Orcos() {
        super();
    }

    public Orcos(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    @Override
    public String toString() {
        return "Orcos desciende de " +
                super.toString() +
                "}";
    }

    public void envenenarFlecha(String flecha){
        System.out.println(nombre + " envenenó la flecha " + flecha);
    }
}