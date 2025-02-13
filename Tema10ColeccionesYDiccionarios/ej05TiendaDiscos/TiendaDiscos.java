package Tema10ColeccionesYDiccionarios.ej05TiendaDiscos;

import java.util.ArrayList;
import java.util.List;

public class TiendaDiscos implements ComercioElectronico {

    // Propiedades
    private List<Disco> listaDiscos = new ArrayList<>();

    @Override
    public void añadir(Disco disco) throws Exception {
        // Buscar por si el código ya existe
        if (listaDiscos.contains(disco)) {
            throw new Exception("ERROR: El código ya está registrado en base de datos");
        }

        // Inserta el nuevo disco al final de la lista
        listaDiscos.add(disco);
    }

    @Override
    public List<Disco> listar() {
        return this.listaDiscos;
    }

    @Override
    public void editar(Disco disco) throws Exception {
        if (listaDiscos.contains(disco)) {
            listaDiscos.set(listaDiscos.indexOf(disco), disco);
        } else {
            throw new Exception("ERROR: El disco introducido no existe");
        }
    }

    @Override
    public void borrar(Disco disco) throws Exception {
        listaDiscos.remove(disco);
    }
}
