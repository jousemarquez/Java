package POO.JuegoDeRol;

public class PersonajePrincipal {

    public static String nombre;
    public static int edad;
    public static int altura;
    public static int saludMaxima;
    public static int saludActual;
    // atributos SPECIAL
    public static int fuerza;
    public static int percepcion;
    public static int resistencia;
    public static int agilidad;
    public static int inteligencia;
    public static int carisma;
    public static int suerte;

    public static boolean estaMuerto() {
        return saludActual <= 0;
    }

    public static void recibirDaño(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("No ha recibido daño");
        }
        saludActual -= cantidad;
    }

    public static void curar(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        saludActual += cantidad;
        if (saludActual > 100) {
            saludActual = 100;
        }
    }
}
