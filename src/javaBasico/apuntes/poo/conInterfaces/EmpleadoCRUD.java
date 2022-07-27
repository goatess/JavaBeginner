package javaBasico.apuntes.poo.conInterfaces;
import java.util.List;

public interface EmpleadoCRUD {

    void save(Empleado empleado);  // se declaran los metodos pero no se implementan

    List<Empleado> findAll();

    void delete(Empleado empleado);
}
