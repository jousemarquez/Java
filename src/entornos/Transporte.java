package entornos;

public class Transporte {
    private long idPedido;
    private long estadoPedido;
    private String direccion;

    public Transporte(long idPedido, long estadoPedido, String direccion) {
        this.idPedido = idPedido;
        this.estadoPedido = estadoPedido;
        this.direccion = direccion;
    }

    public void informarEstado() {
        // Aquí se implementaría la lógica para informar el estado del pedido
    }

    public void contactarComprador() {
        // Aquí se implementaría la lógica para contactar al comprador
    }
}