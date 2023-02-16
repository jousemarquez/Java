package JuegoDeRol;

public class Main {
    public static void main(String[] args) {

        PersonajePrincipal.saludMaxima = 100;
        PersonajePrincipal.saludActual = 70;
        PersonajePrincipal.fuerza = 5;
        PersonajePrincipal.agilidad = 7;
        PersonajePrincipal.inteligencia = 10;
        PersonajePrincipal.resistencia = 2;
        PersonajePrincipal.carisma = 7;
        PersonajePrincipal.suerte = 9;
        PersonajePrincipal.percepcion = 7;

        System.out.println("Estoy muerto?: " + PersonajePrincipal.estaMuerto());
        System.out.println("Has cogido un botiquin...");
        Acciones.curar(5);
        System.out.println("Salud actual: " + PersonajePrincipal.saludActual);
        System.out.println("Te atacan por la espalda...");
        Acciones.recibirDaño(20);
        if (PersonajePrincipal.estaMuerto()) {
            System.out.println("GAME OVER");
        } else {
            System.out.println("Has cogido un botiquin...");
            Acciones.curar(25);
            System.out.println("La vida del personaje es " + PersonajePrincipal.saludActual);
        }
    }

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
    }
}
