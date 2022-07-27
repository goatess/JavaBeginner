package javaBasico.apuntes.poo.sinInterfaces;

public class Empleado {
    String nombre;
    int edad;
    double salario;
    boolean alta;

    public Empleado(){

    }

    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

    @Override  // sobrescribiendo un metodo heredado de la clase String
    public String toString() {
        return "Empleado " + nombre +
                ", edad= " + edad + 
                ", salario= " + salario + 
                ", alta= " + alta;
    }
    
}
