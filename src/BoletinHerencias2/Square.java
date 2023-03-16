package BoletinHerencias2;

public class Square extends Rectangle {

    /*
    Cree una clase Cuadrado, teniendo en cuenta que un cuadrado es un caso de
    rectángulo especializado en el que la base es igual a la altura. Piense en el método
    calcularArea y modifíquelo si lo estima conveniente.
    */

    // Constructor
    public Square(float base) {
        super(base, base); // base y altura iguales
    }

    // Fórmula del área del cuadrado
    @Override
    public float calculateArea() {
        return base*base;
    }

    /* Crea un objeto de la clase Square con un lado de longitud 5 y lo almacena en la variable square.
    Luego, llama al método calculateArea() de la clase Square para calcular el área del cuadrado
    y lo almacena en la variable area.*/

    Square square = new Square(5);
    double area = square.calculateArea(); // Devuelve 25.0
}
