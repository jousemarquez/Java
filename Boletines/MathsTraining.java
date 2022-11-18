import java.util.Scanner;

public class MathsTraining {
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Desarrollar un juego que ayude a mejorar el cálculo mental de las operaciones básicas\n" +
                "(suma, resta, multiplicación, división, y resto de la división).\n" +
                "El juego comenzará con un mensaje de bienvenida por pantalla y la pregunta de si el\n" +
                "usuario quiere jugar al juego. En caso afirmativo, se procede al juego, en caso negativo, se\n" +
                "muestra por pantalla un mensaje de finalización, así como el récord de operaciones\n" +
                "seguidas acertadas y en cuanto tiempo se consiguió dicho récord (Si no se ha jugado\n" +
                "ninguna vez desde que ejecutamos el programa, estos datos valdrán 0).\n" +
                "El juego se iniciará mientras que la respuesta del usuario a la pregunta de si quiere jugar\n" +
                "sea SI (o alguna de sus variantes si, Si, sI). Una vez se inicie, mostraremos por pantalla un\n" +
                "mensaje que marque el comienzo (por ejemplo: Ready, Steady... GO). En este punto, el\n" +
                "usuario deberá empezar a contar las operaciones y el tiempo. Acto seguido, el programa\n" +
                "generará 2 números enteros aleatorios entre 0 y 100 (que corresponden a las variables\n" +
                "numéricas de la operación) y un número aleatorio entre 0 y 4 el cual nos indicará la\n" +
                "operación a realizar entre las dos variables numéricas. A continuación, el juego preguntará\n" +
                "por pantalla al usuario por el resultado de ésta operación. Si el resultado es correcto,\n" +
                "aumentaremos en uno el número de aciertos y mostraremos un mensaje por pantalla para\n" +
                "que el usuario sepa que ha introducido el resultado correcto y se volverá a ejecutar desde la\n" +
                "instrucción de generar números enteros aleatorios. En caso contrario, dejaremos de contar\n" +
                "el tiempo y mostraremos un mensaje de Game Over, así como la puntuación y el tiempo\n" +
                "que has tardado hasta el fallo y dejaremos de generar cifras aleatorias.\n" +
                "Una vez que hemos fallado, el juego comparará tu puntuación con el récord. Si la\n" +
                "puntuación es mayor que el récord, ésta pasará a ser el nuevo récord tanto de puntuación\n" +
                "como de tiempo. Si son iguales, nos quedaremos con el récord de tiempo que sea menor.\n" +
                "Mostramos por pantalla el récord actual de la sesión y el tiempo que se tardó en conseguir\n" +
                "dicho récord y acto seguido volvemos a preguntar al usuario si quiere seguir jugando o no.");

        boolean jugar;
        float record = 0.0f;
        System.out.println("Bienvenido a Maths Training, ¿quiéres jugar? (Si/No): ");
        jugar = sc.next().equalsIgnoreCase("si");
        if (!jugar){
            System.out.println("Programa finalizado. Tu récord es: "+ record + "puntos.");
        } else {
            System.out.println("Prepárate, vas a jugar a lo bestia.");
        }
    }
}
