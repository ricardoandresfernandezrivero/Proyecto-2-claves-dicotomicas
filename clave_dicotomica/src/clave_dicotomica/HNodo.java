/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clave_dicotomica;

/**
 * Nodos usados para la implementaci&oacute;n de Hash Table.
 * @author zarna
 */
public class HNodo {
    private String info;
    private String[] preguntas;
    private HNodo pNext;
    /**
     * Constructor de la clase HNodo.
     * @param info informaci&oacute;n que corresponde a la especie.
     * @param preguntas lista de strings que contienen las preguntas perteneciente a la especie.
     */
    public HNodo(String info, String[] preguntas) {
        this.info = info;
        this.preguntas = preguntas;
        this.pNext = null;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }

    public HNodo getpNext() {
        return pNext;
    }

    public void setpNext(HNodo pNext) {
        this.pNext = pNext;
    }
    
    
    
    
}
