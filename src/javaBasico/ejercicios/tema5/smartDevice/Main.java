package javaBasico.ejercicios.tema5.smartDevice;

public class Main {
    public static void main(String[] args) {
        SmartDevice smartDevice;

        smartDevice = new SmartWatch();
        smartDevice.setVersion(1001);
        System.out.println(smartDevice.version);

        smartDevice = new SmartWatch();
        smartDevice.setVersion(1002);
        System.out.println(smartDevice.version);

        smartDevice = new SmartPhone(false, 4);
        smartDevice.setVersion(1145);
        System.out.println(smartDevice.version);

        smartDevice = new SmartPhone();
        smartDevice.setVersion(2122);
        System.out.println(smartDevice.version);

    }
}
