package javaBasico.ejercicios.tema6;

public class Coche {
    String brand;
    String model;
    int doorsNumber;

    public Coche() {

    }

    public Coche(String brand, String model, int doorsNumber) {
        this.brand = brand;
        this.model = model;
        this.doorsNumber = doorsNumber;
    }

    @Override
    public String toString() {
        return "Brand " + brand +
                ", Model " + model +
                ", Number of doors " + doorsNumber;
    }
}
