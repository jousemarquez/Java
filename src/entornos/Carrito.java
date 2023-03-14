package entornos;

import java.util.ArrayList;

public class Carrito {
    private long items;
    private int idObra;
    private float impuesto;
    private float precio;
    private ArrayList<Item> itemList;

    public enum Estado {
        ACTIVO, PENDIENTE, COMPLETADO
    }
    private Estado estado;

    public Carrito(int idObra, float impuesto, float precio) {
        this.items = 0;
        this.idObra = idObra;
        this.impuesto = impuesto;
        this.precio = precio;
        this.itemList = new ArrayList<>();
        this.estado = Estado.ACTIVO;
    }

    public void anhadirItem(Item item) {
        itemList.add(item);
        items++;
    }

    public void eliminarItem(Item item) {
        itemList.remove(item);
        items--;
    }

    public Estado comprobarEstado() {
        return estado;
    }

    private class Item {
        private String nombre;
        private float precio;

        public Item(String nombre, float precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public float getPrecio() {
            return precio;
        }
    }
}
