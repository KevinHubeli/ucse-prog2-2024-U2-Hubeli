package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionPrivadoTest {

    @Test
    public void testVolarDelAvionPrivado() {
        AvionPrivado avionPrivado = new AvionPrivado(2500, 40);

        assertEquals(41250, avionPrivado.volar(1000));
    }
}
