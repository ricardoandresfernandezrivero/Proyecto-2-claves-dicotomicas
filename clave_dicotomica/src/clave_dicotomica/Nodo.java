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
public class Nodo<T> {
    private T info;
    private Nodo<T> hijo_izq;
    private Nodo<T> hijo_der;

    public Nodo(T info) {
        this.info = info;
        this.hijo_izq = null;
        this.hijo_der = null;
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
