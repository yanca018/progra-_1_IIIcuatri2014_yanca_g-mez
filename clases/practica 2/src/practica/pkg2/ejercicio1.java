/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.pkg2;
import java.util.Scanner;
/**
 *
 * @author Yanca
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
    //problema 1
    public static void main(String[] args) {
        int N =0;
        double A=0;
        char C= ' ' ;
        double suma;
        double resta;
         Scanner teclado = new Scanner (System.in);
       
         
        System.out.println("digite el valor de N");
         teclado=new Scanner(System.in);
        N= teclado.nextInt();
       
         System.out.println("digite el valor A");
         teclado=new Scanner(System.in);
         A= Double.parseDouble(teclado.nextLine());
          
             
         System.out.println("digite el valor de C");
            teclado=new Scanner(System.in);
            C= teclado.nextLine().charAt(0);
         
         
        
             suma = N+A ;
        
         System.out.println("la suma de N+A  es"+ suma);
         
         resta = A-N;
         
          System.out.println("la resta de A-N  es"+ resta);
         
         System.out.println(C);
        
    }
   
        
        
        
    
    
    
    }
    

