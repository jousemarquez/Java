package herencias.ejemploherencias;

public class Cuadrilatero implements Figura, Cloneable{
    public int lado;
    public String nombre;

    public Cuadrilatero() {
        this.lado = lado;
    }
    public Cuadrilatero(int lado, String nombre) {
        this.lado = lado;
        this.nombre = nombre;
    }

    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public float perimetro() {
        return lado*4;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Cuadrilatero(lado, nombre);
    }
}
