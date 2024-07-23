Al ejecutar el comando ./gradlew jmh se obtiene la salida de dos berchmarks, uno es ParallelStream y el otro Stream. De la cual en cada una se realizaron 10 iteraciones y cada una de ellas tiene un promedio diferente.

La operación Stream obtuvo un promedio de Stream 126.513 ms/op, Mientras que la operación ParallelStream obtuvo un promedio de 168.850 ms/op.
En este caso particular, la operación de stream es más rápida que la operación de stream paralelo 

![Stream](/Imagenes%20del%20Ejecicio3/Stream.png)

![ParaleloStream](/Imagenes%20del%20Ejecicio3/Paralelo%20Stream.png)

![Promedio](/Imagenes%20del%20Ejecicio3/Promedio%20de%20los%202%20Benchmark.png)
