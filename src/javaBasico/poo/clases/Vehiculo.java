package javaBasico.poo.clases;

// superclass
public class Vehiculo {

    // 1. attributes
    protected String fabricante;  // todas las clases hijo que extiendan de esta clase tienen acceso a los atributos protegidos
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;

    // 2. constructors
    public Vehiculo() {
    }
    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.motor = motor;
        this.speed = 0;
    }

    // 3. behaviour
    public void acelerar(int speed){
        this.speed = speed;
    }

}
