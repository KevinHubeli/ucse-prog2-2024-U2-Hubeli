package org.example;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio4 {
    public void cuatroHilos() {
        //4 tareas nuevas
        CompletableFuture<Integer> tarea1 = createTarea();
        CompletableFuture<Integer> tarea2 = createTarea();
        CompletableFuture<Integer> tarea3 = createTarea();
        CompletableFuture<Integer> tarea4 = createTarea();

        CompletableFuture<Object> tareaPrimera = CompletableFuture.anyOf(tarea1, tarea2, tarea3, tarea4);

        tareaPrimera.thenAccept(r -> {
            System.out.println("El valor del primera tarea completada es: " + r);
        });

        tareaPrimera.join();
    }
    private CompletableFuture<Integer> createTarea() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                int delay = ThreadLocalRandom.current().nextInt(10, 300);
                String threadName = Thread.currentThread().getName();
                System.out.println("Hilo " + threadName + " iniciado con un retraso de " + delay + " milisegundos.");
                Thread.sleep(delay);
                System.out.println("Hilo " + threadName + " terminado después de " + delay + " milisegundos.");
                return delay;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
