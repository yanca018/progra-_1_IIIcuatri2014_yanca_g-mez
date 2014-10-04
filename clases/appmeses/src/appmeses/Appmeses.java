/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appmeses;
import java.util.Scanner;
/**
 *
 * @author Yanca
 */
public class Appmeses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        int num=1;
        int op=0;
        char continuar;
        boolean validar=true;
       Scanner teclado = new Scanner(System.in);
       
      
       
       clsmeses aclsmeses = new clsmeses();
       
       
       do{
       
       
       
        System.out.println("digite los meses");
            System.out.println("1. Enero");
            System.out.println("2. febrero");
            System.out.println("3. marzo");
            System.out.println("4. abril");
            System.out.println("5. mayo");
            System.out.println("6. junio");
            System.out.println("7. julio");
            System.out.println("8. agosto");
            System.out.println("9. setiembre");
            System.out.println("10. octubre");
            System.out.println("11. noviembre");
            System.out.println("12. diciembre");
       
             op = Integer.parseInt(teclado.nextLine());
            
            
               switch (op) {
                   
                   
                   case 1:
                       
                       
                       
                       System.out.println("digite el numero para el mes de enero");
                       teclado = new Scanner(System.in);
                      
                       break;
                       
                       
                   case 2:
                       
                       
                       
                       System.out.println("digite el numero para el mes de febrero");
                       teclado = new Scanner(System.in);
                       num = Integer.parseInt(teclado.nextLine());
                       break;
                       
                       
                   case 3:
                       
                       
                         
                       System.out.println("digite el numero para el mes de marzo");
                       teclado = new Scanner(System.in);
                       num = Integer.parseInt(teclado.nextLine());
                       break;
                       
                   case 4:
                         
                       System.out.println("digite el numero para el mes de abril");
                       teclado = new Scanner(System.in);
                       num = Integer.parseInt(teclado.nextLine());
                       break;
                       
                   case 5:
                       
                        System.out.println("digite el numero para el mes de mayo");
                       teclado = new Scanner(System.in);
                       num = Integer.parseInt(teclado.nextLine());
                       break;
                    
                       
                   case 6:
                       
                       
                System.out.println("digite el numero para el mes de junio");
                       teclado = new Scanner(System.in);
                       num = Integer.parseInt(teclado.nextLine());
                       break;
               
               
                   case 7:
                       
                         System.out.println("digite el numero para el mes de julio");
                       teclado = new Scanner(System.in);
                       num = Integer.parseInt(teclado.nextLine());
                       break;
                       
                   case 8:
                       
                         System.out.println("digite el numero para el mes de agosto");
                       teclado = new Scanner(System.in);
                       num = Integer.parseInt(teclado.nextLine());
                       break;
               
                   case 9:
                       
                         System.out.println("digite el numero para el mes de setiembre");
                       teclado = new Scanner(System.in);
                       num = Integer.parseInt(teclado.nextLine());
                       break;
                       
                       
                   case 10:
                       
                         System.out.println("digite el numero para el mes de octubre");
                       teclado = new Scanner(System.in);
                       num = Integer.parseInt(teclado.nextLine());
                       break;
               
                   case 11:
                       
                       
                       
                         System.out.println("digite el numero para el mes de noviembre");
                       teclado = new Scanner(System.in);
                       num = Integer.parseInt(teclado.nextLine());
                       break;
               
               
                   case 12:
                       
                       
                         System.out.println("digite el numero para el mes de diciembre");
                       teclado = new Scanner(System.in);
                       num = Integer.parseInt(teclado.nextLine());
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
               
       
       
       }while (op==12);
       
       
    }
    
}
