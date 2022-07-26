package javaBasico.ejercicios.tema4;

/**
 * crear un bulce for que permita concatenar textos y imprima el resultado final por consola
 */

public class EjercicioTema4 {
    static String[] nombres = {"Juan", "Sara", "Fulgencio", "Amparo", "Isabel"};
    static String listaNombres = "";
    public static void main(String[] args) {
        for (String nombre : nombres) {
           listaNombres += nombre + " ";
        }
        System.out.println(listaNombres);
    }
}
