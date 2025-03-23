/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clave_dicotomica;

/**
 *
 * @author zarna
 * @param <T>
 */
public class BinTree {
    private Nodo pRoot;
    private int iN;

    public int getiN() {
        return iN;
    }

    public void setiN(int iN) {
        this.iN = iN;
    }

    public BinTree() {
        this.pRoot = null;
        this.iN = 0;
    }
    

    public Nodo getpRoot() {
        return pRoot;
    }

    public void setpRoot(Nodo pRoot) {
        this.pRoot = pRoot;
    }
    
    public void insertar(Nodo hijo,Nodo padre, boolean direccion){
    if(direccion == false){
    padre.setHijo_izq(hijo);
    }else{
    padre.setHijo_der(hijo);
    }
    }
    
    public void generarArbol1(){
    Nodo n1 = new Nodo("Hojas como agujas");
    setpRoot(n1);
    Nodo n2 = new Nodo("Hojas de agujas vienen en ramales");
    Nodo n3 = new Nodo("Hojas compuestas");
    insertar(n2, pRoot, true);
    insertar(n3, pRoot, false);
    Nodo n4 = new Nodo("Pino");
    Nodo n5 = new Nodo("Abeto");
   insertar(n4, n2, true);
   insertar(n5, n2, false); 
   Nodo n6 = new Nodo("Bordes de hoja aserrados");
   Nodo n7 = new Nodo("Bordes de hoja con lobulos");
   Nodo n8 = new Nodo("Bordes de hoja con espinas");
   Nodo n9 = new Nodo("Sub-hojas parten de un punto central");
   Nodo na = new Nodo("Roble Blanco");
   Nodo nb = new Nodo("Magnolia");
   Nodo nc = new Nodo("Acebo");
   Nodo nd = new Nodo("Olmo");
   Nodo ne = new Nodo("Castanna");
   Nodo nf = new Nodo("Nogal");
   insertar(n6, n3, false);
   insertar(n7, n6, false);
   insertar(n8, n6, true);
   insertar(n9, n3, true);
   insertar(na, n7, true);
   insertar(nb, n7, false);
   insertar(nc, n8, true);
   insertar(nd, n8, false); 
   insertar(ne, n9, true);
   insertar(nf, n9, false); 
   }
    
   public void generarArbol2(){
    Nodo n1 = new Nodo("Reproduccion por esporas");
    setpRoot(n1);
    Nodo n2 = new Nodo("Tallos unidos");
    Nodo n3 = new Nodo("Cola de Caballo");
    insertar(n2, pRoot, true);
    insertar(n3, n2, true);
    Nodo n4 = new Nodo("Flota sobre el agua");
    Nodo n5 = new Nodo("Raices llegan al fondo"); 
    Nodo n6 = new Nodo("Helecho trebol");
    insertar(n4, n2, false);
    insertar(n5, n4, true);
    insertar(n6, n5, true);
    Nodo n7 = new Nodo("Hojas peludas");
    Nodo n8 = new Nodo("Helecho flotante");
    insertar(n7, n5, false);
    insertar(n8, n7, true);
    Nodo n9 = new Nodo("Yerba del agua");
    insertar(n9, n7, false);
    Nodo n10 = new Nodo("Hojas con forma de puas");
    Nodo n11 = new Nodo("Algodoncillo de los pantanos");
    insertar(n10, n4, false);
    insertar(n11, n10, true);
    Nodo n12 = new Nodo("Crece sobre las rocas");
    Nodo n13 = new Nodo("Helecho reviviscente");
    insertar(n12, n10, false);
    insertar(n13, n12, true);
    Nodo n14 = new Nodo("Hojas miden 1 centimetro");
    Nodo n15 = new Nodo("Pinnas cuadrangulares");
    Nodo n16 = new Nodo("Musgo de espiga");
    insertar(n14, n12, false);
    insertar(n15, n14, true);
    insertar(n16, n15, true);
    Nodo n17 = new Nodo("Esporofilos alternantes");
    Nodo n18 = new Nodo("Pino de tierra");
    insertar(n17, n15, false);
    insertar(n18, n17, false);
    Nodo n19 = new Nodo("Musgo abeto o derecho");
    insertar(n19, n17, true);
    Nodo n20 = new Nodo("Enredadera");
    Nodo n21 = new Nodo("Helechos trepadores");
    insertar(n20, n14, false);
    insertar(n21, n20, true);
    Nodo n22 = new Nodo("Esporangio con anulo");
    Nodo n23 = new Nodo("Lengua de serpiente");
    insertar(n22, n20, false);
    insertar(n23, n22, false);
    Nodo n24 = new Nodo("Hojas marrones al madurar las esporas");
    Nodo n25 = new Nodo("Helecho real");
    insertar(n24, n22, true);
    insertar(n25, n24, true);
    Nodo n26 = new Nodo("Soro en el borde de la hoja");
    Nodo n27 = new Nodo("Peciolo con dos divisiones principales");
    Nodo n28 = new Nodo("Helecho alado");
    insertar(n26, n24, false);
    insertar(n27, n26, true);
    insertar(n28, n27, true);
    Nodo n29 = new Nodo("Helecho aguila");
    insertar(n29, n27, false);
    Nodo n30 = new Nodo("Produce semillas a traves de flores");
    Nodo n31 = new Nodo("Semillas en estructura de pinna");
    Nodo n32 = new Nodo("Tejo");
    insertar(n30, pRoot, false);
    insertar(n31, n30, false);
    insertar(n32, n31, false);
    Nodo n33 = new Nodo("Hojas alternantes");
    Nodo n34 = new Nodo("Cipres");
    insertar(n33, n31, true);
    insertar(n34, n33, false);
    Nodo n35 = new Nodo("Pino");
    insertar(n35, n33, true);
    Nodo n36 = new Nodo("Hojas con venas paralelas");
    Nodo n37 = new Nodo("Tallo y hojas bien diferenciadas");
    Nodo n38 = new Nodo("Calas");
    insertar(n36, n30, true);
    insertar(n37, n36, true);
    insertar(n38, n37, false);
    Nodo n39 = new Nodo("Flores reemplazadas por bulbos");
    Nodo n40 = new Nodo("Huele a cebolla o ajo");
    Nodo n41 = new Nodo("Cebollin o ajo falso");
    insertar(n39, n37, true);
    insertar(n40, n39, true);
    insertar(n41, n40, true);
    Nodo n42 = new Nodo("Hojas cilindricas o elipticas");
    Nodo n43 = new Nodo("Junco");
    insertar(n42, n40, false);
    insertar(n43, n42, true);
    Nodo n44 = new Nodo("Planta sumergida acuatica");
    Nodo n45 = new Nodo("Hierba de lago");
    insertar(n44, n42, false);
    insertar(n45, n44, true);
    Nodo n46 = new Nodo("Flores de forma punzante");
    Nodo n47 = new Nodo("Grama");
    insertar(n46, n44, false);
    insertar(n47, n44, true);
    Nodo n48 = new Nodo("Carrizo");
    insertar(n48, n44, false);
    Nodo n49 = new Nodo("Tallo maderoso");
    Nodo n50 = new Nodo("Hojas alternantes");
    Nodo n51 = new Nodo("Parasitarea");
    Nodo n52 = new Nodo("Muerdago");
    insertar(n49, n36, false);
    insertar(n50, n49, true);
    insertar(n51, n50, false);
    insertar(n52, n51, true);
    Nodo n53 = new Nodo("Hojas compuestas");
    Nodo n54 = new Nodo("Frutos con 3 lobulos");
    Nodo n55 = new Nodo("Nuez americana");
    insertar(n53, n51, false);
    insertar(n54, n53, true);
    insertar(n55, n54, true);
    Nodo n56 = new Nodo("Fruto en forma de capsula");
    Nodo n57 = new Nodo("Bejuco o lima");
    insertar(n56, n54, false);
    insertar(n57, n56, true);
    Nodo n58 = new Nodo("Vide trompeta");
    insertar(n58, n56, false);
    Nodo n59 = new Nodo("Tallo con hojas diminutas");
    Nodo n60 = new Nodo("Amaranto o quinoa");
    insertar(n59, n50, false);
    insertar(n60, n59, true);
    Nodo n61 = new Nodo("Hojas opuestas");
    Nodo n62 = new Nodo("Flor de Laponia");
    insertar(n61, n59, false);
    insertar(n62, n61, false);
    Nodo n63 = new Nodo("Hojas con escamas blancas o marrones");
    Nodo n64 = new Nodo("Rosal");
    insertar(n63, n61, true);
    insertar(n64, n63, true);
    Nodo n65 = new Nodo("Manzanilla");
    insertar(n65, n49, false);
   }
   
   public Nodo hijo_izq(Nodo aux){
    return aux.getHijo_izq();
    }
    
    public Nodo hijo_der(Nodo aux){
    return aux.getHijo_der();
    }
    
    public void recorrer(Nodo pRoot){
    if(getpRoot()!=null){
    System.out.print(pRoot);
    recorrer(hijo_izq(pRoot));
    recorrer(hijo_der(pRoot));
    
    }
    }
    
    public boolean isEmpty(){
        return getpRoot() == null;
    }
    
    public static void main(String[] args){
    BinTree arbol = new BinTree();
    arbol.generarArbol1();
    System.out.print(arbol.getpRoot().getHijo_der().getHijo_der().getInfo());
    arbol.recorrer(arbol.getpRoot());
    
    }
}
