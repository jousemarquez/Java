package poo.bankaccount;

public class CCC {

    public double saldoDeCuenta;
    public String nombreDelTitular;
    public long numeroDeCuenta;

    public CCC() {
        numeroDeCuenta = 0;
        nombreDelTitular = "DefaultName";
        saldoDeCuenta = 0;
    }

    public CCC(String nombreDelTitular, double saldoDeCuenta) {
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        numeroDeCuenta = (long) (Math.random()*Long.MAX_VALUE+1);
    }

    public void setSaldoDeCuenta(double saldoDeCuenta) {
        if(saldoDeCuenta >= 0) {
            this.saldoDeCuenta = saldoDeCuenta;
        } else {
            throw new IllegalArgumentException("En Disney no hay saldos negativos");
        }
    }

    public double getSaldoDeCuenta() {
        return saldoDeCuenta;
    }

/*
public String getDatosCuenta() {
return this.toString();
}
*/

    public String[] getDatosCuenta() {
        String[] arr = {String.valueOf(saldoDeCuenta), nombreDelTitular,
                String.valueOf(numeroDeCuenta)};

        return arr;
    }

    public void setIngreso(double ingreso) {
        if(ingreso > 0) {
            saldoDeCuenta += ingreso;
        } else {
            throw new IllegalArgumentException("En Disney no hay ingresos <= 0");
        }
    }

    public void setReintegro(double reintegro) {
        if(reintegro > 0) {
            saldoDeCuenta -= reintegro;
        } else {
            throw new IllegalArgumentException("En Disney no hay reintegros <= 0");
        }
    }

    public long getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public String toString() {
        String res = "CCC{";
        res += "nombreDelTitular: " + nombreDelTitular;
        res += ",saldoDeCuenta: " + saldoDeCuenta;
        res += ",numeroDeCuenta: " + numeroDeCuenta;
        res += "}";

        return res;
    }

    /*Método 1*/
    public void realizarTransferenciaEntreCuentas(CCC cuentaDestino, double cantidad) {
        setReintegro(cantidad);
        cuentaDestino.setIngreso(cantidad);
    }
}