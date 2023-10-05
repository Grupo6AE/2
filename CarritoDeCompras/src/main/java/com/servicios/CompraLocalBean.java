package com.servicios;

import jakarta.ejb.Local;
import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;

import java.util.List;

@Local

public interface CompraLocalBean {
    void agregarProducto(String p);
    void eliminarProducto(String p);
    String buscarProducto(String p);
    List<String> listarProductos();
    String finalizarCompra();
}
