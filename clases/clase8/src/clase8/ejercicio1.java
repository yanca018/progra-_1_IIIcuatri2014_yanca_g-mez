/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase8;

/**
 *
 * @author Yanca
 */
public class ejercicio1 {
    
    double [] vector = new double [8];
    
    
     public void valoracum(double valor)
    {
    
    for(  int i =0; i< vector.length; i++)
    {
    if(vector [i]==0){
    {
    
    vector[i]= valor;
    }
    break;
    
       
    
}
    }   

    }

   public void sumaelementos(double suma){
    double elementos= 0;
    
  for(  int i =0; i< vector.length; i++)
  { 
elementos = elementos + vector[i];
  
  } 
    System.out.println("la suma de los elementos es =" + elementos);
        
    

}
 public String Numero36() {
        String dato = " ";
        double numero = 0;
        for (int i = 0; i < vector.length; i++) {
            numero+=vector[i];
            dato+= " "+ vector[i];
            if (numero >= 36) {
              
            }
        }
         return dato;
 }
}