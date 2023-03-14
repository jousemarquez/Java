package POO.Armas;

public class InventarioJoseMarquez {
    public ArmaJoseMarquez[] armeria = new ArmaJoseMarquez[5];

    public ArmaJoseMarquez[] getArmeria() {
        return armeria;
    }

    public void setArmeria(ArmaJoseMarquez[] armeria) {
        for (int i = 0; i < armeria.length; i++) {
            if(armeria[i] == null){
                throw new IllegalArgumentException("No puede haber un arma nula");
            }
        }
        if (armeria.length>5) {
            for (int i = 0; i < this.armeria.length; i++) {
                this.armeria[i] = armeria[i];
            }
        } else {
            this.armeria = armeria;
        }
    }

    public InventarioJoseMarquez(ArmaJoseMarquez[] coleccionDeArmas){
        this.armeria = coleccionDeArmas;
    }

    public String toString(){
        String imprimirInventario = "";
        for (int i = 0; i < getArmeria().length; i++) {
            imprimirInventario += armeria[i].toString();
        }
        return imprimirInventario;
    }
}