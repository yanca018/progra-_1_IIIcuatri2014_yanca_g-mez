/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diamesaño;
import java.util.Scanner;
/**
 *
 * @author jeancarlos
 */
public class Diamesaño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
            
     Scanner in = new Scanner(System.in);
        int mes,anho;
        System.out.print("Ingrese el numero de mes (1-12) :");
        mes=in.nextInt();
        System.out.print("Ingrese el año :");
        anho=in.nextInt();
 
 
        switch(mes)
        {
           case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                System.out.println("El mes tiene 31 dias ");break;
           case 4:case 6:case 9:case 11:
                System.out.println("El mes tiene 30 dias ");break;
           case 2:
                if((anho%4==0 && anho%100!=0) || anho%400==0)
                System.out.println("El mes tiene 29 dias ");
                else
                   System.out.println("El mes tiene 28 dias ");break;
           default:
                System.out.println("fuera");break;
        }
    }
}
            
                
                
        
    


    
    

