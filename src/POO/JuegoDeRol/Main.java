package POO.JuegoDeRol;

public class Main {
    public static void main(String[] args) {

/*
        PersonajePrincipal Timmy = new PersonajePrincipal();

        Timmy.getClass();
        System.out.println(Timmy);
*/
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
        PersonajePrincipal.curar(0);
        System.out.println("Salud actual: " + PersonajePrincipal.saludActual);
        System.out.println("Te atacan por la espalda...");
        PersonajePrincipal.recibirDaño(20);
        if (PersonajePrincipal.estaMuerto()) {
            System.out.println("GAME OVER");
        } else {
            System.out.println("Has cogido un botiquin...");
            PersonajePrincipal.curar(25);
            System.out.println("La vida del personaje es " + PersonajePrincipal.saludActual);
        }
    }
}
