package javaBasico.estructurascontrol.repeticion;

import java.util.Arrays;

public class Repeticion {

    static String[] nombres = { "Pepe", "Juanito", "Ruperta" };
    static int suma = 0;
    static int contador = 0;

    public static void main(String[] args) {

        // for i
        for (int i = 0; i < 100; i++) {
            suma += i;
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        // for each
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        Arrays.stream(nombres).forEach(nombre -> System.out.println(nombre));
        
        
        //while
        while (contador < 10) {
            contador++;
            if (contador == 5) {
                continue;
            }
            if(contador == 8){
                break;
            }
            System.out.println(contador);
        }
        }
    }
