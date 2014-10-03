/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio7;
import java.util.Scanner;

/**
 *
 * @author jeancarlos
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int C=0;
        
        
        Scanner teclado = new Scanner (System.in);
        
        
        
        
        System.out.println("digite el número");
        C=teclado.nextInt();
        
        
        
        if(C>0 ||C==0 ){
        
            System.out.println("positivo" );
         
        }else{
        
            System.out.println("negativo" );
        
        }
        
        if(C%2==0){
        
            System.out.println("es par" );
        
        }else{
        
            System.out.println("es impar");
        
        }
        
       if(C%5==0){
           
           System.out.println("es multiplo de 5");
       
       }else{
       
           System.out.println("no es multiplo");
       
       }
            
       if(C%10==0){
       
           System.out.println("es multiplo de 10");
      
       }else{
       
           System.out.println("no es multiplo ");
       
       }
       
       if(C>100){
       
          System.out.println("es mayor a 100" );
       
       
       }else{
       
           System.out.println("es menor a 100" );
       
       }
            
    }
    
}
