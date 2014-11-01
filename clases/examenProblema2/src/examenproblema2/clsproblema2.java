/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenproblema2;

/**
 *
 * @author Yanca
 */
public class clsproblema2 {
    
     public static void main(String[] args) {
        int monedas[]={10000,5000,2000,
                        1000, 500, 100, 50,
                        10, 5, 1}; 
        
        
        int desglosebilletes[];
        desglosebilletes = new int[11];
        
        int j;
        int n = 5000;
        
        
       
        for(j = 0; j<= 10; j++) {
            desglosebilletes[j] = 0;
            desglosebilletes[j] = n / monedas[j]; 
            n = n - (desglosebilletes[j] * monedas[j]);
        }
       
        
        
        
        for (j=0; j<= 10; j ++) {
            if (desglosebilletes[j] != 0) {
                System.out.print(monedas[j]);
                System.out.print(" = ");
                System.out.println(desglosebilletes[j]);
            }
        }
        
    }
}
       
       
       
    
    
    
    

