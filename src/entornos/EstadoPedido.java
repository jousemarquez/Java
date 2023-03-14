package entornos;

public enum EstadoPedido {
    PENDIENTE("Preparándolo por el artista"),
    PAGADO("Pagado"),
    PROCESANDO("En la agencia de viaje"),
    ENVIADO("De camino"),
    ENTREGADO("Entregado"),
    RECHAZADO("Rechazado"),
    RECLAMACION("Reclamación"),
    PROCESO_GARANTIA("Proceso de garantía");

    private final String descripcion;

    EstadoPedido(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}