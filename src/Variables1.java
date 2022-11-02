public class Variables1{
        public static void main(String[] args) {
/*
        //Soluciones
        1. Crear una variable entera e imprimirla por pantalla sin asignarle ningún valor.
        ¿ Qué se ha impreso?
         */

            int var = 0;

            System.out.println(var);

            // 2a
            int var2 = 0;
            var2 += 3;
            System.out.println("La variable var2 vale: " + var2);

            // 2b
            var2--;
            System.out.println(var2);

            // 3
            var2++;
            var2++;
            var2++;
            var2++;
            System.out.println(var2);

            // 4
            int entera = 48;

            // 5
            entera /= 50;


            // 6
            entera++;
            entera *= 48;

            //entera = (entera + 1)*48;

            System.out.println(entera % 46);

            // 7 dos formas equivalentes:
            System.out.println(entera * entera);
            System.out.println(Math.pow(entera, 2));

            // 8. A partir de aqui pueden estar desordenados
            float a = 1.0f, b = 5.0f;
            System.out.println("a vale: " + a);
            System.out.println("b vale: " + b);
            System.out.println("a vale: " + a + "\n y b vale: " + b);
            a = b * 2;
            System.out.println(a > b);
            System.out.println(a > b); //10
            System.out.println(a <= b); // 11
            boolean resultado = a <= b; // 12
            System.out.println(resultado); //12{
        }
}
