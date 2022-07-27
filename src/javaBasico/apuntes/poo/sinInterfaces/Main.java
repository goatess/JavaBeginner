package javaBasico.apuntes.poo.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUDV1 empleadoCRUD = new EmpleadoCRUDV1();
        Empleado juanito = new Empleado("Juanito", 20, 40000, true);
        Empleado sara = new Empleado("Sara", 20, 40000, true);
        Empleado pepito = new Empleado("Pepito", 20, 40000, true);
        
        empleadoCRUD.save(juanito);
        empleadoCRUD.save(sara);
        empleadoCRUD.save(pepito);

        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);

        // System = clase   // out = atributo   // println() = metodo
    }
}
