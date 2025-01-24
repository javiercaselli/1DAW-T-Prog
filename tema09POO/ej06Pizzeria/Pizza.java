package tema09POO.ej06Pizzeria;

public class Pizza {
    // Atributos de clase (estáticos)
    protected static int totalPedidas;  // Número de pizzas ordenadas
    protected static int totalServidas; // Número de pizzas pedidas

    // Atributos de instancia
    private String tipo;    // Tipo de pizza
    private String size;    // Tamaño de la pizza
    private String estado;  // Estado de la pizza

    // Constructor
    public Pizza(String tipo, String size) {
        this.tipo = tipo;
        this.size = size;
        this.estado = "pedida";
        totalPedidas++;
    }

    /**
     * Cambia el estado de la pizza de pedida a Servida
     */
    public void sirve() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            totalServidas++;
        } else {
            System.out.println("esa pizza ya se ha servido");
        }
    }

    // Getters y Setters
    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static void setTotalPedidas(int totalPedidas) {
        Pizza.totalPedidas = totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public static void setTotalServidas(int totalServidas) {
        Pizza.totalServidas = totalServidas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "pizza " + this.tipo + " " + this.size + ", " + this.estado;
    }
}
