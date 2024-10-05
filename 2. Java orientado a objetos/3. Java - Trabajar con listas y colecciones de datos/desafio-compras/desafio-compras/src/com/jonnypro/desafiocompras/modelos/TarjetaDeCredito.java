package com.jonnypro.desafiocompras.modelos;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean hacerCompra(Compra compra){
        if (this.saldo >= compra.getValorDeCompra()) {
            this.saldo -= compra.getValorDeCompra();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
