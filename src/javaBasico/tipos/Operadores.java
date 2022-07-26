package javaBasico.tipos;

public class Operadores {
    private static int num1 = 10;
    private static int num2 = 20;

    // arithmetic operators:
    private static int sum = num1 + num2;
    private static int resta = num1 - num2;
    private static int mult = num1 * num2;
    private static int div = num1 / num2;

    //comparation operators:
    private static boolean isGreater = num1 > num2;
    private static boolean isLesser = num1 < num2;
    private static boolean isGreaterOrEqual = num1 >= num2;
    private static boolean isLesserOrEqual = num1 <= num2;
    private static boolean isEqual = num1 == num2;
    private static boolean isNotEqual = num1 != num2;

    //logic operators && and, || or:
    private static boolean isGreaterOrLesser = num1 > num2 || num1 < num2;
    private static boolean isGreaterAndLesser = num1 > num2 && num1 < num2;

}
