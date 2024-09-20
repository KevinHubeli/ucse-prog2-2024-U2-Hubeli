Al ejecutar el comando ./gradlew jmh se obtiene la salida de dos berchmarks, uno es ParallelStream y el otro Stream. De
la cual en cada una se realizaron 10 iteraciones y cada una de ellas tiene un promedio diferente.

La operación Stream obtuvo un promedio de Stream 126.513 ms/op, Mientras que la operación ParallelStream obtuvo un
promedio de 168.850 ms/op.
En este caso particular, la operación de stream es más rápida que la operación de stream paralelo

![Stream](/Imagenes%20del%20Ejecicio3/Stream.png)

![ParaleloStream](/Imagenes%20del%20Ejecicio3/Paralelo%20Stream.png)

![Promedio](/Imagenes%20del%20Ejecicio3/Promedio%20de%20los%202%20Benchmark.png)

# Correcciones - Estado: RE-ENTREGA

## Necesarias para aprobar:

- El StreamBenchmark NO se realiza de la manera correcta. Justamente la idea es utilizar la libreria org.openjdk.jmh
  para realizar las pruebas, y utilizar los métodos previstos.
- La imagen de las pruebas de benchmark NO se corresponde con lo que realiza la aplicación. Actualizar las imágenes como
  corresponda.
- En la elaboración de sus conclusiones, es fundamental que incluyan los valores obtenidos en la descripción y
  cuantifiquen los resultados con medidas específicas. Al hacer esto, sus conclusiones serán más precisas y sólidas.
  Incluir qué Modo de Benchmark utilizaron, por qué lo eligieron, análizar qué representan los resultados, cómo influye
  la tasa de errores, etc.

## Adicionales:

- Ejercicio 1: en los tests no utliza @BeforeEach, codigo repetido que se pisa ya que no se renueva en cada @Test.
- Se podrían optimizar los imports
- La estructura de las carpetas podría separarse entre cada ejercicio de una manera más granular. Pordían separar entre
  ClasesATestear, Ejercicio3, Ejercicio4, PrebaBenchmark y colocar cada archivo en cada package correspondiente.
- En ésta misma linea, si hacen el refactor sugerido en el punto anterior, los tests siempre deberían de ir en el mismo
  package y tener la misma estructura de carpetas que en main, por lo tanto en vez de ir en test/java deberían de ir
  dentro de test/java/org/example/TestClasesATestear
- Deberían de actualizar el .gitignore para no incluir los archivos generados al compilar, ni los archivos propios del
  framework que utilicen (.idea, .vscode, etc). De lo contrario se pueden pushear archivos indeseados, como la carpeta
  build, "hs_err_pid5148.log" y otros.

