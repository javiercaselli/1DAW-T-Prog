package simulacroExamenColecciones.clases;

import simulacroExamenColecciones.excepciones.DuplicateFilmException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Videoclub implements VideoclubInterface {
    private Catalogo<Pelicula> catalogo;

    public Videoclub() {
        catalogo = new Catalogo<>();
    }

    @Override
    public void nuevaPelicula(Pelicula pelicula) throws DuplicateFilmException {
        if (!catalogo.aniadir(pelicula)) throw new DuplicateFilmException(pelicula.getCodigo());
    }

    @Override
    public void eliminarPelicula(Pelicula pelicula) {
        catalogo.eliminar(pelicula);
    }

    @Override
    public ArrayList<Pelicula> buscarPorEstreno(int anio) {
        // Valor de retorno
        ArrayList<Pelicula> listaPeliculasEstreno = new ArrayList<>();

        // Busca películas por año de estreno
        for (Pelicula pelicula : catalogo.recuperarElementos()) {
            if (pelicula.getEstreno() == anio) listaPeliculasEstreno.add(pelicula);
        }

        return listaPeliculasEstreno;
    }

    @Override
    public ArrayList<Pelicula> listarOrdenadoPorTitulo() {
        // Valor de retorno
        ArrayList<Pelicula> listaPeliculasOrdenado = new ArrayList<>(catalogo.recuperarElementos());

        // Ordeno la coleccion de películas y la almaceno en mi ARraylist vacio
        Collections.sort(listaPeliculasOrdenado);

        return listaPeliculasOrdenado;
    }

    @Override
    public ArrayList<Pelicula> listarNoVistas() {
        // Valor de retorno
        ArrayList<Pelicula> listaPeliculasNoVistas = new ArrayList<>(catalogo.recuperarElementos());

        for (Pelicula pelicula : listaPeliculasNoVistas) {
            if (pelicula.getVista()) listaPeliculasNoVistas.remove(pelicula);
        }

        // Forma más moderna de hacerlo con predicados
        // listaPeliculasNoVistas.removeIf(Pelicula::getVista);

        return listaPeliculasNoVistas;
    }

    @Override
    public void guardar(String nombreArchivo) throws IOException {
        final String SEPARATOR = ";";
        FileWriter fw = new FileWriter(nombreArchivo);
        BufferedWriter bw = new BufferedWriter(fw);

        for (Pelicula pelicula : catalogo.recuperarElementos()) {
            bw.write(pelicula.getCodigo() + SEPARATOR + pelicula.getVista() + SEPARATOR + pelicula.getTitulo() + SEPARATOR + pelicula.getEstreno() + "\n");
        }

        // Cierra descriptores
        bw.close();
        fw.close();
    }
}
