package javaBasico.apuntes.poo.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV1 {

    /**
     * A-DATA STRUCTURE
     * 
     * B-OPERATIONS:
     * 1.Create
     * 2.Retrieve/Read
     * 3.Update
     * 4.Delete
     */


    // A-DATA STRUCTURE  - la base de datos ( en este caso es el array, que esta almacenado en la ram y es solo temporal )
    private List<Empleado> empleados = new ArrayList<>();

    // B-OPERATIONS
    // 1.CREATE EMPLOYEE
    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    
    // 2.RETRIEVE / READ
    public List<Empleado> findAll() {
        return empleados;
    }
}
