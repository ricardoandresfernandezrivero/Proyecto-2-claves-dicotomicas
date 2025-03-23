/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clave_dicotomica;

/**
 *
 * @author zarna
 * @param <T>
 */
public class Pila<T> {
    private int size;
    private Nodo cima;

    public Pila() {
        this.size = 0;
        this.cima = null;
    }
    
    public boolean isEmpty() {
        return cima == null;
    }
    
    public void vaciar() {
        this.size = 0;
        this.cima = null;
    }
    
    public void apilar(String nodo) {
        Nodo pNew = new Nodo(nodo);
        if (isEmpty()) {
            this.cima = pNew;
        } else {
            pNew.setpNext(this.cima);
            this.cima = pNew;
        }
        this.size++;
    }
    
    public void desapilar() {
        if (isEmpty()) {
            System.out.println("La lista está vacía");
            
        }
        System.out.println(this.cima.getInfo());
        Nodo aux = this.cima;
        this.cima = this.cima.getpNext();
        aux.setpNext(null);
        this.size--;
        
    }

    
    public int getSize() {
        return size;
    } 
}
