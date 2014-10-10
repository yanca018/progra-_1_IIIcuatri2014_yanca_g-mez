/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglo;
import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        float array [] = new float [5];
        float nota;
        
        
        for (int x=0; x<=4; x++){
            System.out.println("ingrese la nota");
         nota = teclado.nextFloat();
         
         if(nota > 3.0 && nota<=5){
         
         array [x]= nota;
         
             System.out.println("posicion"+ x+ ":"+ array);
         
         
         }else{
         
             System.out.println("posicion"+ x+ ":"+ "no paso");
         
         }
          
                System.out.println(array[x]);
                 
                 
                 
                 
          
                
          }
        
         
            
        
        
        }
        
        
    }
    
}
