package com.servicios;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class CompraLocal implements CompraLocalBean{
    @Override
    public void agregarProducto(String p) {

    }

    @Override
    public void eliminarProducto(String p) {

    }

    @Override
    public String buscarProducto(String p) {
        return null;
    }

    @Override
    public List<String> listarProductos() {
        return null;
    }

    @Override
    public String finalizarCompra() {
        return null;
    }
}
