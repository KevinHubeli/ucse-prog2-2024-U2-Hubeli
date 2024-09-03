package org.example.PruebaBenchmark;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StreamBenchmarkTest {
    private StreamBenchmark benchmark;

    @BeforeEach
    public void setUp() {
        benchmark = new StreamBenchmark();
        benchmark.setup(); // Inicializa la lista
    }

    @Test
    void testStream() {
        List<Integer> resultado = benchmark.stream();

        assertNotNull(resultado, "El resultado no debe ser nulo");
        assertFalse(resultado.isEmpty(), "El resultado no debe estar vacío");

        for (Integer num : resultado) {
            assertEquals(0, num % 2, "Todos los números deben ser pares");
        }
    }

    @Test
    void testParallelStream() {
        List<Integer> resultado = benchmark.parallelStream();

        assertNotNull(resultado, "El resultado no debe ser nulo");
        assertFalse(resultado.isEmpty(), "El resultado no debe estar vacío");

        for (Integer num : resultado) {
            assertEquals(0, num % 2, "Todos los números deben ser pares");
        }
    }
}


