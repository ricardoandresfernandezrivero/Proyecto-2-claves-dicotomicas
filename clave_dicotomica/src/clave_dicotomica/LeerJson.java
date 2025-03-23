/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clave_dicotomica;

import java.io.FileReader;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * Clase para leer archivos JSON. Carga y procesa datos JSON
 * para construir estructuras de datos como una Hash Table.
 * @author zarna
 */

public class LeerJson {
        
         public static void main(String[] args) {
        String rutaFamilias = "src/clave_dicotomica/familias_botanicas.json"; 
        String rutaArboles = "src/clave_dicotomica/arboles_templados.json";

        
        
        //procesarJSON2(rutaFamilias, "Familias botánicas","Tejo");

        // Procesar el archivo de árboles templados
        //System.out.println("\nProcesando árboles templados...");
        
    }

    /**
     * Procesa un JSON y hace una Hash Table a partir de los datos obtenidos.
     * 
     * @param rutaArchivo ruta del JSON.
     * @param clavePrincipal clave principal del archivo.
     * @return una Hash Table con los datos del JSON, o <code>null</code> si ocurre un error.
     */    
         
    public static HTable procesarJSON(String rutaArchivo, String clavePrincipal) {
        HTable hashtable;
        try (FileReader reader = new FileReader(rutaArchivo)) {
            
            JSONTokener tokener = new JSONTokener(reader);
            JSONObject jsonObject = new JSONObject(tokener);
            JSONArray lista = jsonObject.getJSONArray(clavePrincipal);
            hashtable = new HTable(lista.length());
            
            for (int i = 0; i < lista.length(); i++) {
                JSONObject cosa = lista.getJSONObject(i);
                String nombre = cosa.keys().next();
                JSONArray propiedades = cosa.getJSONArray(nombre);
                String[] preguntas = new String[propiedades.length()];
                
                for (int j = 0; j < propiedades.length(); j++) {
                    JSONObject prop = propiedades.getJSONObject(j);
                    
                    String clave = prop.keys().next();
                    boolean valor = (boolean) prop.get(clave);
                    preguntas[j] = clave+"= "+valor;
                    
                }
             HNodo nodo = new HNodo(nombre,preguntas);
             hashtable.hashFunction(nombre);
             hashtable.put(nodo);
             
             
            }
          
          return hashtable;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    /**
     * Procesa un archivo JSON y busca un valor específico, devolviendo un array de booleanos.
     * 
     * @param rutaArchivo ruta del JSON.
     * @param clavePrincipal clave del archivo que contiene el array de datos.
     * @param value valor a buscar.
     * @return un array de booleanos asociado al valor obtenido, o <code>null</code> si no se encuentra.
     */
    
    public static boolean[] procesarJSON2(String rutaArchivo, String clavePrincipal, String value) {
        boolean[] ruta1;
        try (FileReader reader = new FileReader(rutaArchivo)) {
          
            JSONTokener tokener = new JSONTokener(reader);
            JSONObject jsonObject = new JSONObject(tokener);

           
            JSONArray lista = jsonObject.getJSONArray(clavePrincipal);

        
            for (int k = 0; k < lista.length(); k++) {
                JSONObject item = lista.getJSONObject(k);
                
    
                
                String nombre = item.keys().next();
            
                JSONArray propiedades = item.getJSONArray(nombre);
                /*arbol.root = new Node(propiedades.getJSONObject(0).keys().next());*/
                boolean[] ruta = new boolean[propiedades.length()];
     
                
                
                for (int j = 0; j < propiedades.length(); j++) {
                    JSONObject prop = propiedades.getJSONObject(j);
                   
                    String clave = prop.keys().next();
                    
                    boolean valor = (boolean) prop.get(clave);
                    
                   
                    
                    
                    ruta[j] = valor;
                   
                   //Node pNew = new Node(clave);
                   //arbol.insert2(pNew,ruta);
                   //arbol.insert2(pNew,ruta); 
                    
                }
                
                
                
             
             
                
            System.out.println(nombre+" "+Arrays.toString(ruta));
            
            
            if(nombre.equals(value)){
            ruta1 = ruta;
            return ruta1; 
            }
            
            
            
            
                }
            
                
             
            
          

           
        } catch (Exception e) {
            System.err.println("Error al procesar el archivo JSON: " + e.getMessage());
        }
        return null;
    }
    
    
    
}
    /**
     * @param args the command line arguments
     */
    
    
    

