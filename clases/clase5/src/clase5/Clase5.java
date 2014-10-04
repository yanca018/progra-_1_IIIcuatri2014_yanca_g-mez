/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean validar = true;
        int valor1 = 0;
        int valor2 = 0;
        double resultado;
        char continuar;
        int opcion = 0;

        Scanner teclado = new Scanner(System.in);

        operaciones Aoperaciones = new operaciones();

        do {

            System.out.println("digite la operacion a evaluar");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. Division");
            System.out.println("4. Multiplicacion");
            System.out.println("5. Raiz");
            System.out.println("6. potencia");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {

                case 1:

                    System.out.println("digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = Aoperaciones.sumar(valor1, valor2);
                    System.out.println(resultado);
                    break;

                case 2:

                    System.out.println("digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = Aoperaciones.Resta(valor1, valor2);
                    System.out.println(resultado);
                    break;

                case 3:
                    System.out.println("digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = Aoperaciones.division(valor1, valor2);
                    System.out.println(resultado);
                    break;

                case 4:
                    System.out.println("digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = Aoperaciones.muliplicacion(valor1, valor2);
                    System.out.println(resultado);
                    break;

                case 5:

                    System.out.println("digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    resultado = Aoperaciones.raiz(valor1);
                    System.out.println(resultado);

                case 6:

                    System.out.println("digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = Aoperaciones.potencia(valor1, valor2);
                    System.out.println(resultado);
                    break;

                default:
                    break;
                    
                    
                    

            }
            
            System.out.println("desea continuar con otra operacion S/N");
            continuar =teclado.nextLine().charAt(0);
            if((continuar=='S')||(continuar=='S')){
            validar=true;
            
            
            }else{
             validar=false;
            
            }

        } while (validar);
    }
}
