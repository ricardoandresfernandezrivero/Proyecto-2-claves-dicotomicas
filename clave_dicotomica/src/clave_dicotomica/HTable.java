/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clave_dicotomica;

/**
 *
 * @author zarna
 */
public class HTable<T> {
    int key;
    Nodo value;
    int size;
    Nodo[] arr;

    public HTable(int size) {
        this.size = size;
        this.arr = new Nodo[size];
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

    public Nodo[] getArr() {
        return arr;
    }

    public void setArr(Nodo[] arr) {
        this.arr = arr;
    }
    
    public int hashFunction(String key){
    int sum = 0;    
    for(int i=0; i<key.length();i++){
    int num = Character.getNumericValue(key.charAt(i));
    sum += num;
    }
    return sum%arr.length;
    }
    
    public void put(String key, Nodo value){
    int i = this.hashFunction(key);
    if(arr[i]==null){
    arr[i] = value;
    }else{
    //Se hace la lista enlazada
    }
    }
    
    public void get(String key){}
}
