import java.util.Random;

public class GeneradorDeNombres {

    public static void main(String[] args) {

        class GeneradorNombre {
            private static final String[] nombres = new String[]
                    {
                            "Juan", "Juan", "Juan", "Juan", "Juan", "Juan", "Juan", "Juan",
                            "Juan", "Juan", "Juan", "Juan", "Juan", "Juan",
                            "Ricardo", "Elena", "Javier", "Laura", "Andres", "Camila"
                    };
            private static final Random rand = new Random();
            public static String GetRandomName() {
                int randomIndex = rand.nextInt(nombres.length);
                return nombres[randomIndex];
            }
        }

        String randomName;
        do {
            randomName = GeneradorNombre.GetRandomName();
        } while (!randomName.equals("Juan"));
        System.out.println("El nombre aleatorio es: " + randomName);
    }
}