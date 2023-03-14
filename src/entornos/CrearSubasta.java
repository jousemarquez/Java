package com.company;

import java.util.Date;

public class CrearSubasta {
    private int idVendedor;
    private int idObra;
    private Date fechaInicio;
    private Date fechaFinal;
    private float precioInicial;
    private float precioMinimoParaVenta;
    private float incrementoDePuja;

    public CrearSubasta(int idVendedor, int idObra, Date fechaInicio, Date fechaFinal, float precioInicial, float precioMinimoParaVenta, float incrementoDePuja) {
        this.idVendedor = idVendedor;
        this.idObra = idObra;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.precioInicial = precioInicial;
        this.precioMinimoParaVenta = precioMinimoParaVenta;
        this.incrementoDePuja = incrementoDePuja;
    }

    public void listarSubasta() {
        // código para listar la subasta
    }

    public void deslistarSubasta() {
        // código para deslistar la subasta
    }
}
