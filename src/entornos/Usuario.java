package entornos;

public class Usuario {

    private long idUsuario;
    private String password;
    private String email;
    private String direccion;
    private boolean esComprador;
    private boolean esVendedor;
    private String cuentaPaypal;
    private String datosFiscales;

    public void registrar() {
        // Implementación del método registrar
    }

    public void iniciarSesion() {
        // Implementación del método iniciarSesion
    }

    public void cerrarSesion() {
        // Implementación del método cerrarSesion
    }

    public void editarPerfil() {
        // Implementación del método editarPerfil
    }

    public void buscarObras() {
        // Implementación del método buscarObras
    }

    public void consultarHistorialCompras() {
        // Implementación del método consultarHistorialCompras
    }

    // Getters y Setters

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEsComprador() {
        return esComprador;
    }

    public void setEsComprador(boolean esComprador) {
        this.esComprador = esComprador;
    }

    public boolean isEsVendedor() {
        return esVendedor;
    }

    public void setEsVendedor(boolean esVendedor) {
        this.esVendedor = esVendedor;
    }

    public String getCuentaPaypal() {
        return cuentaPaypal;
    }

    public void setCuentaPaypal(String cuentaPaypal) {
        this.cuentaPaypal = cuentaPaypal;
    }

    public String getDatosFiscales() {
        return datosFiscales;
    }

    public void setDatosFiscales(String datosFiscales) {
        this.datosFiscales = datosFiscales;
    }
}
