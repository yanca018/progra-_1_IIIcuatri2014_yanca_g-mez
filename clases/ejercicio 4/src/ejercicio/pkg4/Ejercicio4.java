/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        int A=0;
        int B=0;
        int C=0;
        int D=0;
        
         Scanner teclado = new Scanner (System.in);
         
         
         System.out.println("digite el valor de B");
        teclado =new Scanner(System.in);
        B=teclado.nextInt();
        
        
        System.out.println("digite el valor de C");
        teclado =new Scanner(System.in);
        C=teclado.nextInt();
        
        
        System.out.println("Digite el valor de A");
        teclado= new Scanner(System.in);
        A=teclado.nextInt();
        
        System.out.println("digite el valor de D");
        teclado=new Scanner(System.in);
        D=teclado.nextInt();
        
        System.out.println("valores");
        
        B=C;
        System.out.println("el valor de B" +C);
        
        
        C=A;
        System.out.println("el valor de C" +A);
        
        A=D;
        System.out.println("el valor de A" +D);
        
        D=B;
        System.out.println("el valor de D" +B);
          
        
        
    }
    
}
