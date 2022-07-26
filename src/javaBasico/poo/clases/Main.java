package javaBasico.poo.clases;

import javaBasico.poo.herencia.Camion;
import javaBasico.poo.herencia.Coche;
import javaBasico.poo.herencia.Moto;

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

    // crear clase padre SmartDevice y las clases hojas SmartPhone y SmartWatch agregar atributos y constructores. desde main crear objetos y utilizarlos
}
