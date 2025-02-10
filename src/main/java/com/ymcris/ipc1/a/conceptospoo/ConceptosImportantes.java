package com.ymcris.ipc1.a.conceptospoo;

/**
 *
 * @author YmCris
 */
public class ConceptosImportantes {
    
    
    public static void main(String[] args) {
        ConceptosImportantes conceptos = new ConceptosImportantes();
        System.out.println("Hello world");
        conceptos.crearObjetos();
    }
    
    private void crearObjetos(){
        System.out.println("Hola mundo, como estan");
        System.out.println("Para crear un objeto, debo de realizar:");
        System.out.println("'Nombre de la clase'+' nombre del objeto'+' ='+' new'+' nombre de la clase'+'();'");
    }
}
