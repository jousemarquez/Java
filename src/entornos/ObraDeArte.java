package entornos;

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

    // Constructor
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

    // Métodos para editar, eliminar y añadir una obra de arte
    public void editarFicha() {
        // código para editar la ficha de la obra de arte
