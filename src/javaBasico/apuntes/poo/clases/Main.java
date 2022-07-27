package javaBasico.apuntes.poo.clases;

import javaBasico.apuntes.poo.herencia.Camion;
import javaBasico.apuntes.poo.herencia.Coche;
import javaBasico.apuntes.poo.herencia.Moto;

public class Main {

    public static void main(String[] args) {  // static permite ejecutar esta funcion sin tener que instanciar la clase
        
        // polimorfism
        Vehiculo vehiculo;
        
        vehiculo = new Moto();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        // abstract class -> cant be instantiated (only child classes)
    }

}
