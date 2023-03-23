package poo.NumeroRealPositivo;

public class NumeroRealPositivo {

    public static final float PI = 3.1416f;
    private float valor;
    private String representa;

    public NumeroRealPositivo() {
        representa = "";
    }

    public NumeroRealPositivo(float valor, String representa) {
        validator(valor);
        this.valor = valor; //this.valor = validatorWithoutExc(valor); y borrar linea 22
        this.representa = representa;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        validator(valor);
        this.valor = valor; // this.valor = validatorWithoutExc(valor);
    }

    public String getRepresenta() {
        return representa;
    }

    public void setRepresenta(String representa) {
        this.representa = representa;
    }

    @Override
    public String toString() {
        return "NumeroRealPositivo{" +
                "valor=" + valor +
                ", representa='" + representa + '\'' +
                '}';
    }

    public void validator(float valor) {
        if (valor<0) {
            throw new IllegalArgumentException("No se admiten valores negativos");
        }
    }

    /*
    public float validatorWithoutExc(float valor) {
        if (valor<0) {
            return 0;
        } else {
            return valor;
        }
    }*/

    public void incremento() {
        this.valor++;
    }

    public static NumeroRealPositivo cuadrado(NumeroRealPositivo n) {
        NumeroRealPositivo res = new NumeroRealPositivo(0.0f, "Resultado de elevar el objeto introducido al cuadrado");
        res.setValor(n.getValor() * n.getValor());
        return res;
    }

    public static NumeroRealPositivo suma(NumeroRealPositivo n1, NumeroRealPositivo n2) {
        NumeroRealPositivo res = new NumeroRealPositivo(0.0f, "Resultado de sumar los objetos");
        res.setValor(n1.getValor() + n2.getValor());
        return res;
    }
}