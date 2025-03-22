/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clave_dicotomica;

/**
 *
 * @author leopo
 */
public class Treedecision<T> {

    public Node<T> root;

    public Treedecision() {
        this.root = null;
    }

    // Método para insertar un nodo en el árbol
    public void insert(T preguntaODecision, Node<T> parent, boolean esHoja, boolean esHijoIzquierdo) {
        Node<T> newNode = new Node<>(preguntaODecision);

        if (parent == null) {
            // Si el árbol está vacío, creamos la raíz
            this.root = newNode;
        } else {
            if (esHijoIzquierdo) {
                if (parent.left == null) {
                    parent.left = newNode; // Agregar como hijo izquierdo (respuesta "true")
                } else {
                    System.out.println("No se puede insertar, el hijo izquierdo ya existe.");
                }
            } else {
                if (parent.right == null) {
                    parent.right = newNode; // Agregar como hijo derecho (respuesta "false")
                } else {
                    System.out.println("No se puede insertar, el hijo derecho ya existe.");
                }
            }
        }
    }

    // Método para recorrer el árbol en preorden
    public String preorder(Node<T> root) {
        String toPrint = "";
        if (root != null) {
            toPrint += root.data + "\n"; // Mostrar el dato del nodo
            toPrint += preorder(root.left); // Recorrer el hijo izquierdo (respuesta "true")
            toPrint += preorder(root.right); // Recorrer el hijo derecho (respuesta "false")
        }
        return toPrint;
    }

    // Método para identificar el árbol basado en respuestas
    public void identificarArbol(Node<T> root) {
        if (root != null) {
            if (root.esHoja()) {
                // Si es una hoja, mostrar la decisión final
                System.out.println(root.data);
            } else {
                // Si es una pregunta, mostrar la pregunta y avanzar
                System.out.println(root.data);
                boolean respuesta = obtenerRespuesta(); // Simular la respuesta del usuario
                if (respuesta) {
                    identificarArbol(root.left); // Ir al hijo izquierdo (respuesta "true")
                } else {
                    identificarArbol(root.right); // Ir al hijo derecho (respuesta "false")
                }
            }
        }
    }

    // Método para simular la respuesta del usuario
    public boolean obtenerRespuesta() {
        // Aquí puedes implementar la lógica para obtener la respuesta del usuario
        // Por simplicidad, usaremos respuestas predefinidas
        boolean[] respuestas = {false, false, false, true}; // Respuestas simuladas
        return respuestas[0]; // Cambia el índice para probar diferentes casos
    }

    public static void main(String[] args) {
        // Crear el árbol de decisión
        Treedecision<String> arbol = new Treedecision<>();

        // Insertar preguntas y decisiones
        arbol.insert("¿Tiene hojas como agujas?", null, false, false); // Raíz

        // Insertar en el hijo izquierdo de la raíz
        arbol.insert("¿Las hojas de agujas vienen en ramales?", arbol.root, false, true);

        // Insertar en el hijo izquierdo del hijo izquierdo de la raíz
        arbol.insert("Es un Pino.", arbol.root.left, true, true);

        // Insertar en el hijo derecho del hijo izquierdo de la raíz
        arbol.insert("Es un Abeto.", arbol.root.left, true, false);

        // Insertar en el hijo derecho de la raíz
        arbol.insert("¿Tiene hojas compuestas?", arbol.root, false, false);

        // Insertar en el hijo izquierdo del hijo derecho de la raíz
        arbol.insert("¿Las sub-hojas parten de un punto central?", arbol.root.right, false, true);

        // Insertar en el hijo izquierdo del hijo izquierdo del hijo derecho de la raíz
        arbol.insert("Es un Castaño.", arbol.root.right.left, true, true);

        // Insertar en el hijo derecho del hijo izquierdo del hijo derecho de la raíz
        arbol.insert("Es un Nogal.", arbol.root.right.left, true, false);

        // Insertar en el hijo derecho del hijo derecho de la raíz
        arbol.insert("¿Tiene bordes de hoja aserrados?", arbol.root.right, false, false);

        // Insertar en el hijo izquierdo del hijo derecho del hijo derecho de la raíz
        arbol.insert("¿Tiene bordes de hoja con espinas?", arbol.root.right.right, false, true);

        // Insertar en el hijo izquierdo del hijo izquierdo del hijo derecho del hijo derecho de la raíz
        arbol.insert("Es un Acebo.", arbol.root.right.right.left, true, true);

        // Insertar en el hijo derecho del hijo izquierdo del hijo derecho del hijo derecho de la raíz
        arbol.insert("Es un Olmo.", arbol.root.right.right.left, true, false);

        // Insertar en el hijo derecho del hijo derecho del hijo derecho de la raíz
        arbol.insert("¿Tiene bordes de hoja con lóbulos?", arbol.root.right.right, false, false);

        // Insertar en el hijo izquierdo del hijo derecho del hijo derecho del hijo derecho de la raíz
        arbol.insert("Es un Roble Blanco.", arbol.root.right.right.right, true, true);

        // Insertar en el hijo derecho del hijo derecho del hijo derecho del hijo derecho de la raíz
        arbol.insert("Es una Magnolia.", arbol.root.right.right.right, true, false);

        // Recorrer el árbol en preorden
        System.out.println("Recorrido en preorden:");
        System.out.println(arbol.preorder(arbol.root));

        // Identificar un árbol basado en respuestas simuladas
        System.out.println("Identificación del árbol:");
        arbol.identificarArbol(arbol.root);
    }
}