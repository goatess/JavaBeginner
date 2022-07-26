package javaBasico.ejercicios.tema3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FuncionSumaIvaTest {
    FuncionSumaIva sumaIva = new FuncionSumaIva();

    @Test
    public void get_the_21_percent_of_a_number(){
        final int IVA = 21;
        int actualIva = sumaIva.getIva(100);
        assertEquals(IVA, actualIva);
    }

    @Test
    public void get_the_result_of_the_21_percent_added_to_the_number(){
        final int PRICE = 121;
        int priceWithIva = sumaIva.getPriceWithIva(100);
        assertEquals(PRICE, priceWithIva); 
    }
}
