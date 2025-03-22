/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clave_dicotomica;

/**
 *
 * @author leopo
 */
public class Node<T> {

    public Node<T> left;  // Respuesta "true" (izquierda)
    public Node<T> right; // Respuesta "false" (derecha)
    public T data;        // Dato almacenado en el nodo (pregunta o decisión)

    // Constructor
    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // Método para agregar un hijo izquierdo (respuesta "true")
    public void addLeft(Node<T> newLeft) {
        if (this.left != null) {
            // Si ya tiene un hijo izquierdo, agregamos el nuevo nodo como hijo derecho del hijo izquierdo
            Node<T> temp = this.left;
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = newLeft;
        } else {
            // Si no tiene un hijo izquierdo, el nuevo nodo es el hijo izquierdo
            this.left = newLeft;
        }
    }

    // Método para agregar un hijo derecho (respuesta "false")
    public void addRight(Node<T> newRight) {
        if (this.right != null) {
            // Si ya tiene un hijo derecho, agregamos el nuevo nodo como hijo derecho del hijo derecho
            Node<T> temp = this.right;
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = newRight;
        } else {
            // Si no tiene un hijo derecho, el nuevo nodo es el hijo derecho
            this.right = newRight;
        }
    }

    // Método para verificar si el nodo es una hoja (no tiene hijos)
    public boolean esHoja() {
        return this.left == null && this.right == null;
    }
}
