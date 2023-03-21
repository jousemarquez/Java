package BoletinHerencias;

public class Elfos extends SerTierraMedia{

    /*
    Ejercicio 2: los elfos fueron los primeros en llegar, de entre todas las razas conocidas. Cree
    la clase Elfo y añádala a la jerarquía como estime conveniente. Los elfos se caracterizan
    porque pueden disparar con el arco (dispararArco) y hacer encantamientos (encantar).
    Éstos métodos no devuelven nada, y reciben una cadena con el objetivo al que se quiere
    disparar y el objetivo que se quiere encantar.
    */

    public Elfos() {
        super();
    }

    public Elfos(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    @Override
    public String toString() {
        return "Elfos{" +
                super.toString() +
                '}';
    }

    public void dispararArco(String target){
        System.out.println(nombre + " disparó una flecha a " + target);
    }

    public void hacerEncantamiento(String target){
        System.out.println(nombre + " encantó a " + target);
    }
}