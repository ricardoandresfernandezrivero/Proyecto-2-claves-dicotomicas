/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clave_dicotomica;

/**
 *
 * @author zarna
 */
public class HTable {
    int key;
    Nodo value;
    int size;
    HNodo[] arr;

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
    
    public int hashFunction(String key){
    int sum = 0;    
    for(int i=0; i<key.length();i++){
    int num = Character.getNumericValue(key.charAt(i));
    sum += num;
    }
    return sum%arr.length;
    }
    
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
