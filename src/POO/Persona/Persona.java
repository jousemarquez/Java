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
        this.nombre = "Jouse";
        this.edad = 36;
        this.dni = dni;
        this.sexo = 'H';
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = "Alberto";
        this.edad = 15;
        this.sexo = 'H';
    }

    /* SETTERS AND GETTERS */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    /* MÉTODOS */
    public calcularIMC (int peso, int altura){

    }
    
    public boolean esMayorDeEdad(int edad){
        if(edad < 18){
            return false;    
        }
        return true;
    }
    
    /*
    * o calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2  en m)), si esta fórmula devuelve un
valor menor que 20, el método devuelve un -1, si devuelve un
número entre 20 y 25 (incluidos), significa que está por
debajo de su peso ideal el método devuelve un 0  y si
devuelve un valor mayor que 25 significa que tiene
sobrepeso, el método devuelve un 1. Te recomiendo que uses
constantes para devolver estos valores.
 esMayorDeEdad(): indica si es mayor de edad,
devuelve un booleano.
 comprobarSexo(char sexo): comprueba que el sexo
introducido es correcto. Si no es correcto, será H. No
será visible al exterior.
 toString(): devuelve toda la información del objeto.
 generaDNI(): genera un número aleatorio de 8 cifras,
genera a partir de este su número su letra
correspondiente. Este método será invocado cuando*/

    /*
    public String toString() {
        String res = "CCC{";
        res += "nombreDelTitular: " + nombreDelTitular;
        res += ",saldoDeCuenta: " + saldoDeCuenta;
        res += ",numeroDeCuenta: " + numeroDeCuenta;
        res += "}";

        return res;
    }*/
}
