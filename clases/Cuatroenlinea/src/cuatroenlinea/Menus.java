/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cuatroenlinea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class Menus {
    Juego juego = new Juego();
    public void menuPrincipal(){
        String opcion;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        //******* MENU PRINCIPAL*********//
        System.out.println("MENU PRINCIPAL");
 
        System.out.println("1: Juego");           
        System.out.println("2: Estadisticas");
        System.out.println("3: Salir");           
        //Controla si hay errores al leer en la consola
        try {
            
            
             opcion = bufferRead.readLine();
            
             if (opcion.equals("1")){
                 menuJuego();
             }
             if (opcion.equals("2")){
                 System.out.println("Cantidad de partidas completadas: "+juego.contPartidas);
                 System.out.println("Cantidad de partidas ganadas por el jugador "+juego.jugador1+": "+juego.contJugador1);
                 System.out.println("Cantidad de partidas ganadas por el jugador "+juego.jugador2+": "+juego.contJugador2);
             }
             //Encicla el menu principal para mostrarlo hasta precionar la tecla 3
             if (!opcion.equals("3")){
                 menuPrincipal();
             }
             
         } catch (IOException ex) {
             //Imprime el error ocurrido
             Logger.getLogger(Menus.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public void menuJuego(){
        String opcion;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        String jugadorActual;
        
        if (juego.jugador.equals("x")){
            jugadorActual = juego.jugador1;
        }else{
            jugadorActual = juego.jugador2;
        }
        
        
        //******* MENU JUEGO*********//
        System.out.println("MENU JUEGO");
         System.out.println("Jugador actal: "+jugadorActual);
        System.out.println("1: Rendirse");
        System.out.println("2: Reiniciar");
        System.out.println("3: Colocar ficha");
        System.out.println("4: Regresar al menu principal");
       
         //Controla si hay errores al leer en la consola
        try {
            
            
            opcion = bufferRead.readLine();
            if(opcion.equals("1")){
                juego.rendirse(jugadorActual);
             }
            if (opcion.equals("2")){
                juego.reiniciar();
                juego.imprimirMatriz();
            }
            if(opcion.equals("3")){                  
                juego.imprimirMatriz();
                juego.colocarFicha(juego.jugador);

                if(juego.jugador.equals("x")){
                    juego.jugador = "0";
                }else{
                  juego.jugador = "x";
                }
             }
             if (!opcion.equals("4")){
                 menuJuego();
             }
             
         } catch (IOException ex) {
             //Imprime el error ocurrido
             Logger.getLogger(Menus.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
}
