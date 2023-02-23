package POO.Persona;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private float peso;
    private float altura;

    private static final char HOMBRE = 'H';
    private static final char MUJER = 'M';

    public Persona() {
        nombre = "DefaultName";
        dni = "";
        sexo = HOMBRE;
    }

    public Persona(String nombre, int edad, String dni, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    /* SETTERS AND GETTERS */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    /* MÉTODOS */

    /* calcularIMC(): calculara si la persona está en su peso ideal
    (peso en kg/(altura^2  en m)), si esta fórmula devuelve un
    valor menor que 20, el método devuelve un -1, si devuelve un
    número entre 20 y 25 (incluidos), significa que está por
    debajo de su peso ideal el método devuelve un 0  y si
    devuelve un valor mayor que 25 significa que tiene
    sobrepeso, el método devuelve un 1. Te recomiendo que uses
    constantes para devolver estos valores.*/

    public int calcularIMC(int peso, int altura) {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return -1;
        } else if (imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    /* esMayorDeEdad(): indica si es mayor de edad,
    devuelve un booleano.*/

    public boolean esMayorDeEdad(int edad) {
        if (edad < 18) {
            return false;
        }
        return true;
    }

    /* comprobarSexo(char sexo): comprueba que el sexo
    introducido es correcto. Si no es correcto, será H. No
    será visible al exterior.*/

    public char comprobarSexo(char sexo) {
        if (sexo == HOMBRE) {
            return HOMBRE;
        }
        return MUJER;
    }

    /* toString(): devuelve toda la información del objeto.*/

    public String toString() {
        String res = "Persona{";
        res += "nombre: " + nombre;
        res += ",edad: " + edad;
        res += ",dni: " + dni;
        res += ",sexo: " + sexo;
        res += ",peso: " + peso;
        res += ",altura: " + altura;
        res += "}";
        return res;
    }

    /* generaDNI(): genera un número aleatorio de 8 cifras,
    genera a partir de este su número su letra
    correspondiente. Este método será invocado cuando. */

    public String generarDNI() {
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        // Finalmente, para conseguir un entero, quitamos los decimales usando la clase Math.floor() y hacemos el cast a int.
        int dniSoloNumero = (int)Math.floor(Math.random()*100000000+1);
        int conseguirLetra = dniSoloNumero % 23;
        String dniLetra = letras[conseguirLetra];
        return dniSoloNumero+dniLetra;
       }
}
