package com.java1.funciones;

public class Funciones {
    public static void main(String[] args) {
        // funcion 1 sin parametros y sin tipo de retorno
        showMenu();

        // funcion 2 sin parámetros y con tipo de retorno
        System.out.println("returned String:\n" + getMenu());

        // funcion con parametros y sin tipo de retorno
        printGreeting("OpenBootcamp");

        //funcion con parametros y con tipo de retorno
        System.out.println(obtainGreeting("Open", "Bootcamp"));
    }

    static void showMenu() {
        System.out.println("Menu:\nItem1\nItem2...");
    }

    static String getMenu() {
        return "Menu:\nItem1\nItem2...";
    }

    static void printGreeting(String name) {
        System.out.println("Good day " + name);
    }

        static String obtainGreeting(String name, String name2) {
        return "Good day " + name + " " + name2;
    }
}
