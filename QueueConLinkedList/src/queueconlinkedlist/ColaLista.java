/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueconlinkedlist;

class Nodo {

    Object elemento;
    Nodo siguiente;

    public Nodo(Object x) {
        elemento = x;
        siguiente = null;
    }
}
//declaracion de la clase colalista

/**
 *
 * @author ms324
 */
public class ColaLista {

    protected Nodo frente;
    protected Nodo fin;
    //Constructor: crea cola vacia

    public ColaLista() {
        frente = fin = null;
    }
    //insertar:pone el elemento por el final

    public void insertar(Object elemento) {
        Nodo a;
        a = new Nodo(elemento);

        if (colaVacia()) {
            frente = a;
        } else {
            fin.siguiente = a;

        }
        fin = a;
    }

    //quitar: sale el elemento frente
    public Object quitar() throws Exception {
        Object aux;
        if (!colaVacia()) {
            aux = frente.elemento;
            frente = frente.siguiente;
        } else {
            throw new Exception("Eliminar de una Cola Vacia");
        }
        return aux;
    }
    //libera todos los nodos de la cola

    public void borrarCola() {
        for (; frente != null;) {
            frente = frente.siguiente;
        }
        System.gc();
    }
//acceso al primero de la cola

    public Object frenteCola() throws Exception{
    if (colaVacia()) {
            throw new Exception("Error:cola vacia");
        }
        return (frente.elemento);
    }
//verificacion del estado de la cola

    public boolean colaVacia() {
        return (frente == null);
    }

}
