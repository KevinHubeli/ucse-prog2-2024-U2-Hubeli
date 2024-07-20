package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionComercialTest {

    @Test
    public void testVolar() {
        AvionComercial avionComercial = new AvionComercial(1000, 2);

        assertEquals(2000, avionComercial.volar(1000));
    }
}
