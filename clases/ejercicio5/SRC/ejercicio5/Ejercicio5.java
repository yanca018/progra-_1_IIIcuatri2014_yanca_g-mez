/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author jeancarlos
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        int A =0;
        
        
     Scanner teclado = new Scanner(System.in);
     
        System.out.println("digite el numero");
        A=teclado.nextInt();
        
        if(A%2==0){
            
            System.out.println("es par");   
            
        }else{
        
            System.out.println("es impar" );
        
        
        }
    
    }
            
            
}