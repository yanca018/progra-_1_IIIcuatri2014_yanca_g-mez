/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.pkg1;

import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double horastrabajadas=0;
        double costohora=0;
        double salario=0;
        
        Scanner teclado =new Scanner(System.in);
        
        System.out.println("digite las horas laboradas por el trabajador"+"\n");
        
        horastrabajadas =Double.parseDouble(teclado.nextLine());
        
        System.out.println("digite las horas acumladas "+"\n");
        
        costohora =Double.parseDouble(teclado.nextLine());
        
        salario=horastrabajadas*costohora;
        
        
         System.out.println("el salrio final es" + salario);
         
         
         
         
         //ciclos
        
        
        
    }
    
}
