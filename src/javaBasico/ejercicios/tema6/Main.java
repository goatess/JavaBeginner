package javaBasico.ejercicios.tema6;

import java.util.List;

public class Main {
    private static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCRUD.save(new Coche("Opel", "Astra", 5));
        cocheCRUD.save(new Coche("Seat", "Leon", 5));

        List<Coche> coches = cocheCRUD.findAll();
        System.out.println(coches);

        for (Coche coche : coches) {
            cocheCRUD.delete(coche);
        }

        System.out.println(coches);

    }
}
