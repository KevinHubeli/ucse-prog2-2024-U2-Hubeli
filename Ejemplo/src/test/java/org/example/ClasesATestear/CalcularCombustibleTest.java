package org.example.ClasesATestear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class CalcularCombustibleTest {

    private CalculadorCombustible instance;
    private Avion avionMock;

    @BeforeEach
    public void setUp() {
        // Inicializa la instancia única de CalculadorCombustible
        instance = CalculadorCombustible.getInstance();

        // Crea un mock de la clase Avion
        avionMock = Mockito.mock(Avion.class);
    }

    @Test
    public void testGetInstance_PrimeraVez() {
        assertNotNull(instance);
    }

    @Test
    public void testGetInstance_SegundaVez() {
        CalculadorCombustible instance2 = CalculadorCombustible.getInstance();
        assertSame(instance, instance2);
    }

    @Test
    public void testCalcularCombustible() {
        Mockito.when(avionMock.volar(Mockito.anyInt())).thenReturn(1000);


        int resultado = instance.calcularCombustible(avionMock, 100);

        assertEquals(1000, resultado, "El cálculo del combustible no es el esperado");
    }
}

