/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author jeancarlos
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int N =0;
        
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("digite el número");
        N=teclado.nextInt();
        

       System.out.println("Valor inicial de N = " + N);
        N+=77;
        System.out.println("N + 77 = " + N);
        N-=3;
        System.out.println("N - 3 = " + N);
        N*=2;
        System.out.println("N * 2 = " + N);
        
        
        
    }
    
}
