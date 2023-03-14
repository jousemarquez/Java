package entornos;

import java.util.List;

public class ObraDeArte {
    private long idVendedor;
    private String titulo;
    private float precio;
    private List<String> tipoDeObra;
    private List<String> fotos;
    private List<String> tecnica;
    private String material;
    private String dimensiones;
    private boolean estaVendida;

    public ObraDeArte(long idVendedor, String titulo, float precio, List<String> tipoDeObra, List<String> fotos, List<String> tecnica, String material, String dimensiones, boolean estaVendida) {
        this.idVendedor = idVendedor;
        this.titulo = titulo;
        this.precio = precio;
        this.tipoDeObra = tipoDeObra;
        this.fotos = fotos;
        this.tecnica = tecnica;
        this.material = material;
        this.dimensiones = dimensiones;
        this.estaVendida = estaVendida;
    }

    public void editarFicha() {
        // Implementación de la función para editar la ficha de la obra de arte
    }

    public void eliminarObra() {
        // Implementación de la función para eliminar la obra de arte
    }

    public void anhadirColeccion() {
        // Implementación de la función para añadir la obra de arte a una colección
    }
}
