package tema09POO.ej05Vehiculos;

public class Coche extends Vehiculo {

    public void quemarRueda() {
        System.out.println("Estoy quemando rueda");
    }

    public void getKilometrosRecorridos() {
        System.out.println("El coche lleva recorridos " + kilometrosRecorridos);
    }

}
