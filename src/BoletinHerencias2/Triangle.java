package BoletinHerencias2;

public class Triangle extends Polygon{

    /*
    Cree una clase Triángulo, y añádala a la jerarquía en el nivel que estime conveniente.
    Puede crear tantas clases nuevas como sea necesario.
    */

    // Declaración de atributos
    float base;
    float height;

    // Constructor
    public Triangle(float base, float heigth) {
        super(3); // Un rectángulo siempre tiene tres vértices
        this.base = base;
        this.height = heigth;
    }

    public Triangle(int vertex) {
        super(vertex);
    }

    public float calculateArea() {
        return (base * height) / 2;
    }

    /* Crea un objeto de la clase Square con un lado de longitud 5 y lo almacena en la variable square.
    Luego, llama al método calculateArea() de la clase Square para calcular el área del cuadrado
    y lo almacena en la variable area.*/

    Triangle triangle = new Triangle(5, 2);
    double area = triangle.calculateArea();
}