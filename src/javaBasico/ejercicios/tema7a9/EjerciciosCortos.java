package javaBasico.ejercicios.tema7a9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class EjerciciosCortos {
    public static void main(String[] args) {
        // ejercicio 1
        reverseText("hola mundo");

        // ejercicio 2
        ejercicio2("hola mundo");

        // ejercicio 3
        makeIntegersTable();

        // ejercicio 4
        createVector();

        // ejercicio 5
        showMessage();

        // ejercicio 6
        createStringArrayList();

        // ejercicio 7
        createIntArrayList();

        // ejercicio 8
        try {
            divideByZero(4, 0);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        }

        // ejercicio 9
        copyFile("/etc/psswd", "destino.txt");
    }

    // ejercicio 1
    public static String reverseText(String text) {
        System.out.println("\nEjercicio 1 - Escribe el código que devuelva una cadena al revés.\n");
        System.out.println(text);
        String invertedText = "";
        String[] letters = createStringsArray(text);
        for (int letter = letters.length - 1; letter >= 0; letter--) {
            invertedText += letters[letter];
        }
        System.out.println(invertedText);
        return invertedText;
    }

    // ejercicio 2
    public static void ejercicio2(String text) {
        System.out.println(
                "\nEjercicio 2 - Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.\n");
        String[] letters = createStringsArray(text);
        for (String letter : letters) {
            System.out.println(letter);
        }

    }

    private static String[] createStringsArray(String text) {
        String[] letters = text.split("");
        return letters;
    }

    // ejercicio 3
    public static void makeIntegersTable() {
        System.out.println(
                "\nEjercicio 3 - Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.\n");
        int[][] integerNumbers = new int[5][10];
        for (int i = 0; i < integerNumbers.length; i++) {
            for (int j = 0; j < 10; j++) {
                integerNumbers[i][j] = j + i * 10;
                System.out.println("fila: " + i + ", columna: " + j + ", valor: " + integerNumbers[i][j]);
            }
        }
    }

    // ejercicio 4
    private static void createVector() {
        System.out.println(
                "\nEjercicio 4 - Crea un Vector del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.\n");
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("VECTOR COMPLETO: " + vector.toString());
        vector.remove(1);
        vector.remove (1);
        System.out.println("VECTOR SIN EL 2o Y 3er ELEMENTO: " + vector.toString());
    }

    // ejercicio 5
    private static void showMessage() {
        System.out.println(
                "\nEjercicio 5 - Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.\n");

        System.out.println("La capacidad inicial seria de 2000 y cada incremento aumentaria el doble su capacidad");
    }

    // ejercicio 6
    private static void createStringArrayList() {
        System.out.println(
                "\nEjercicio 6 - Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.\n");

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Juan");
        stringArrayList.add("Rosa");
        stringArrayList.add("Pepito");
        stringArrayList.add("Sara");

        System.out.println("ELEMENTOS DEL ARRAYLIST:");
        for (String string : stringArrayList) {
            System.out.println(string);
        }
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.addAll(stringArrayList);
        System.out.println("ELEMENTOS DE LA LINKEDLIST:");
        for (String string : stringLinkedList) {
            System.out.println(string);
        }
    }

    // ejercicio 7
    public static void createIntArrayList() {
        System.out.println(
                "\nEjercicio 7 - Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares.\n");

        ArrayList<Integer> arrayListEnteros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayListEnteros.add(i);
        }
        System.out.println("ARRAY COMPLETO: " + arrayListEnteros.toString());
        for (int i = 0; i < arrayListEnteros.size(); i++) {
            if ((arrayListEnteros.get(i) % 2) == 0) {
                arrayListEnteros.remove(arrayListEnteros.get(i));
            }
        }
        System.out.println("ARRAY SIN NUMEROS PARES: ");
        for (Integer integer : arrayListEnteros) {
            System.out.println(integer);
        }
    }

    // ejercicio 8
    public static int divideByZero(int a, int b) throws ArithmeticException {
        System.out.println("\nEjercicio 8 - Crea una función DividePorCero. Esta, debe generar una excepción.\n");

        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        } finally {
            System.out.println("demo de código");
        }
        return result;
    }

    // ejercicio 9
    public static void copyFile(String fileIn, String fileOut) {
        System.out.println(
                "\nEjercicio 9 - Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: fileIn y fileOut\n");

        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("Excepción" + e.getMessage());
        }
    }

}
