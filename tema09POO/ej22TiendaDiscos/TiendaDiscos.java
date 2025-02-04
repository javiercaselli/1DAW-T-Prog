package tema09POO.ej22TiendaDiscos;

public class TiendaDiscos implements ComercioElectronico {

    // Propiedades
    private Disco[] listaDiscos = new Disco[100];

    @Override
    public void añadir(Disco disco) throws Exception {
        // Buscar por si el código ya existe
        for (Disco discoActual: listaDiscos) {
            if (discoActual != null && discoActual.getCodigo().equals(disco.getCodigo())) {
                throw new Exception("ERROR: El código ya está registrado en base de datos");
            }
        }

        // Buscar hueco libre en la lista
        int i = 0;
        while (listaDiscos[i] != null && i < listaDiscos.length) {
            i++;
        }

        if (i < listaDiscos.length) {
            listaDiscos[i] = disco;     // Inserta el disco en el catálogo de la tienda
        } else {
            throw new Exception("ERROR: El espacio de almacenamiento está lleno");
        }
    }

    @Override
    public Disco[] listar() {
        return this.listaDiscos;
    }

    @Override
    public void editar(Disco disco) throws Exception {
        // Buscar el disco en el catálogo
        int i = 0;
        boolean encontrado = false;
        while (i < listaDiscos.length && !encontrado) {
            encontrado = disco.getCodigo().equals(listaDiscos[i].getCodigo());
            i++;
        }

        if (encontrado) {
            listaDiscos[i-1] = disco;
        } else {
            throw new Exception("ERROR: El disco introducido no existe");
        }
    }

    @Override
    public void borrar(Disco disco) throws Exception {
        // Buscar el disco en el catálogo
        int i = 0;
        boolean encontrado = false;
        while (i < listaDiscos.length && !encontrado) {
            if (listaDiscos[i] != null) encontrado = disco.getCodigo().equals(listaDiscos[i].getCodigo());
            i++;
        }

        if (encontrado) {
            listaDiscos[i-1] = null;
        } else {
            throw new Exception("ERROR: El disco introducido no existe");
        }
    }
}
