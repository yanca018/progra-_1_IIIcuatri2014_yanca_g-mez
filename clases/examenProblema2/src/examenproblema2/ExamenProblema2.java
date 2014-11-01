/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenproblema2;
import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class ExamenProblema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        Scanner oScanner =new Scanner(System.in);
        
        
        
            int monedas[]={20000,10000,5000,2000,
                        1000, 500, 100, 50,
                        10, 5, 1}; 
        int desglose[];
        desglose = new int[11];
        
        int i;
        int n = 8000;
        
        
        
        System.out.println("digite la cantidad");
        for(i = 0; i<= 10; i++) {
            desglose[i] = 0;
            desglose[i] = n / monedas[i]; 
            n = n - (desglose[i] * monedas[i]);
        }
       
        for (i=0; i<= 10; i ++) {
            if (desglose[i] != 0) {
                System.out.print(monedas[i]);
                System.out.print(" = ");
                System.out.println(desglose[i]);
            }
        }
        
    }
}
    

