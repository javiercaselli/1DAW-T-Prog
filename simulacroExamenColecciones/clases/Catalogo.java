package simulacroExamenColecciones.clases;

import java.util.ArrayList;

public class Catalogo<T> implements CatalogoInterface<T>{
    // Propiedades
    ArrayList<T> catalogo;

    public Catalogo() {
        catalogo = new ArrayList<>();
    }

    @Override
    public boolean aniadir(T item) {
        //valor de retorno
        boolean insertado = false;
        if (!catalogo.contains(item)) {
            catalogo.add(item);
            insertado = true;
        }
        return insertado;
    }

    @Override
    public void eliminar(T item) {
        catalogo.remove(item);
    }

    @Override
    public ArrayList<T> recuperarElementos() {
        return catalogo;
    }
}
