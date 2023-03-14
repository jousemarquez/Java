package entornos;

import java.util.ArrayList;

public class Vendedor {
    private long idUsuario;
    private String cuentaPaypal;
    private String datosFiscales;
    private ArrayList<ObraDeArte> obras;

    public Vendedor(long idUsuario, String cuentaPaypal, String datosFiscales) {
        this.idUsuario = idUsuario;
        this.cuentaPaypal = cuentaPaypal;
        this.datosFiscales = datosFiscales;
        this.obras = new ArrayList<>();
    }

    public void editarPerfil(String cuentaPaypal, String datosFiscales) {
        this.cuentaPaypal = cuentaPaypal;
        this.datosFiscales = datosFiscales;
    }

    public void eliminarCuenta() {
        // Código para eliminar la cuenta
    }

    public void altaObraDeArte(ObraDeArte obra) {
        obras.add(obra);
    }

    public void altaVenta(Venta venta) {
        // Código para agregar la venta a la base de datos
    }

    public void altaPromociones(Promocion promocion) {
        // Código para agregar la promoción a la base de datos
    }

    public void altaSubasta(Subasta subasta) {
        // Código para agregar la subasta a la base de datos
    }

    private class ObraDeArte {
        private String nombre;
        private String autor;
        private String tecnica;
        private float precio;

        public ObraDeArte(String nombre, String autor, String tecnica, float precio) {
            this.nombre = nombre;
            this.autor = autor;
            this.tecnica = tecnica;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public String getAutor() {
            return autor;
        }

        public String getTecnica() {
            return tecnica;
        }

        public float getPrecio() {
            return precio;
        }
    }

    private class Venta {
        // Código de la venta
    }

    private class Promocion {
        // Código de la promoción
    }

    private class Subasta {
        // Código de la subasta
    }
}
