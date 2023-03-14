package entornos;

import java.time.LocalDateTime;

public class Coleccion {
    private long idColeccion;
    private long idObrasDeArte;
    private String tituloColeccion;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public Coleccion(long idColeccion, long idObrasDeArte, String tituloColeccion, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.idColeccion = idColeccion;
        this.idObrasDeArte = idObrasDeArte;
        this.tituloColeccion = tituloColeccion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void anhadirObra() {
        // Aquí se implementaría la lógica para añadir una obra de arte a la colección
    }

    public void editarObra() {
        // Aquí se implementaría la lógica para editar una obra de arte de la colección
    }

    public void eliminarObra() {
        // Aquí se implementaría la lógica para eliminar una obra de arte de la colección
    }
}
