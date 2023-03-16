package BoletinHerencias2;

public class Circle {

    /*
    5. Cree una clase Círculo, y añádala a la jerarquía en el nivel que estime conveniente.
    Puede crear tantas clases nuevas como sea necesario. Tenga en cuenta que un círculo no tiene vértices.
    */

    // Declaración de atributos
    private static final float PI = 3.1416f;
    private float radio;

    // Constructor
    public Circle(float radio) {
        this.radio = radio;
    }

    // Getter y setters
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    // Método que calcula el área de un círculo (A = π r²)
    public double calculateArea() {
        return PI * Math.pow(radio, 2);
    }


    Circle circle = new Circle(5.5f);
    double area = circle.calculateArea();
}
