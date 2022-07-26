package javaBasico.ejercicios.tema3;

public class FuncionSumaIva {
    static int Iva;
    static int priceWithIva;

    public static void main(String[] args) {
        System.out.println(addIva(100));
    }

    public static int calculateIva(int price) {
        return price * 21 / 100;
    }

    public static int addIva(int price) {
        priceWithIva = price + calculateIva(price);
        return priceWithIva;
    }

    public int getIva(int price) {
        return calculateIva(100);
    }

    public int getPriceWithIva(int price) {
        return addIva(price);
    }
}
