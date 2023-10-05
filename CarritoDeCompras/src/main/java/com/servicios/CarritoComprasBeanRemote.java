package com.servicios;

import java.util.List;

public interface CarritoComprasBeanRemote {

   String agregarProducto(String p);
    void eliminarProducto(String p);
    String buscarProducto(String p);
    static List<String> listarProductos();
    String finalizarCompra();
}

