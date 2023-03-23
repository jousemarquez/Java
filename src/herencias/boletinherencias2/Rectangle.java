package herencias.boletinherencias2;

public class Rectangle extends Polygon {

    /*
    Cree una clase Rectángulo, teniendo en cuenta que un rectángulo es un caso de
    polígono especializado de cuatro vértices (y sólo cuatro vertices). Añada atributos
    adicionales si lo estima conveniente, e implemente el método abstracto calcularArea.
    */

    // Declaración de atributos
    float base, height;

    // Constructor
    public Rectangle(float base, float heigth) {
        super(4); // Un rectángulo siempre tiene cuatro vértices
        this.base = base;
        this.height = heigth;
    }

    // Getter y setters
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Validador
    public boolean isValid() {
        return base > 0 && height > 0;
    }

    @Override
    public float calculateArea() {
        return base * height;
    }
}