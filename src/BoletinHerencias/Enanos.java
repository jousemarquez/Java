package BoletinHerencias;

public class Enanos extends SerTierraMedia{

    /*
    * Ejercicio 3: los siguientes fueron los enanos, raza hermana de los elfos. Cree la clase
    Enano y añádala a la jerarquía como estime conveniente. Los enanos se caracterizan
    porque pueden golpear con el hacha (usarHacha) y hacer armaduras (crearArmadura).
    Éstos métodos no devuelven nada, y reciben una cadena.
    */

    public Enanos() {
        super();
    }

    public Enanos(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    @Override
    public String toString() {
        return "Enanos{" +
                super.toString() +
                "}";
    }

    public void usarHacha(String target){
        System.out.println(nombre + " usó hacha contra " + target);
    }

    public void crearArmadura(String armadura){
        System.out.println(nombre + " creó la armadura " + armadura);
    }
}
