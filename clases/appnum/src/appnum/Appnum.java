/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appnum;
import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class Appnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num=0;
        int op=0;
        int valor1=0;
        int valor2=0;
        
        double resultado;
        char continuar;
        boolean validar=true;
        
        Scanner teclado = new Scanner(System.in);
        
        clsnum aclsnum = new clsnum();
        
        do{
             
            System.out.println("digite el numero");
            System.out.println("1_2,5,8 cuadrado");
            System.out.println("2_ 4,7,9 multiplicación");
            
            op = Integer.parseInt(teclado.nextLine());
            
            
       
            switch(op){
                
                
                case 1 :
                    
                    
                        System.out.println("digite el valor del primero");
                       teclado = new Scanner(System.in);
                        valor1= Integer.parseInt(teclado.nextLine());
                        System.out.println("digite el valor del segundo numero ");
                        teclado= new Scanner(System.in);
                        valor2= Integer.parseInt(teclado.nextLine());
                        resultado = aclsnum.numero(valor1, valor2);
                        System.out.println(resultado);
                       break;
            
                case 2:
                    
                    System.out.println("numero multiplicado");
                    teclado= new Scanner(System.in);
                    valor1=Integer.parseInt(teclado.nextLine());
                    resultado=aclsnum.numeromulti(valor1);
                    System.out.println(resultado);
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
