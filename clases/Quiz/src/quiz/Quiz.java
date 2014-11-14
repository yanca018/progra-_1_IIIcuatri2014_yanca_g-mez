/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;
import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        String palabra1;
        String palabra2;
        String palabra3;
        String palabra4;
        String palabra5;
        
         System.out.print("Ingrese las palabras:");
         System.out.println("digite la palabra1");
        palabra1=teclado.nextLine();
        System.out.println("digite la palabra2");
        palabra2=teclado.nextLine();
        System.out.println("digite la palabra3");
        palabra3=teclado.nextLine();
        System.out.println("digite la palabra4");
        palabra4=teclado.nextLine();
        System.out.println("digite la palabra5");
        palabra5=teclado.nextLine();
        
        
        
        
        System.out.println(palabra1+ " convertido a mayúsculas es "+palabra1.toUpperCase());
        System.out.println(palabra1+ " convertido a minúsculas es "+palabra1.toLowerCase());
        System.out.println(palabra2+ " convertido a mayúsculas es "+palabra2.toUpperCase());
        System.out.println(palabra2+ " convertido a minúsculas es "+palabra2.toLowerCase());
        
    }

    }
    

