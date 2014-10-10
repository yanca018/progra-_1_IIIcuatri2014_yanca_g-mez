/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma;
import java.util.Scanner;
/**
 *
 * @author Yanca
 */
public class Ma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int año=0;
        int mes=1;
        int opcion=0;
        char continuar;
        boolean validar=true;
        
             Scanner oScanner =new Scanner(System.in);

        
        
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
       
            
            
            opcion=oScanner.nextInt();
            
        
           switch (opcion) {
                   
                   
                   case 1:
                       
                       
                       
                       System.out.println("digite el numero para el mes de enero");
                       oScanner = new Scanner(System.in);
                      
                       break;
                       
                       
                   case 2:
                       
                       
                       
                       System.out.println("digite el numero para el mes de febrero");
                       oScanner = new Scanner(System.in);
                       mes = Integer.parseInt(oScanner.nextLine());
                       break;
                       
                       
                   case 3:
                       
                       
                         
                       System.out.println("digite el numero para el mes de marzo");
                       oScanner = new Scanner(System.in);
                       mes = Integer.parseInt(oScanner.nextLine());
                       break;
                       
                   case 4:
                         
                       System.out.println("digite el numero para el mes de abril");
                       oScanner = new Scanner(System.in);
                       mes = Integer.parseInt(oScanner.nextLine());
                       break;
                       
                   case 5:
                       
                        System.out.println("digite el numero para el mes de mayo");
                       oScanner = new Scanner(System.in);
                       mes = Integer.parseInt(oScanner.nextLine());
                       break;
                    
                       
                   case 6:
                       
                       
                System.out.println("digite el numero para el mes de junio");
                       oScanner = new Scanner(System.in);
                       mes = Integer.parseInt(oScanner.nextLine());
                       break;
               
               
                   case 7:
                       
                         System.out.println("digite el numero para el mes de julio");
                       oScanner = new Scanner(System.in);
                       mes = Integer.parseInt(oScanner.nextLine());
                       break;
                       
                   case 8:
                       
                         System.out.println("digite el numero para el mes de agosto");
                       oScanner = new Scanner(System.in);
                       mes = Integer.parseInt(oScanner.nextLine());
                       break;
               
                   case 9:
                       
                         System.out.println("digite el numero para el mes de setiembre");
                       oScanner = new Scanner(System.in);
                       mes = Integer.parseInt(oScanner.nextLine());
                       break;
                       
                       
                   case 10:
                       
                         System.out.println("digite el numero para el mes de octubre");
                       oScanner = new Scanner(System.in);
                       mes = Integer.parseInt(oScanner.nextLine());
                       break;
               
                   case 11:
                       
                       
                       
                         System.out.println("digite el numero para el mes de noviembre");
                       oScanner = new Scanner(System.in);
                       mes = Integer.parseInt(oScanner.nextLine());
                       break;
               
               
                   case 12:
                       
                       
                         System.out.println("digite el numero para el mes de diciembre");
                       oScanner = new Scanner(System.in);
                       mes = Integer.parseInt(oScanner.nextLine());
                       break;
                       
                       
                       
                        default:
                    break;
                    
               }
        System.out.println("desea continuar con otra operacion S/N");
            continuar =oScanner.nextLine().charAt(0);
            if((continuar=='S')||(continuar=='S')){
            validar=true;
            
            
            }else{
             validar=false;
            
            }
               
       
       
       }while (opcion==12);
       
       
    }
    
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }while(opcion==7);
        
        
        
    }
    
}
