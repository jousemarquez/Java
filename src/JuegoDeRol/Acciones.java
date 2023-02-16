package JuegoDeRol;

public class Acciones {
    public static void recibirDaño(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad de curacion negativa");
        }
        Main.PersonajePrincipal.saludActual -= cantidad;
    }

    public static void curar(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        /*
        if(cantidad <= 0) {
        throw new IllegalArgumentException("Cantidad de curacion negativa");
        }
        */
        Main.PersonajePrincipal.saludActual += cantidad;
        if (Main.PersonajePrincipal.saludActual > 100) {
            Main.PersonajePrincipal.saludActual = 100;
        }
    }
}
