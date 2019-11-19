/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueconlinkedlist;

/**
 *
 * @author ms324
 */
public class Bicola extends ColaLista {
    //inicializa frente y fin a null
    public Bicola(){
        super();
    }
    
    //inserta por el final de la Bicola
    public void ponerFinal(Object elemento)
    {
        insertar(elemento); // metodo hed¿redado de ColaLista
    }
    //inswertar por el frente; metodo propio de Bicola
    publuc void ponerFrente(Object elemento)
    {
        Nodo a;
        a= new Nodo(elemento);
        if (colaVacia())
        {
            fin = a;
        }
        a.siguiente = frente;
        frente = a;
    }
    // retira elemento frente de la Bicola
    public Object quitarFrente throws Exception
            {
                return quitar(); //metodo heredadode ColaLista
            }
            //retira elemento final; metodo propio de Bicola
    
}
