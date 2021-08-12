
### Escuela Colombiana de Ingeniería
### Arquitecturas de Software - ARSW Lab1
## Ejercicio Introducción al paralelismo - Hilos - Caso BlackListSearch




### Introduccion
	El objetivo de este laboratorio es trabajar y entender los Threads(subprocesos) con dos ejercicios que son: crear 3 hilos 
	y que cada uno imprima un segmento distinto de números y buscar trabajar con un problema relacionado con listas negras
	buscando su solucion Usando hilos. Este proyecto se desarrolla con fines académicos.
  

- ### Compilación y ejecución 
primero debemos tener una copia local del repositorio puede usar el comando `git clone`.

para compilarlo, el repositorio local, desde consola, nos ubicamos en la raiz del proyecto y usamos el comando `mvn compile`.
Para la ejecucion basta con el comando `mvn exec:java -Dexec.mainClass="edu.eci.arsw.threads.CountThreadsMain` desde consola. para algún resultado en especifico debera alterar la fuente.

- ## solucion a preguntas
	#### parte I - Introducción a Hilos en Java
	Cambie el incio con 'start()' por 'run()'. Cómo cambia la salida?, por qué?.
	
	en la salida con `run()` se mostraban los segmentos en orden y en el orden que se ejecuta cada en el código, por otro lado cuando usamos `start()` se ejecuto en desorden y se mostraba la parte de un segmento después la de otro y así sucesivamente, esto por la disponibilidad del medio en procesos paralelos.
