/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *Complete el método main de la clase CountMainThreads para que:
 * Cree 3 hilos de tipo CountThread, asignándole al primero el
 * intervalo [0..99], al segundo [100..199], y al tercero [200..299].
 * Inicie los tres hilos con 'start()'.
 * Ejecute y revise la salida por pantalla.
 * Cambie el incio con 'start()' por 'run()'. Cómo cambia la salida?, por qué?.
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        Thread hilo1 =new Thread(new CountThread( 0,99 ));
        Thread hilo2 =new Thread( new CountThread( 100,199 ));
        Thread hilo3 = new Thread(new CountThread (200,299 ));

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
    
}
