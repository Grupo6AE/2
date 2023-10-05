package uy.edu.utec;



import com.servicios.CarritoComprasBeanRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;
import java.util.Properties;


public class Cliente {

@SuppressWarnings("UnresolvedClassReferenceRepair")
public static void main(String[] args) {


    List<String> listaProds = null;
    List<String> carritoComprasBeanRemote = listaProds;                          
    try {
        java.util.Properties jndiProps = new Properties ( );

        jndiProps.put ( Context.INITIAL_CONTEXT_FACTORY, "org.widfly.naming.client .WidflyInitialContextFactory" );
        jndiProps.put ( Context.PROVIDER_URL,
                "http-remoting://localhost:8080" );

        Context context = new InitialContext ( jndiProps );
        carritoComprasBeanRemote = (List<String>) context.lookup ( "ejb:/CarritoDeCompras-1.0-SNAPSHOT/CuentaBean!com.servicios.CarritoComprasBeanRemote" );
        System.out.println ( carritoComprasBeanRemote.agregarProducto ( "Yerba" ) );
    } catch (NamingException e) {
        e.printStackTrace ( );


        carritoComprasBeanRemote.agregarProducto ( "Azucar" );
        carritoComprasBeanRemote.agregarProducto ( "Manteca" );
        carritoComprasBeanRemote.agregarProducto ( "Leche" );
        carritoComprasBeanRemote.agregarProducto ( "Pan" );
        carritoComprasBeanRemote.agregarProducto ( "Alfajor" );

        System.out.println ( "----Primer Listado - luego de agregar----" );
        Object CrritoComprasBeanRemote = new Object ( );
        listaProds = carritoComprasBeanRemote.listarProductos ( );

        for (String p : listaProds) {
            System.out.println ( p );
        }

        carritoComprasBeanRemote.eliminarProducto ( "Leche" );
        carritoComprasBeanRemote.eliminarProducto ( "Pan" );

        System.out.println ( "----Segundo Listado - luego de borrar Pan y Leche----" );

        listaProds = CarritoComprasBeanRemote.listarProductos ( );

        for (String p : listaProds) {
            System.out.println ( p );
        }

        System.out.println ( "----Busco en la lista Azucar y Pan----" );

        String b1 = carritoComprasBeanRemote.buscarProducto ( "Azucar" );
        String b2 = carritoComprasBeanRemote.buscarProducto ( "Pan" );
        System.out.println ( b1 );
        System.out.println ( b2 );

        System.out.println ( "----Listado Final de la Compra----" );

        listaProds = carritoComprasBeanRemote.listarProductos ( );

        for (String p : listaProds) {
            System.out.println ( p );
        }

        System.out.println ( "----Cerramos la Compra----" );
        System.out.println ( CarritoComprasBeanRemote.finalizarCompra ( ) );

    }
}
        }
