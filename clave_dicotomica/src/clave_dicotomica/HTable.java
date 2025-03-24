/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clave_dicotomica;

/**
 * Clase correspondiente a la Hash Table para gestionar los nodos.
 * @author zarna
 */
public class HTable {
    int key;
    Nodo value;
    int size;
    HNodo[] arr;
    /**
     * Constructor de la clase HTable.
     * @param size tama&ntilde;o de la tabla hash.
     */
    public HTable(int size) {
        this.size = size;
        this.arr = new HNodo[size];
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Nodo getValue() {
        return value;
    }

    public void setValue(Nodo value) {
        this.value = value;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public HNodo[] getArr() {
        return arr;
    }

    public void setArr(HNodo[] arr) {
        this.arr = arr;
    }
    /**
     * Calcula la posici&oacute;n en la tabla hash acorde al parametro dado. 
     * Suma los caracteres del parametro y consigue el m&oacute;dulo con respecto al Hash Table.
     * 
     * @param key La clave para la cual se le calcula una posici&oacute;n en la hash table.
     * @return La posici&oacute;n del parametro key acorde a la Hash Table.
     */
    public int hashFunction(String key){
    int sum = 0;    
    for(int i=0; i<key.length();i++){
    int num = Character.getNumericValue(key.charAt(i));
    sum += num;
    }
    return sum%arr.length;
    }
    /**
     * Inserta un nodo en la Hash Table. Si esta ocupado, escoge el siguiente
     * espacio disponible.
     * @param value Nodo que se quiere agregar a la Hash Table.
     */
    public void put(HNodo value){
    int i = this.hashFunction(value.getInfo());
    if(arr[i]==null){
    arr[i] = value;
    }else{
    for(int j=0;j<this.getSize();j++){
    if(arr[i]==null){
    arr[i] = value;
    break;
    }
    }
    }
    }
    /**
     * Devuelve las preguntas que corresponden al valor en la Hash Table que
     * coincide con el parametro de entrada. 
     * @param value valor que corresponde a las preguntas a las que se quieren
     * acceder.
     * @return preguntas que coinciden con el parametro de entrada.
     */
    public String[] get(String value){
    int i = this.hashFunction(value);
    String[] valor = null;
    if(arr[i].getInfo().equals(value)){
    valor = arr[i].getPreguntas(); 
    }else{
    for(int j=0;j<this.getSize();j++){
    if(arr[j].getInfo().equals(value)){
    valor = arr[j].getPreguntas();
    
    }
    }      
    }
    
    return valor;
    }
    
    
}
