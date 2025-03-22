/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clave_dicotomica;

/**
 *
 * @author zarna
 * 
 */
public class ArbolBDecision {
    private Nodo root;
    private int iN;

    public int getiN() {
        return iN;
    }

    public void setiN(int iN) {
        this.iN = iN;
    }

    public ArbolBDecision(Nodo info) {
        this.root = info;
        this.iN = 0;
    }
    

    public Nodo getRoot() {
        return root;
    }

    public void setpRoot(Nodo info) {
        this.root = info;
    }
    
    public boolean isEmpty(){
        return getRoot() == null;
    }
    
    public boolean isHoja(Nodo nodo){
        return nodo.getHijo_izq() == null && nodo.getHijo_der()==null;
    
    }
    
    public void insertar(String opcion){
        if(!isEmpty()){
            Nodo aux = getRoot();
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
    
    public void recorrer(Nodo info){
        if(getRoot() != null){
            System.out.print(getRoot().getInfo());
            recorrer(getRoot().getHijo_izq());
            recorrer(getRoot().getHijo_der());
        }
    }   
}
