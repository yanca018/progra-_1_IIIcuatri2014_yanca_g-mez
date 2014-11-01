/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase9;

/**
 *
 * @author Yanca
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    
        ejercicio1 oejercicio1 = new ejercicio1();
        oejercicio1.crearmatriz(2, 5);
        oejercicio1.cargarmatriz();
        System.out.print(oejercicio1.Imprimir());
        
        ejercicio2 oejercicio2 = new ejercicio2();
        oejercicio2.crearmatriz(2,5);
        oejercicio2.cargarmatriz();
        System.out.println(oejercicio2.Imprimir());
        
        
        
        

    }

}
