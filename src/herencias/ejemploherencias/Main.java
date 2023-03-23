package herencias.ejemploherencias;

public class Main {
    public static void main(String[] args) {
        Cuadrilatero r = new Cuadrilatero();
        try {
            Cuadrilatero r2 = (Cuadrilatero) r.clone();
            System.out.println(r.nombre);
            System.out.println(r2.nombre);
            System.out.println(r);
            System.out.println(r2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
