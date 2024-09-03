package org.example.ClasesATestear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionTest {
    private Avion avion;

    @BeforeEach
    void setUp() {
        // Inicializa el objeto antes de cada prueba
        avion = new Avion(1000, 300) {
            @Override
            public int volar(int distancia) {
                // Implementación ficticia para permitir la prueba
                return 0;
            }
        };
    }

    @Test
    void testGetCapacidadCombustible() {
        assertEquals(1000, avion.getCapacidadCombustible());
    }

    @Test
    void testGetConsumoCombustible() {
        assertEquals(300, avion.getConsumoCombustible());
    }
}

