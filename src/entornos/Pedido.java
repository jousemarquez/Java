package entornos;

public class Pedido {
    private long idCarrito;
    private float precioSubTotal;
    private String codigoPromocional;
    private boolean seguro;
    private String direccion;

    public Pedido(long idCarrito, float precioSubTotal, String codigoPromocional, boolean seguro, String direccion) {
        this.idCarrito = idCarrito;
        this.precioSubTotal = precioSubTotal;
        this.codigoPromocional = codigoPromocional;
        this.seguro = seguro;
        this.direccion = direccion;
    }

    public float calcularTotal() {
        float total = precioSubTotal;
        if (codigoPromocional != null) {
            // Aquí se aplicaría la lógica para aplicar el descuento del código promocional
        }
        if (seguro) {
            // Aquí se sumaría el costo del seguro
        }
        return total;
    }

    public void confirmar() {
        // Aquí se implementaría la lógica para confirmar el pedido
    }

    public void cobrar() {
        // Aquí se implementaría la lógica para cobrar el pedido
    }

    public void generarFactura() {
        // Aquí se implementaría la lógica para generar la factura del pedido
    }
}
