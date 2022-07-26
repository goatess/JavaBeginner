package javaBasico.ejercicios.tema5.smartDevice;

public class SmartDevice {

    protected int operativeSystem;
    protected int version;
    protected int firmware;
    protected Battery battery;
    protected Memory memory;
    protected Screen screen;

    public SmartDevice(int operativeSystem, int version, int firmware, Battery battery, Memory memory, Screen screen) {
        this.operativeSystem = operativeSystem;
        this.version = version;
        this.firmware = firmware;
        this.battery = battery;
        this.memory = memory;
        this.screen = screen;
    }

    public SmartDevice(){
    }

    public void setVersion(int version) {
        this.version = version;
    }
    public int getVersion() {
        return version;
    }
}
