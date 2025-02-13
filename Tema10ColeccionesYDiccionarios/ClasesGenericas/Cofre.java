package Tema10ColeccionesYDiccionarios.ClasesGenericas;

public class Cofre<T> {
    private T contenido;
    private int cantidad;
    private boolean cerrado;

    public Cofre(T item, int monto) {
        this.contenido = item;
        this.cantidad = monto;
        this.cerrado = true;
    }

    // Método para abrir el cofre
    public void abrir() {
        if (this.cerrado) {
            this.cerrado = false;
            System.out.println("El cofre se ha abierto.");
        } else {
            System.out.println("El cofre ya estaba abierto.");
        }
    }

    // Método para cerrar el cofre
    public void cerrar() {
        if (!this.cerrado) {
            this.cerrado = true;
            System.out.println("El cofre se ha cerrado.");
        } else {
            System.out.println("El cofre ya estaba cerrado.");
        }
    }

    // Método para obtener el contenido del cofre
    public T getContenido() {
        return this.contenido;
    }

    // Método para obtener la cantidad de objetos en el cofre
    public int getCantidad() {
        return this.cantidad;
    }

    // Método para agregar un nuevo tesoro
    public void agregar(int cantidad) {
        if (!this.cerrado) {
            this.cantidad += cantidad;
            System.out.println("Se han agregado " + cantidad +
                    " uds.");
        } else {
            System.out.println("El cofre está cerrado.");
        }
    }

    // Método para eliminar tesoros
    public void extraer(int cantidad) {
        if (!this.cerrado) {
            if (this.cantidad >= cantidad) {
                this.cantidad -= cantidad;
                System.out.println("Se han extraído " + cantidad +
                        " uds.");
            } else {
                System.out.println("¡No hay suficientes uds.!");
            }
        } else {
            System.out.println("El cofre está cerrado.");
        }
    }

}