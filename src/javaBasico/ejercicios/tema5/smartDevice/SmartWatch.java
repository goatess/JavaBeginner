package javaBasico.ejercicios.tema5.smartDevice;

public class SmartWatch extends SmartDevice{

    boolean alarm;
    int distance;
    int movementSensor;
    boolean sleep;
    String color;

    public SmartWatch(int operativeSystem, int version, int firmware, Battery battery, Memory memory, Screen screen,
            boolean alarm, int distance, int sensorMovement, boolean sleep) {
        super(operativeSystem, version, firmware, battery, memory, screen);
        this.alarm = alarm;
        this.distance = distance;
        this.movementSensor = sensorMovement;
        this.sleep = sleep;
    }
    public SmartWatch(boolean alarm, int distance, int sensorMovement, boolean sleep) {
        this.alarm = alarm;
        this.distance = distance;
        this.movementSensor = sensorMovement;
        this.sleep = sleep;
    }

    public SmartWatch(){

    }

    public void setColor(String color){
        this.color = color;
    }

    
}
