package _examenes.trimestre2;

public class ColeccionLibros {

    /*Colección de libros*/

    private Libro[] coleccion;

    // Constructor
    public ColeccionLibros(Libro[] coleccion) {
        this.coleccion = coleccion;
    }
    // Getter coleccion
    public Libro[] getColeccion() {
        return coleccion;
    }
    // Setter coleccion
    public void setColeccion(Libro[] coleccion) {
        this.coleccion = coleccion;
    }
}