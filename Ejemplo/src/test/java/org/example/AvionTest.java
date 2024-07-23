package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionTest {

    @Test
    void testGetCapacidadCombustible() {
        Avion avion = new Avion(1000,300) {
            @Override
            public int volar(int distancia) {
                return 0;
            }
        };
        assertEquals(1000, avion.getCapacidadCombustible());
    }

    @Test
    void testGetConsumoCombustible() {
        Avion avion = new Avion(1000,300) {
            @Override
            public int volar(int distancia) {
                return 0;
            }
        };
        assertEquals(300, avion.getConsumoCombustible());
    }
}
