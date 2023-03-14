package com.company;

import java.util.Date;

public class Promociones {
    private long idObra;
    private Date fechaInicio;
    private Date fechaFin;
    private String codigoPromocional;
    private float precioPromocion;

    public Promociones(long idObra, Date fechaInicio, Date fechaFin, String codigoPromocional, float precioPromocion) {
        this.idObra = idObra;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.codigoPromocional = codigoPromocional;
        this.precioPromocion = precioPromocion;
    }

    public void editarPromocion(long idObra, Date fechaInicio, Date fechaFin, String codigoPromocional, float precioPromocion) {
        this.idObra = idObra;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.codigoPromocional = codigoPromocional;
        this.precioPromocion = precioPromocion;
    }

    public void eliminarPromocion() {
        // código para eliminar la promoción
    }
}
