package Armas;

public class InventarioJoseMarquez {
    public ArmaJoseMarquez[] armeria = new ArmaJoseMarquez[5];

    public ArmaJoseMarquez[] getArmeria() {
        return armeria;
    }

    public void setArmeria(ArmaJoseMarquez[] armeria) {
        validarArmeria(armeria);
        this.armeria = armeria;
    }

    public InventarioJoseMarquez(ArmaJoseMarquez[] coleccionDeArmas) {
        validarArmeria(coleccionDeArmas);
        this.armeria = coleccionDeArmas;
    }

    public void validarArmeria(ArmaJoseMarquez[] armeria) {
        for (int i = 0; i < armeria.length; i++) {
            if (armeria[i] == null) {
                throw new IllegalArgumentException("No puede haber un arma nula");
            }
        }
        if (armeria.length > 5) {
            ArmaJoseMarquez[] copiaArmeria = armeria;
            armeria = new ArmaJoseMarquez[5];
            for (int i = 0; i < this.armeria.length; i++) {
                armeria[i] = copiaArmeria[i];
            }
        }
    }

    public String toString() {
        String imprimirInventario = "";
        for (int i = 0; i < getArmeria().length; i++) {
            imprimirInventario += armeria[i].toString();
        }
        return imprimirInventario;
    }
}