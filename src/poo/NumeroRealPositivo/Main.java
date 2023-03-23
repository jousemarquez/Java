package poo.NumeroRealPositivo;

public class Main {

    public static void main(String[] args) {
        /*
         * Crear una clase NumeroRealPositivo formada por lo siguiente:
         *
         *       - Un atributo "PI" que, independientemente de si definimos un objeto de la clase o no, sea constante y su
         *           valor sea el valor del numero pi
         *       - Un atributo "valor" que represente el valor del numero real positivo
         *       - Un constructor vacio que ponga valores por defecto
         *       - Un constructor que reciba un valor y se lo asigne al atributo valor
         *       - Los metodos getter y setter
         *       - El metodo toString
         *       - metodo validador para evitar que el usuario meta un numero real negativo. En caso de que intenten meterlo,
         *           lanzara una excepcion de IllegalArgumentException
         *       - metodo que incremente el atributo valor en una unidad
         *       - metodo que devuelva el cuadrado de una instancia de la clase (pero no modifique el valor de dicha instancia)
         *       - metodo que sume dos instancias de la clase
         *
         */

        try {
            NumeroRealPositivo n1 = new NumeroRealPositivo(1000.0f, "El dinero que tiene Rafa");
            NumeroRealPositivo n2 = new NumeroRealPositivo(1000.0f, "El dinero que tiene Pablo");

            System.out.println(NumeroRealPositivo.PI);
            System.out.println(n1.getValor());
            System.out.println(n2.getValor());

            n2.incremento();

            System.out.println(n1);
            System.out.println(n2);
        } catch (IllegalArgumentException e) {
            System.out.println("Has introducido un numero negativo en el primer try");
        }

        System.out.println("*************************************");

        try {
            NumeroRealPositivo n3 = new NumeroRealPositivo(10, "Objeto que elevare al cuadrado");
            NumeroRealPositivo n4 = NumeroRealPositivo.cuadrado(n3);
            System.out.println(n4);
        } catch (IllegalArgumentException e) {
            System.out.println("Has introducido un numero negativo en el segundo try");
        }

        System.out.println("*************************************");

        try {
            NumeroRealPositivo n5 = new NumeroRealPositivo(1.0f, "El dinero que tiene Rafa");
            NumeroRealPositivo n6 = new NumeroRealPositivo(1.0f, "El dinero que tiene Pablo");
            NumeroRealPositivo n7 = NumeroRealPositivo.suma(n5, n6);
            System.out.println(n7);
        } catch (IllegalArgumentException e) {
            System.out.println("Has introducido un numero negativo en el tercer try");
        }
    }
}