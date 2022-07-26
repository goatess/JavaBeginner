package javaBasico.estructurascontrol;

/**
 * crear un bulce for que permita concatenar tectos y imprima el resultado final por consola
 */

public class Ejercicio {
    static String[] nombres = {"Juan", "Sara", "Fulgencio", "Amparo", "Isabel"};
    static String listaNombres = "";
    public static void main(String[] args) {
        for (String nombre : nombres) {
           listaNombres += nombre + " ";
        }
        System.out.println(listaNombres);
    }
}
