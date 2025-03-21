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
public class BinTree<T> {
    private Nodo pRoot;
    private int iN;

    public int getiN() {
        return iN;
    }

    public void setiN(int iN) {
        this.iN = iN;
    }

    public BinTree(Nodo pRoot) {
        this.pRoot = pRoot;
        this.iN = 0;
    }
    

    public Nodo getpRoot() {
        return pRoot;
    }

    public void setpRoot(Nodo pRoot) {
        this.pRoot = pRoot;
    }
    
    public void insertar(String opcion){
    if(!isEmpty()){
        Nodo aux = getpRoot();
        while(aux!=null){
        if(aux.isEsVerdad()){
            aux = aux.getHijo_der();
        }else{
            aux = aux.getHijo_der();
        }
        }
        if(aux.isEsVerdad()){
        aux.setHijo_der(new Nodo(opcion));
        }else{
        aux.setHijo_izq(new Nodo(opcion));
        }
    }else{
        setpRoot(new Nodo(opcion));
    }
    
    }
    
    
    
    public void recorrer(Nodo pRoot){
    if(getpRoot()!=null){
    System.out.print(getpRoot().getInfo());
    recorrer(getpRoot().getHijo_izq());
    recorrer(getpRoot().getHijo_der());
    
    }
    }
    
    public boolean isEmpty(){
        return getpRoot() == null;
    }
    
    
}
