package javaBasico.ejercicios.tema6;

import java.util.List;

public interface CocheCRUD {

    void save(Coche coche);

    void delete(Coche coche);

    List<Coche> findAll();

}
