/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

/**
 *
 * @author Yanca
 */
public class ejercicio1 {

    
       //método que tome un string y lo devuelva al revés
    public String Alreves(String palabra){
      String temporal="";
        for (int i = palabra.length()-1; i >0; i--) {
            temporal+=palabra.charAt(i);
        }
        return temporal;
    }
}