import java.util.Scanner;
public class ConversionDeTipo
{
    public static void main(String[] args) {
        float valorDecimal = 23; //
        int valorEntero = (int) 4.0f;

        double  valorDouble = 23.0f; // Java interpreta este número como double. No hay pérdida de información porque el tamaño de bytes es 8.
        float valorFloat = (float) 15.9; // En cambio en este caso habría que hacer un cast, ya que en el espacio de bytes de float es la mitad que double por lo que se perdería información.

        //int numero = (int) true;

        char letra = 'Y';
        System.out.println((int) letra); // Imprime el código UNICODE (extensión de ASCII)
        letra++;
        System.out.println((int) letra);
        letra+=90;
        System.out.println((int) letra);
    }
}
