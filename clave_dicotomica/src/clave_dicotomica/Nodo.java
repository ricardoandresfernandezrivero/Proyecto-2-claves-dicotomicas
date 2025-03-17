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

/*
*
Clase que representa el nodo que se va a utilizar para el arbol binario
y probablemente la hash table tambien usando solo un hijo si hay colision
*
*/

public class Nodo<T> {
    private T info;
    private Nodo<T> hijo_izq;
    private Nodo<T> pNext;
    private Nodo<T> hijo_der;
    private boolean esVerdad;
    private Lista preguntas;

    public boolean isEsVerdad() {
        return esVerdad;
    }

    public void setEsVerdad(boolean esVerdad) {
        this.esVerdad = esVerdad;
    }

    public Nodo(T info) {
        this.info = info;
        this.hijo_izq = null;
        this.hijo_der = null;
        this.pNext = null;
    }

    public Nodo<T> getpNext() {
        return pNext;
    }

    public void setpNext(Nodo<T> pNext) {
        this.pNext = pNext;
    }

    public Lista getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Lista preguntas) {
        this.preguntas = preguntas;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo<T> getHijo_izq() {
        return hijo_izq;
    }

    public void setHijo_izq(Nodo<T> hijo_izq) {
        this.hijo_izq = hijo_izq;
    }

    public Nodo<T> getHijo_der() {
        return hijo_der;
    }

    public void setHijo_der(Nodo<T> hijo_der) {
        this.hijo_der = hijo_der;
    }
    
    
}
