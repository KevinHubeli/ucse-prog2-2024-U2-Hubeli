package org.example.PruebaBenchmark;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamBenchmark {
    private List<Integer> list;

    public void setup() {
        int size = 10000000;
        Random random = new Random();
        list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1, 50000));
        }
    }

    public List<Integer> stream() {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> parallelStream() {
        return list.parallelStream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {

        StreamBenchmark benchmark = new StreamBenchmark();
        benchmark.setup();

        // Stream
        long startTime = System.nanoTime();
        benchmark.stream();
        long endTime = System.nanoTime();
        long durationStream = endTime - startTime;
        System.out.println("Tiempo de ejecución de stream secuencial: " + (durationStream / 1_000_000) + " ms");

        // Parallel Stream
        startTime = System.nanoTime();
        benchmark.parallelStream();
        endTime = System.nanoTime();
        long durationParallelStream = endTime - startTime;
        System.out.println("Tiempo de ejecución de parallelStream: " + (durationParallelStream / 1_000_000) + " ms");
    }
}

