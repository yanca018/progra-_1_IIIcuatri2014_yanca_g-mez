/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase10;

/**
 *
 * @author Yanca
 */
public class Clase10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        seleccion oseleccion = new seleccion();
        
        int [] arreglito = {8,5,2,6,0};
        
         int [] temporal = oseleccion.seleccion(arreglito, "A");
         for(int i =0; i<temporal.length; i++){
         System.out.println(temporal[i]);
        
    }
        System.out.println();
        
        ordenamientoburbuja ordenamientoburbuja = new ordenamientoburbuja();
        ordenamientoburbuja.ordenamientoB(arreglito, "A");
        
        insercion oinsercion = new insercion();
        insercion.ordenacionInsercion(arreglito, "A");
}
    
    
    
}