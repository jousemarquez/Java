package herencias.boletinherencias1;

public class Orcs extends Elves{

    /*
    Ejercicio 5: los orcos fueron creados a partir de los elfos, mediante técnicas de tortura y
    corrupción. Cree la clase Orco y añádala a la jerarquía como estime conveniente. Los orcos,
    además de disparar con arco y hacer encantamientos, saben envenenar flechas.
    Implemente dicho método como los anteriores.
    */

    public Orcs() {
        super();
    }

    public Orcs(String name, String lastName, String handle) {
        super(name, lastName, handle);
    }

    @Override
    public String toString() {
        return "Orcs descend from " +
                super.toString() +
                "}";
    }

    public void poisonArrow(String arrow){
        System.out.println(name + " envenom the arrow " + arrow);
    }
}