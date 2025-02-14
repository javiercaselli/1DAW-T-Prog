package Tema10ColeccionesYDiccionarios.gestisimalConArrayList;

import java.util.ArrayList;
import java.util.List;

public class Gestisimal {
    // Estructura de datos para gestión de artículos
    List<Articulo> listaArticulos = new ArrayList<>();

    public List<Articulo> listar() {
        return this.listaArticulos;
    }

    public void alta(Articulo articulo) throws Exception {
        if (!listaArticulos.contains(articulo)) {
            listaArticulos.add(articulo);
        } else {
            throw new Exception("ERROR: El artículo ya existe");
        }
    }

    public void baja(Articulo articulo) throws Exception {
        if (listaArticulos.contains(articulo)) {
            listaArticulos.remove(articulo);
        } else {
            throw new Exception("ERROR: El artículo no existe");
        }
    }

    public void modificacion(Articulo articulo) throws Exception {
        if (listaArticulos.contains(articulo)) {
            listaArticulos.set(listaArticulos.indexOf(articulo), articulo);
        } else {
            throw new Exception("ERROR: El artículo no existe");
        }
    }

    public void entradaMercancia(Integer codigo, Integer stock) throws Exception {
        Articulo articulo = new Articulo();
        articulo.setCodigo(codigo);

        if (listaArticulos.contains(articulo)) {
            articulo = listaArticulos.get(listaArticulos.indexOf(articulo)); // Recupero entidad del mundo
            stock += articulo.getStock();                                   // Actualizo valores necesarios
            articulo.setStock(stock);                                       // Introduzco valores en la entidad recuperada
            listaArticulos.set(listaArticulos.indexOf(articulo), articulo); // Escribo resultados en BD (o en este caso, una lista)
        } else {
            throw new Exception("ERROR: El artículo no existe");
        }
    }

    public void salidadMercancia(Integer codigo, Integer stock) throws Exception {
        Articulo articulo = new Articulo();
        articulo.setCodigo(codigo);

        if (listaArticulos.contains(articulo)) {
            articulo = listaArticulos.get(listaArticulos.indexOf(articulo)); // Recupero entidad del mundo
            stock = articulo.getStock() - stock;                             // Actualizo valores necesarios
            if (stock < 0) throw new Exception("ERROR: No hay artículos suficientes en el almacén para llevar a cabo la operación solicitada");
            articulo.setStock(stock);                                       // Introduzco valores en la entidad recuperada
            listaArticulos.set(listaArticulos.indexOf(articulo), articulo); // Escribo resultados en BD (o en este caso, una lista)
        } else {
            throw new Exception("ERROR: El artículo no existe");
        }
    }

}
