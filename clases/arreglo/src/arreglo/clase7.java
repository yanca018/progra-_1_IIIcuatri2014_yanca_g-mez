/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglo;
import java.util.Scanner;

/**
 *
 * @author Yanca
 */
public class clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int op=0;
      
       Scanner teclado = new Scanner (System.in);
       
       do{
       
           System.out.println("digite la opcion del ejercicio a evaluar");
           System.out.println("1. ejercicio 1");
           System.out.println("2. ejercicio 2");
           System.out.println("3. ejercicio 3");
           System.out.println("4. salir");
           op=teclado.nextInt();
           
          switch(op){
          
              case 1 :
                  
                  ejercicio1 oejercicio1 = new ejercicio1();
                  
                  for(int i=0; i<5; i++){
                  teclado = new Scanner(System.in);
                   System.out.println("digite el salario del trabajador #"+(i+1) );
                   oejercicio1.AgregarSalario(teclado.nextDouble());
                   
                 
                  
                  }
                  
                  System.out.println(oejercicio1.ImprimirSueldos());
                  break;
          
              case 2:
                  
                  
                  ejercicio2 oejercicio2= new ejercicio2();
                  for (int i = 0; i<5; i++){
                   teclado = new Scanner(System.in);
                 System.out.println("digite el salario del trabajador #"+(i+1) );
                 oejercicio2.AgregarAltura(teclado.nextFloat());
                 
                 
                 
                   
                  
                  
                  }
                  
          
                  System.out.println("el promedio es :" + oejercicio2.Promedio());
                  System.out.println(oejercicio2.contarpersonas());
                  break;
          
                  
                  
                   case 3:
                       
                       ejercicio3 oEjercicio3=new ejercicio3(); 
                                for (int i = 0; i < 4; i++) {
                                    teclado =new Scanner(System.in);
                        System.out.println("Digite el salario del trabajador de la mañana #" + (i+1));
                        oEjercicio3.AgregarSalarioTarde(teclado.nextDouble());
                    }
                    for (int i = 0; i < 4; i++) {
                         
                        System.out.println("Digite el salario del trabajador de la tarde #"+(i+1));
                          teclado =new Scanner(System.in);
                        oEjercicio3.AgregarSalarioTarde(teclado.nextDouble());
                        
                    }
                    System.out.println(ejercicio3.Imprimirgastos());
                    break;
          }
          
          
         
        
       
       
       
       
       }while(op==4);
        
        
       
                 
                 
                 
          
                
          }
        
         
            
        
        
        }
        
        
    
    

