/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clave_dicotomica;

import java.util.Hashtable;

/**
 *
 * @author zarna
 */
public class NewClass {
    public static void main(String[] args){
    Hashtable<String,Boolean> hash = new Hashtable();
    Hashtable<String,Boolean> hash2 = new Hashtable();
    Hashtable<String,Hashtable> hash3 = new Hashtable();
    hash.put("Hojas como agujas",true);
    hash.put("Hojas de agujas vienen en ramales",true);
    hash2.put("Hojas como agujas",true);
    hash2.put("Hojas de agujas vienen en ramales",false);
    hash3.put("Pino",hash);
    hash3.put("Abeto",hash2);
    System.out.print(hash3);
    
    
    
    
    }
}
