package simulacroExamenColecciones.clases;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Pelicula implements Comparable<Pelicula> {
    private String codigo;
    private String titulo;
    private Integer estreno;
    private boolean vista;

    public Pelicula(String codigo, String titulo, Integer estreno) {
        if (codigo != null && titulo != null && estreno != null) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.estreno = estreno;
            this.vista = false;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEstreno() {
        return estreno;
    }

    public void setEstreno(Integer estreno) {
        this.estreno = estreno;
    }

    public boolean getVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(codigo, pelicula.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", estreno=" + estreno +
                ", vista=" + vista +
                '}';
    }

    @Override
    public int compareTo(@NotNull Pelicula o) {
        return this.titulo.compareTo(o.titulo);
    }
}
