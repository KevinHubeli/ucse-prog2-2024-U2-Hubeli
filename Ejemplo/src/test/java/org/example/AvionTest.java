package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionTest {

    @Test
    void ConsumoDeCombustibleDelAAvion(){
        Avion avion = new AvionComercial(1000, 50);

        assertEquals(50, avion.getConsumoCombustible());
    }

}
