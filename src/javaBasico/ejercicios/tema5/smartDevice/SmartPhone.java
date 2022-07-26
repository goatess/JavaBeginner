package javaBasico.ejercicios.tema5.smartDevice;

public class SmartPhone extends SmartDevice{

    boolean isCallOn;
    int callQuality; 

    public SmartPhone(int operativeSystem, int version, int firmware, Battery battery, Memory memory, Screen screen,
            boolean isCallOn, int callQuality) {
        super(operativeSystem, version, firmware, battery, memory, screen);
        this.isCallOn = isCallOn;
        this.callQuality = callQuality;
    }

    public SmartPhone(boolean isCallOn, int callQuality) {
        this.isCallOn = isCallOn;
        this.callQuality = callQuality;
    }

    public SmartPhone(){

    }
    
}
