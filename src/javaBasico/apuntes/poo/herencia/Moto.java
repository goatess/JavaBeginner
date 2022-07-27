package javaBasico.apuntes.poo.herencia;

import javaBasico.apuntes.poo.clases.Motor;
import javaBasico.apuntes.poo.clases.Vehiculo;

public class Moto extends Vehiculo{
    boolean baul;

    // this constructor calls to super class
    public Moto(String fabricante, String modelo, double cc, int year, boolean sport, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, sport, motor);
        this.baul = baul;
    }

    public Moto(boolean baul) {
        this.baul = baul;
    }

    public Moto(){

    }

    
    
}
