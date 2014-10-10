/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calse6;
import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class Calse6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int opcion=0;
        
       Scanner oScanner =new Scanner(System.in);
        
        
        
        do{
            
            System.out.println("digite la opcion que desea : ");
            System.out.println("1. ejercicio 1 ");
            System.out.println("2. ejercicio 2 ");
            opcion=oScanner.nextInt();
            
            
            
            switch(opcion){
               
               
               
                case 1:
                    
                    
                    
                    System.out.println("digite el correo a evaluar");
                    oScanner= new Scanner(System.in);
                    ejercicio1 oejercicio1= new ejercicio1(oScanner.nextLine());
                    System.out.println(oejercicio1.validarCorreo());
                    break;
               
               
                case 2:
                    
                    System.out.println("digite la cadena a eveluar");
                    ejercicio2 oejercicio2= new ejercicio2();
                    oScanner= new Scanner(System.in);
                    oejercicio2.setCadena(oScanner.nextLine());
                    System.out.println(oejercicio2.mediaCadena());
                    System.out.println(oejercicio2.ultimovalor());
                    System.out.println(oejercicio2.Alrevez());
                    System.out.println(oejercicio2.guion());
                    System.out.println(oejercicio2.vocales());
                    System.out.println(oejercicio2.palindromo());
                    break;
                    
               
               
               
               }
        
        
        }while(opcion<=7);
        
    }
    
}
