/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class CLASE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //ciclofor
        int cantidad;
        int suma = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("digite el # de impresiones que desea ver");

        cantidad = Integer.parseInt(teclado.nextLine());

        System.out.println("\n");

        for (int i = 0; i < cantidad; i++) {

            System.out.println(i);

        }

        System.out.println("\n");
        System.out.println("inverso");
        System.out.println("\n");
        for (int i = cantidad; i > cantidad; i--) {

            System.out.println(i);

        }
        
        
       // ciclo while 
        
        while (suma<=cantidad){
            System.out.print(suma);
            System.out.print("-");
            suma=suma+1;
        
        
        
        }
        
        System.out.print("\n");
        suma=cantidad;
        
        while(suma>=0){
        
        
        
         System.out.print("suma");
          System.out.print("-");
            suma=suma-1;
    }
        
        System.out.print("\n");
        
        suma=0;
        
        do{
            System.out.print("suma");
            System.out.print("-");
            suma=suma+1;
        
        } while(suma<=cantidad);
        System.out.print("\n");
        suma=cantidad;
        
        
        do{
        
          System.out.print("suma");
          System.out.print("-");
            suma=suma-1;
        
        }while(suma>=0);
        
        
}
}
