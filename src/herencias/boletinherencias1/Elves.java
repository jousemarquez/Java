package herencias.boletinherencias1;

public class Elves extends BeingMiddleEarth{

    /*
    Ejercicio 2: los elfos fueron los primeros en llegar, de entre todas las razas conocidas. Cree
    la clase Elfo y añádala a la jerarquía como estime conveniente. Los elfos se caracterizan
    porque pueden disparar con el arco (dispararArco) y hacer encantamientos (encantar).
    Éstos métodos no devuelven nada, y reciben una cadena con el objetivo al que se quiere
    disparar y el objetivo que se quiere encantar.
    */

    public Elves() {
        super();
    }

    public Elves(String name, String lastName, String handle) {
        super(name, lastName, handle);
    }

    @Override
    public String toString() {
        return "Elves{" +
                super.toString() +
                '}';
    }

    public void useBow(String target){
        System.out.println(name + " shot to " + target);
    }

    public void castEnchanment(String target){
        System.out.println(name + " casted an echanment to " + target);
    }
}