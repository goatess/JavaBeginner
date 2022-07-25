package com.java1.tipos;

public class Tipos {
    final static byte INTEGER1 = 1;
    final static short INTEGER2 = 2;
    final static int INTEGER3 = 4;
    final static long INTEGER4 = 8;
    final static float DECIMAL1 = 4.0f;
    final static double DECIMAL2 = 8.0d;
    final static boolean BOOL1 = true;
    final static boolean BOOL2 = false;
    final static char CHARACTER_A = 'a';
    final static char CHARACTER_Z = 'Z';
    final static String TEXT = "a list of characters";

/**
 * prints data types
 * @param args
 */
    public static void main(String[] args) {
    System.out.println("'byte' data type is integer, has " + INTEGER1 + " byte size");
    System.out.println("'short' data type is integer, has " + INTEGER2 + " byte size"); 
    System.out.println("'int' data type is integer, has " + INTEGER3 + " byte size"); 
    System.out.println("'long' data type is integer, has " + INTEGER4 + " byte size"); 
    System.out.println("'float' data type is decimal, has " + DECIMAL1 + " byte size"); 
    System.out.println("'double' data type is decimal, has " + DECIMAL2 + " byte size"); 
    System.out.println("'boolean' data type can be " + BOOL1 + " or " + BOOL2); 
    System.out.println("'char' data type is a character from " + CHARACTER_A + " to " + CHARACTER_Z); 
    System.out.println("'String' data type is " + TEXT); 
    } 
}
