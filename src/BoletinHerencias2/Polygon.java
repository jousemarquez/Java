package BoletinHerencias2;

public abstract class Polygon {

    /*
    Cree una clase Polígono, que tenga un atributo vértices, que indica la cantidad de
    vértices que tiene el polígono. Cree constructores, getters, setters y código de
    validación, y marque todos los miembros con el modificador de visibilidad que
    considere adecuado. Debe tener un método abstracto llamado calcularArea, que
    devuelve un float con el área del polígono.*/

    // Atributo vértice
    int vertex;

    // Constructor
    public Polygon(int vertex) {
        this.vertex = vertex;
    }

    // Getter y Setter
    public int getVertex() {
        return vertex;
    }

    public void setVertex(int vertex) {
        this.vertex = vertex;
    }

    // Validación
    public boolean isValid() {
        return vertex >= 3;
    }

    // Método abstracto calcularArea
    public abstract float calculateArea();
}