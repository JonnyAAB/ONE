package com.jonnypro.desafiocompras.modelos;

public class Compra implements Comparable<Compra>{
    private String descripcion;
    private double valorDeCompra;

    public Compra(String descripcion, double valorDeCompra) {
        this.descripcion = descripcion;
        this.valorDeCompra = valorDeCompra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    @Override
    public String toString() {
        return "Su compra : descripcion = " + descripcion + ", valorDeCompra = " + valorDeCompra;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valorDeCompra).compareTo(Double.valueOf(otraCompra.getValorDeCompra()));
    }
}
