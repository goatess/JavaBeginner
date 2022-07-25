package com.java1.estructurascontrol.condicionales;

public class If {
    static int edad = 17;
    static boolean isAdult = edad > 17;

    public static void main(String[] args) {

        // if
        if (isAdult) {
            System.out.println("Es mayor de edad");
        }

        // if else
        if (isAdult) {
            System.out.println("Es mayor de edad");
        } else{
            System.out.println("Es menor de edad");
        }

        isAdult = edad > 17 ? true : false;

        // if else if
        if (isAdult) {
            System.out.println("Es mayor de edad");
        } else if (edad > 30) {
            System.out.println("Tiene más de 30 años");
        }

        // switch

        switch (edad) {
            case 17:

                break;

            default:
                break;
        }
    }
}
