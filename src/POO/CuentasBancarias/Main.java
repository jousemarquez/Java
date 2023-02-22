package POO.CuentasBancarias;

public class Main {
    public static void main(String[] args) {

        // Contructor de objetos
        Television tele1 = new Television();
        System.out.println(tele1);
        System.out.println(tele1.getCanal());
        System.out.println(tele1.getMarca());
        tele1.setMarca("LG");
        tele1.setModelo("A321");
        tele1.setVolumen(90);
        tele1.setCanal(4);
        tele1.setBrillo(33);
        tele1.setContraste(2);
        System.out.println(tele1.getCanal());
        System.out.println(tele1.getMarca());
        System.out.println(Television.precio);
        System.out.println("*************");

        Television tele2 = new Television("Sony", "GN433");
        System.out.println("Marca tele2: " +tele2.getMarca());
        System.out.println("Modelo tele2: " +tele2.getModelo());
        System.out.println("*************");

        Television tele3 = new Television("Samsumg", "GN99", 40, 43, 3, 2);
        System.out.println("Marca tele3: " +tele3.getMarca());
        System.out.println("Modelo tele3: " +tele3.getModelo());
        System.out.println("Volumen tele3: " +tele3.getVolumen());
        System.out.println("Brillo tele3: " +tele3.getBrillo());
        System.out.println("Contraste tele3: " +tele3.getContraste());
        System.out.println("Canal tele3: " +tele3.getCanal());
        System.out.println("*************");

        // Formas para imprimir de forma masiva. Con un método o con .toString
        System.out.println(tele3);
        System.out.println("*************");

        // Aplicando GETTERS y SETTERS
        System.out.println(tele2.getMarca());
        System.out.println(tele3.getMarca());
        tele2.setMarca("Mitshubichi");
        tele3.setMarca("Nokia");
        System.out.println(tele2.getMarca());
        System.out.println(tele3.getMarca());
        System.out.println("*************");

        // Public y Private
        // Por seguridad, se establecen todas las clases private para evitar que los datos queden públicos y visibles
        // a tercero. Para ello, se invocan o cambian con los getters y setters creados previamente.
        tele1.imprimirReferencia();
        System.out.println(tele1);
        tele2.imprimirReferencia();
        System.out.println(tele2);
        tele3.imprimirReferencia();
        System.out.println("*************");
    }
}