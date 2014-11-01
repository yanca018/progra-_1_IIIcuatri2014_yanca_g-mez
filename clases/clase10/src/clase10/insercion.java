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
public class insercion {
    
  public static void ordenacionInsercion(int[] v) {
        final int N = v.length;
        for(int i=1; i<N; i++) {
            int j=i;
            while(j>0 && v[j]<v[j-1] ){
                int tmp = v[j];
                v[j]    = v[j-1];
                v[j-1]  = tmp;
                j--;
            }
        }
    }

    static void ordenacionInsercion(int[] arreglito, String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
    
}
