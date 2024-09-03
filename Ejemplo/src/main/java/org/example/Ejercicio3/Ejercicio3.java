package org.example.Ejercicio3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio3 {

    public static void main(String[] args) {
        Ejercicio3 ejercicio = new Ejercicio3();
        ejercicio.cuatroHilos();
    }
    public void cuatroHilos() {
        //4 tareas nuevas
        CompletableFuture<Integer> tarea1 = createTarea();
        CompletableFuture<Integer> tarea2 = createTarea();
        CompletableFuture<Integer> tarea3 = createTarea();
        CompletableFuture<Integer> tarea4 = createTarea();

        CompletableFuture<Void> tareas = CompletableFuture.allOf(tarea1, tarea2, tarea3, tarea4);

        tareas.thenAccept(r -> {
            try {
                int suma = tarea1.get() + tarea2.get() + tarea3.get() + tarea4.get();
                System.out.println("La suma de los 4 hilos es: " + suma);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        tareas.join();
    }
    private CompletableFuture<Integer> createTarea() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                int delay = ThreadLocalRandom.current().nextInt(100, 500);
                String threadName = Thread.currentThread().getName();
                System.out.println("Hilo " + threadName + " iniciado con un retraso de " + delay + " milisegundos.");
                Thread.sleep(delay);
                System.out.println("Hilo " + threadName + " terminado después de " + delay + " milisegundos.");
                return delay;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }}
