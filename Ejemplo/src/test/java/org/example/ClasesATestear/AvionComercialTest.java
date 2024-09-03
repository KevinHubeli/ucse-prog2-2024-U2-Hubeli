package org.example.ClasesATestear;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AvionComercialTest {
    private AvionComercial avionComercial;

    @BeforeEach
    public void setUp() {
        // Inicializa el objeto antes de cada prueba
        avionComercial = new AvionComercial(1000, 2);
    }

    @Test
    public void testVolar() {
        // Usa el objeto inicializado en setUp
        assertEquals(2000, avionComercial.volar(1000));
    }
}



