package herencias.boletinherencias2;

public class Main {
    public static void main(String[] args) {
        // Checking each method and constructor.

        Cuadrado cuadrado1;
        try {
            cuadrado1 = new Cuadrado(2);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            cuadrado1 = new Cuadrado(4);
        }

        cuadrado1.toString();
    }
}