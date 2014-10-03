/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int X ;
        int Y ;
        
        double M=0;
        double N=0;
        double sumaXy;
        double sumanNM;
        double restaXY;
        double restaMN;
        double multiXY;
        double multiMn;
        double divisionXY;
        double divisionMN;
        
        
          Scanner teclado = new Scanner (System.in);
          
        System.out.println("digite X");
        teclado =new Scanner(System.in);
          X= teclado.nextInt();
          
          
          
          System.out.println("digite Y");
           teclado=new Scanner(System.in);
           Y= teclado.nextInt();
        
           System.out.println("digite M");
           teclado=new Scanner(System.in);
           M= Double.parseDouble(teclado.nextLine());
           
           System.out.println("digite N");
            teclado=new Scanner(System.in);
            N= Double.parseDouble(teclado.nextLine());
           
            
            sumaXy= X+Y;
            
             System.out.println("la suma de X+Y  es"+ sumaXy);
             
             sumanNM=M+N;
            
            System.out.println("la suma de M+N  es"+ sumanNM);
            
            restaMN=M-N;
             System.out.println("la resta de M-N  es"+ restaMN);
             
             restaXY=X-Y;
             System.out.println("la resta de X-Y  es"+ restaXY);
             
             multiMn= M*N;
              System.out.println("la multiplicacion de M*N  es"+ multiMn);
              
              multiXY= X*Y;
              System.out.println("la multiplicaion de X*Y  es"+ multiXY);
              
              divisionXY= X/Y;
              
              System.out.println("la division de X/Y  es"+divisionXY );
              
              divisionMN=M/N;
              System.out.println("la division de M/N  es"+divisionMN );
              
    }
    
}
