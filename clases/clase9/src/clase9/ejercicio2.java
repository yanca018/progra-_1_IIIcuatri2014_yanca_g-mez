/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase9;

import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class ejercicio2 {
    
    
     private int[][] matriz;
     
      public void crearmatriz(int fila, int columnas) {
        matriz = new int[fila][columnas];
    }
      
       public void cargarmatriz() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite el numero de filas");
        int filas = teclado.nextInt();
        System.out.println("digite el numero de columnas");
        int columnas = teclado.nextInt();
        matriz = new  int[filas][columnas];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                matriz[i][j] = teclado.nextInt();
            }

        }

    }
       public String Imprimir() {
        String impresion = " ";
        for (int i = 0; i < matriz.length; i++) {
           
            for (int j = 0; j < matriz[0].length; j++) {
                impresion += matriz[i][j] + " ";
            }
            impresion += "\n";
        }
        return impresion;
    }
         public void intercambiar() {

        for (int j = 0; j < matriz.length; j++) {
            for (int c = 0; c < matriz[0].length; c++) {
                int auxiliar = matriz[0][c];
                matriz[0][c] = matriz[1][c];
                matriz[1][c] = auxiliar;

            }
        }
        }
}




