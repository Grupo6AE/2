package com.servicios;

import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class CuentaBean implements CarritoComprasBeanRemote {
    @Override
    public String agregarProducto(String p) {

        return ("");
    }

    @Override
    public void eliminarProducto(String p) {

    }

    @Override
    public String buscarProducto(String p) {

    }

    @Override
    public List<String> listarProductos() {

    }

    @Override
    public String finalizarCompra() {
        return null;
    }
}

