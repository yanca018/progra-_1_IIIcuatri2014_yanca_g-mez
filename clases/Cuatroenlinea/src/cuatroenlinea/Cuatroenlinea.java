/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cuatroenlinea;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class Cuatroenlinea {
   
    
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
                 
        Menus menus = new Menus();
        menus.juego.leerJugadores();
        menus.menuPrincipal();
        
        
    }
    
    
    
}
