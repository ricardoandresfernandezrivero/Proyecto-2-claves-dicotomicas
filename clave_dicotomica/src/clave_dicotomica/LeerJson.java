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
         public static void main(String[] args) {
        // Ruta de los archivos JSON
        String rutaFamilias = "C:\\Users\\leopo\\Downloads\\Archivos\\familias_botanicas.json"; // Cambia esto por la ruta correcta
        String rutaArboles = "C:\\Users\\leopo\\Downloads\\Archivos\\arboles_templados.json";

        // Procesar el archivo de familias botánicas
        System.out.println("Procesando familias botánicas...");
        procesarJSON(rutaFamilias, "Familias botánicas");

        // Procesar el archivo de árboles templados
        System.out.println("\nProcesando árboles templados...");
        procesarJSON(rutaArboles, "Arboles templados");
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
        } catch (Exception ex) {
            System.err.println("Error al procesar el archivo JSON: " + ex.getMessage());
        }
    }
}
    /**
     * @param args the command line arguments
     */
    
    
    

