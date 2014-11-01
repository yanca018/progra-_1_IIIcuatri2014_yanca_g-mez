/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrices;

/**
 *
 * @author Yanca
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio1 oEjercicio1=new Ejercicio1();
        oEjercicio1.CrearMatriz(3, 5);
        oEjercicio1.CargarMatriz();
        System.out.print(oEjercicio1.Imprimir());
        
        Ejercicio2 oEjercicio2=new Ejercicio2();
        oEjercicio2.CrearMatriz(4, 4);
        oEjercicio2.CargarMatriz();
        System.out.print(oEjercicio2.Imprimir());
    }
    
    }
    

