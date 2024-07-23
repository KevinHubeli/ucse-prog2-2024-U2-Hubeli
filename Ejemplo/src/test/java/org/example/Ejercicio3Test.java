package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ejercicio3Test {

    @Test
    public void finalizaronLasCuatroTareas() {
        // Redirigir la salida del sistema
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecutar el método cuatroHilos
        new Ejercicio3().cuatroHilos();

        // Obtener la salida y verificar si contiene el texto esperado
        String output = outContent.toString();
        assertTrue(output.contains("La suma de los 4 hilos es: "));
    }
}
