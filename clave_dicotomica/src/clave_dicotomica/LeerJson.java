/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clave_dicotomica;

/**
 *
 * @author zarna
 */
import java.io.FileReader;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;


public class LeerJson {
        static Treedecision arbol = new Treedecision();
         public static void main(String[] args) {
        // Ruta de los archivos JSON
        String rutaFamilias = "src/clave_dicotomica/familias_botanicas.json"; // Cambia esto por la ruta correcta
        String rutaArboles = "src/clave_dicotomica/arboles_templados.json";

        // Procesar el archivo de familias botánicas
        //System.out.println("Procesando familias botánicas...");
        //procesarJSON(rutaFamilias, "Familias botánicas");

        // Procesar el archivo de árboles templados
        System.out.println("\nProcesando árboles templados...");
        procesarJSON2(rutaArboles, "Arboles templados");
    }

    private static void procesarJSON(String rutaArchivo, String clavePrincipal) {
        try (FileReader reader = new FileReader(rutaArchivo)) {
            // Parsear el archivo JSON
            JSONTokener tokener = new JSONTokener(reader);
            JSONObject jsonObject = new JSONObject(tokener);

            // Obtener la lista principal (familias botánicas o árboles templados)
            JSONArray listaPrincipal = jsonObject.getJSONArray(clavePrincipal);

            // Recorrer cada elemento de la lista principal
            for (int i = 0; i < listaPrincipal.length(); i++) {
                JSONObject item = listaPrincipal.getJSONObject(i);

                // Obtener el nombre del elemento (familia o árbol)
                String nombre = item.keys().next();
                System.out.println("\n" + clavePrincipal + ": " + nombre);

                // Obtener las propiedades del elemento
                JSONArray propiedades = item.getJSONArray(nombre);

                // Recorrer cada propiedad
                for (int j = 0; j < propiedades.length(); j++) {
                    JSONObject prop = propiedades.getJSONObject(j);
                    // Obtener la clave y el valor de la propiedad
                    String clave = prop.keys().next();
                    Object valor = prop.get(clave);
                    System.out.println("  - " + clave + ": " + valor);
                }
             
            }
          
            
            
          JSONObject obj= listaPrincipal.getJSONObject(5);
          String name = obj.keys().next();
          
          System.out.println(listaPrincipal.getJSONObject(5).getJSONArray(listaPrincipal.getJSONObject(5).keys().next()).toString());
           
          
        } catch (Exception ex) {
            System.err.println("Error al procesar el archivo JSON: " + ex.getMessage());
        }
    }
    private static void procesarJSON2(String rutaArchivo, String clavePrincipal) {
        try (FileReader reader = new FileReader(rutaArchivo)) {
            // Parsear el archivo JSON
            JSONTokener tokener = new JSONTokener(reader);
            JSONObject jsonObject = new JSONObject(tokener);

            // Obtener la lista principal (familias botánicas o árboles templados)
            JSONArray listaPrincipal = jsonObject.getJSONArray(clavePrincipal);

            // Recorrer cada elemento de la lista principal
            for (int k = 0; k < listaPrincipal.length(); k++) {
                JSONObject item = listaPrincipal.getJSONObject(k);
                
                // Obtener el nombre del elemento (familia o árbol)
                
                String nombre = item.keys().next();
                // Obtener las propiedades del elemento
                JSONArray propiedades = item.getJSONArray(nombre);
                arbol.root = new Node(propiedades.getJSONObject(0).keys().next());
                boolean[] ruta = new boolean[propiedades.length()];
                // Recorrer cada propiedad
                for (int j = 0; j < propiedades.length(); j++) {
                    JSONObject prop = propiedades.getJSONObject(j);
                    // Obtener la clave y el valor de la propiedad
                    String clave = prop.keys().next();
                    
                    boolean valor = (boolean) prop.get(clave);
                    
                   
                    
                    
                    ruta[j] = valor;
                   
                   //System.out.println(clave + ""+ ruta[j]);
                   // arbol.insert2(propiedades, parent, valor, valor);
                    
                }
                
                for (int j = 0; j < propiedades.length()-1; j++) {
                    boolean[] ruta2 = new boolean[j+1];
                    String[] claves = new String[j+1];
                        
                        
                    JSONObject prop = propiedades.getJSONObject(j);
                    String clave = prop.keys().next();
                    boolean valor = (boolean) prop.get(clave);
                    ruta2[j] = valor;
                    String clave2 = propiedades.getJSONObject(j+1).keys().next();
                    /*for(int n=0 ; n<=j; n++){
                    claves[n] = clave;
                    }
                    for(int n=0 ; n<=j; n++){
                    System.out.println(claves[n]);
                    }*/
                    
                    
                    System.out.println(clave2+":");
                    
                    //System.out.println(clave + valor);
                    
                    for(int n=0;n<=j;n++){
                    System.out.println(ruta2[n]);
                    }
                    
                        
                    
                    
                    
                   // arbol.insert2(propiedades, parent, valor, valor);
                   // arbol.insert2(nodo,ruta); 
                }
                
                
                
                
                
             System.out.println("----");
             Node pNew = new Node(nombre);
                
            
                }
            
                
             
            
          

    
          JSONObject obj= listaPrincipal.getJSONObject(5);
          String name = obj.keys().next();
          String prop = obj.getJSONArray(name).getJSONObject(2).keys().next();
          JSONObject propiedad = obj.getJSONArray(name).getJSONObject(2);
          //COMO SACAR EL NOMBRE
          System.out.println(propiedad.get(prop));
          //COMO SACAR EL VALOR
          
            
        } catch (Exception ex) {
            System.err.println("Error al procesar el archivo JSON: " + ex.getMessage());
        }
    }
    
    
    
}
    /**
     * @param args the command line arguments
     */
    
    
    

