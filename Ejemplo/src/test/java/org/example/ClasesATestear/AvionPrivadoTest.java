package org.example.ClasesATestear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class AvionPrivadoTest {
    private AvionPrivado avionPrivado;

    @BeforeEach
    public void setUp() {
        // Inicializa el objeto antes de cada prueba
        avionPrivado = new AvionPrivado(2500, 40);
    }

    @Test
    public void testVolarDelAvionPrivado() {
        // Usa el objeto inicializado en setUp
        assertEquals(41250, avionPrivado.volar(1000));
    }
}

