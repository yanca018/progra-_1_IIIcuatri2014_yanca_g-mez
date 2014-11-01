/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase10;

/**
 *
 * @author Yanca
 */
public class ordenamientoburbuja {
    
      public int []ordenamientoB(int [] arreglo, String ordenamiento){
        
        int indice;
        int indice2;
        int auxiliar;
        for (indice=0; indice < arreglo.length-1; indice++){
            for (indice2=0; indice2 < (((arreglo.length)-indice)-1);indice2++){
                if (arreglo[indice2+1]<arreglo[indice2]){
                    auxiliar = arreglo[indice2+1];
                    arreglo[indice2+1]=arreglo[indice2];
                    arreglo[indice2]=auxiliar;
                }
                    
    
                }
}
return arreglo;
}

}

