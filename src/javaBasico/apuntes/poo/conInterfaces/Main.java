package javaBasico.apuntes.poo.conInterfaces;

import java.util.List;

public class Main {
    
    // podria no crearse ahora el objeto si usamos framworks como Spring, con mecanismos de inyección
    // en ese caso quedaría sin asignar: EmpleadoCRUD empleadoCRUD;

    private static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDExcel();  
    
    public static void main(String[] args) {

        empleadoCRUD.save(new Empleado());
        empleadoCRUD.save(new Empleado());

        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}
