package herencias.boletinherencias1;

public class Dwarfs extends BeingMiddleEarth{

    /*
    * Ejercicio 3: los siguientes fueron los enanos, raza hermana de los elfos. Cree la clase
    Enano y añádala a la jerarquía como estime conveniente. Los enanos se caracterizan
    porque pueden golpear con el hacha (usarHacha) y hacer armaduras (crearArmadura).
    Éstos métodos no devuelven nada, y reciben una cadena.
    */

    public Dwarfs() {
        super();
    }

    public Dwarfs(String name, String lastName, String handle) {
        super(name, lastName, handle);
    }

    @Override
    public String toString() {
        return "Dwarfs{" +
                super.toString() +
                "}";
    }

    public void useAxe (String target){
        System.out.println(name + " attack with an axe to " + target);
    }

    public void forgeArmour(String armour){
        System.out.println(name + " forged an armour " + armour);
    }
}
