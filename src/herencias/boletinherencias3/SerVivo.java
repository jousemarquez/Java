package herencias.boletinherencias3;

public abstract class SerVivo {

    /*
    1. Cree una clase SerVivo que tenga en sus atributos las tres dimensiones posibles (alto, ancho y largo).
    Todo ser vivo se caracteriza porque puede realizar las siguientes tres acciones: interactuar con el medio,
    nutrirse y reproducirse. La implementación de estas acciones (y la del resto de ejercicios) no es relevante,
    vale con que al ejecutarse se imprima un mensaje por pantalla con un texto relativo a la acción.
    */

    public float alto, ancho, largo;

    // Constructores
    public SerVivo() {
        alto = 1.0f;
        ancho = 1.0f;
        largo = 1.0f;
    }
    public SerVivo(float alto, float ancho, float largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    // Getters y Setters
    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        validateAlto();
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        validateAncho();
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        validateLargo();
        this.largo = largo;
    }

    // Validadores

    public void validateLargo(){
        if (largo <= 0){
            throw new IllegalArgumentException("No puede ser menor o igual a 0.");
        }
    }

    public void validateAlto(){
        if (alto <= 0){
            throw new IllegalArgumentException("No puede ser menor o igual a 0.");
        }
    }

    public void validateAncho(){
        if (ancho <= 0){
            throw new IllegalArgumentException("No puede ser menor o igual a 0.");
        }
    }

    public void interactuarConElMedio(){
        System.out.printf("Interactúa con el medio");
    }

    public void nutrir(){
        System.out.println("Se nutre");
    }

    public void reproducirse(){
        System.out.println("Se reproduce");
    }
}