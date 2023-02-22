package POO.CuentasBancarias;

public class CCC {

    private double saldoDeCuenta;
    private String nombreDeTitular;
    private long numeroDeCuenta;


    public CCC(){
        nombreDeTitular = "DefaultName";
    }

    public Television(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Television(String marca, String modelo, int volumen, int brillo, int contraste, int canal) {
        this.marca = marca;
        this.modelo = modelo;
        this.volumen = volumen;
        this.brillo = brillo;
        this.contraste = contraste;
        this.canal = canal;
    }

    // GETTERS Y SETTERS
    // No recibe un valor sino devuelve un argumento
    public String getMarca(){
        return marca;
    }
    // Siempre es void y no retorna nada sino que recibe un argumento.
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    // Siempre es void y no retorna nada sino que recibe un argumento.
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getVolumen(){
        return volumen;
    }
    // Siempre es void y no retorna nada sino que recibe un argumento.
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    public int getBrillo() {
        return brillo;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    public int getContraste() {
        return contraste;
    }

    public void setContraste(int contraste) {
        this.contraste = contraste;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    // Los métodos se ponen SIEMPRE debajo de todos los constructores por convención.
    /*public String toString(){
        // Genera una cadena que tenga representación de este métod y devolverlo.
        String cad = "Television: " +marca+ "/" +modelo+ "/" +volumen+ "/" +brillo+ "/" +contraste+ "/" +canal;
        return cad;
    }*/

    // This
    // Es la referencia sobre el objeto que se está invocando el método.
    public void imprimirReferencia(){
        System.out.print("La referenia de este objeto es: ");
        System.out.println(this);
    }
}
