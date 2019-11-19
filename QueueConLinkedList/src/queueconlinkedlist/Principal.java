/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueconlinkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ms324
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();
        //inserta datos
        //retorna un Exception en caso de no poder
        //Almacena el elemento
        queue.add("Adrian");
        queue.add("Jesus");
        queue.add("Daniel");

        //inserta dato
        //retorna null en caso de no poder
        //almacena el elemento
        queue.offer("Francisco");

        //elimina un elemento (el primer elemento de la estructura)
        System.out.println("SE ELIMINO : "+queue.remove());

        System.out.println("FRENTE A LA COLA : "+ queue.element());
        //elimina un elemento de la cola
        //retorna null si la cola esta vacia
        System.out.println("Selelimino el elemento :"+ queue.peek());
        
        //Mostrar todo el contenido
        System.out.println("Contenidos : "+ queue.toString());
    }

}
