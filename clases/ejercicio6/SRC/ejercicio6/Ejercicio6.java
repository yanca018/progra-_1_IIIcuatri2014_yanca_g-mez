/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio6;
import java.util.Scanner;

/**
 *
 * @author jeancarlos
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int B=0;
        
      Scanner teclado = new Scanner(System.in);
      
      
        System.out.println("digite el numero");
        B=teclado.nextInt();
        
        if(B>0  || B==0){
            
            
            System.out.println("es positivo");
        
        
            }else{
            
            System.out.println("es negativo");
        
    }
}
}




