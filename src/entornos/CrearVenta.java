package entornos;

public class CrearVenta {
    private long idVendedor;
    private long idObra;
    private float precioVenta;
    private String codigoPromocional;

    public CrearVenta(long idVendedor, long idObra, float precioVenta, String codigoPromocional) {
        this.idVendedor = idVendedor;
        this.idObra = idObra;
        this.precioVenta = precioVenta;
        this.codigoPromocional = codigoPromocional;
    }

    public void listarVenta() {
        // Implementación de la función para listar la venta
    }

    public void deslistarVenta() {
        // Implementación de la función para deslistar la venta
    }
}

