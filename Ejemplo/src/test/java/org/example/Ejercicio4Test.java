package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ejercicio4Test {

    @Test
    public void finalizaronLaPrimeraTarea() {
        // Redirigir la salida del sistema
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecutar el método cuatroHilos
        new Ejercicio4().cuatroHilos();

        // Obtener la salida y verificar si contiene el texto esperado
        String output = outContent.toString();
        assertTrue(output.contains("El valor del primera tarea completada es: "));
    }
}
