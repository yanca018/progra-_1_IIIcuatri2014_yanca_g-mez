/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglo;

/**
 *
 * @author Yanca
 */
public class ejercicio2 {
    
    private float alturas[] = new float[5];
    
    public void AgregarAltura(float altura){
    
      for(  int i =0; i< alturas.length; i++){
      
      if(alturas[i]==0){
      
      alturas[i]=altura;
      break;  
      
      
      }
      
      
      }
    
    
    }
    public float Promedio(){
    
    float sumaPromedio=0;
    float promedio=0;
    
     for(  int i =0; i< alturas.length; i++){
     sumaPromedio+=alturas[i];
     
     
     
     }
     promedio=sumaPromedio/alturas.length;
     
     return promedio;
     
    }
    
    public String contarpersonas(){
    
     String personasbajas="";
     String personasaltas="";
     String retorno="";
     float Promedio=this.Promedio();
     
     
      for(  int i =0; i< alturas.length; i++){
      
      if (alturas[i]>Promedio){
      
      personasaltas+="la persona #" +(i+1) + "es alta" + "\n";
      
      }else{
       
       personasbajas+="la persona #" +(i+1) + "es baja" + "\n";   
      
      
      }
      
      retorno=personasaltas + "\n" +personasbajas;
      
      
      
      
      
      }
         return retorno;
    
    }
}
