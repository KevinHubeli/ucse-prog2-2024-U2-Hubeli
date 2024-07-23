package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class CalcularCombustibleTest {

    @Test
    public void testGetInstance_PrimeraVez() {
        CalculadorCombustible instance = CalculadorCombustible.getInstance();

        assertNotNull(instance);
    }

    @Test
    public void testGetInstance_SegundaVez() {
        CalculadorCombustible instance1 = CalculadorCombustible.getInstance();
        CalculadorCombustible instance2 = CalculadorCombustible.getInstance();

        assertSame(instance1, instance2, "Las instancias deben ser la misma");
    }

    @Test
    public void testCalcularCombustible() {
        Avion avionMock = Mockito.mock(Avion.class);
        Mockito.when(avionMock.volar(Mockito.anyInt())).thenReturn(1000);

        CalculadorCombustible instance = CalculadorCombustible.getInstance();
        int resultado = instance.calcularCombustible(avionMock, 100);

        assertEquals(1000, resultado);
    }
}
