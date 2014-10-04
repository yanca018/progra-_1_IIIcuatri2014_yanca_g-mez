/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appletra;
import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class Appletra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       int A;
        int B;
        int C;
        int D;
        int E;
       char continuar;
        int opcion = 0;
         boolean validar = true;
        
        
        Scanner teclado= new Scanner(System.in);
        
        
        clsletra aclsletra= new clsletra();
        
        
        do{
            
            System.out.println("digite la letra");
            System.out.println(" letra A");
            System.out.println(" letra B");
            System.out.println(" letra C");
            System.out.println(" letra D");
            System.out.println(" letra E");
        
            opcion = Integer.parseInt(teclado.nextLine());       

            
        
        
         switch(opcion){
             
             
             
             case 1:
                 
                 
                       System.out.println("excelente");
                    
                       teclado = new Scanner(System.in);
                       
              
                       
                       break;
                       
         
         
             case 2 :
                 
                 
                 System.out.println("bueno");
                       teclado = new Scanner(System.in);
                     
            
             case 3:
                 
                  System.out.println("regular");
                       teclado = new Scanner(System.in);
                     
         
         
         
             case 4:
                  System.out.println("malo");
                       teclado = new Scanner(System.in);
                      
                 
                 
                 
             case 5:
                 System.out.println("pesimo");
                       teclado = new Scanner(System.in);
                      
          
                 
             default:
                 break;
         
         }
        
        System.out.println("desea continuar con otra operacion S/N");
            continuar =teclado.nextLine().charAt(0);
            if((continuar=='S')||(continuar=='S')){
            validar=true;
            
            
            }else{
             validar=false;
            
            }

        } while (validar);
    }
}
