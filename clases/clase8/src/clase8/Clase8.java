/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class Clase8 {

    private static Object oejercicio1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int op = 0;

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("digite 8 elementos");
            System.out.println("1. el valor acumulado");
            System.out.println("2. elemento mayor a 36");
            System.out.println("3. el valor mayor a 50");
            System.out.println("4. salir");
            op = teclado.nextInt();
            ejercicio1 oejercicio1;

            switch (op) {

                case 1:

                    oejercicio1 = new ejercicio1();
                    for (int i = 0; i < 8; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("digite el numero #" + (i + 1));
                        oejercicio1.valoracum(teclado.nextDouble());

                    }
                    // System.out.println(oejercicio1.sumaelementos(op));
                    break;

                case 2:

                    oejercicio1 = new ejercicio1();
                    for (int i = 0; i < 8; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("suma de todos  los elementos #" + (i + 1));
                        oejercicio1. sumaelementos(teclado.nextDouble());

                        
                    }
                    System.out.println(oejercicio1.Numero36());
                    break;

            }

        } while (op == 4);

    }

}
