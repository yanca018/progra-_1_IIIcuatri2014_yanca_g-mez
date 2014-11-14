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
public class Juego {
    
    String jugador1;
    String jugador2;
    String jugador = "x";
    
    int contPartidas = 0;
    int contJugador1 = 0;
    int contJugador2 = 0;
    
    String[][] matriz = new String[7][6];
    /*String[][] matriz  = {
         {"x",null,null,null,null,null},
         {null,"x",null,null,null,null},
         {null,null,"x",null,null,null},
         {null,null,null,null,"0","0"},
         {null,null,null,null,null,null},
         {null,null,null,null,null,null},
         {null,null,null,null,null,null}
     };*/
    
    public void leerJugadores(){
        
        
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
          //Controla si hay errores al leer en la consola
        try {

            //************ Datos de judores ************//
            System.out.println("Seleccionar el nombre del jugador número 1. (X)");
            //Crea el buffer de lectura
            
            //Leemos el nombre del jugador 1
            jugador1 = bufferRead.readLine();
            
            System.out.println("Seleccionar el nombre del jugador número 2. (0)");
            //Leemos el nombre del jugador 2
            jugador2 = bufferRead.readLine();
        } catch (IOException ex) {
            //Imprime el error ocurrido
            Logger.getLogger(Cuatroenlinea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void imprimirMatriz(){
        System.out.println("#######################################");
        for(int y = 0; y<6; y++){
            
            for(int x = 0; x<7; x++){
                if (matriz[x][y] == null){
                    System.out.print("[ ]");
                }else{
                    System.out.print("["+matriz[x][y]+"]");
                }
            }
            System.out.println("");
        }
        for(int x = 1; x<8; x++){
            System.out.print(" "+x+" ");
        }
        System.out.println("");
    }
    
    public void colocarFicha(String ficha){
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
          //Controla si hay errores al leer en la consola
        int columna = 0;
        int fila = 5;
        String jugadorActual;
        try {
            if (ficha.equals("x")){
                jugadorActual = jugador1;
                System.out.println(jugador1+" ingrese la columna de la ficha");
            }
            else{
                jugadorActual = jugador2;
                System.out.println(jugador2+" ingrese la columna de la ficha");
            }
            String columnaDigitada = bufferRead.readLine();
            
            columna = Integer.parseInt(columnaDigitada);
            columna--;

            for(int y = 5; y>0; y--){
               if(matriz[columna][y] != null){
                   fila = y-1;
               }
            }
            matriz[columna][fila] = ficha;
            imprimirMatriz();
            int filaGanadora = validarHorizontal(ficha);
            if (filaGanadora != -1){
                filaGanadora++;
                System.out.println("-------------------------------------------");
                System.out.println("Ganador: "+jugadorActual+" en la fila: "+filaGanadora);
                System.out.println("-------------------------------------------");
                contPartidas++;
                if (jugadorActual.equals(jugador1)){
                   contJugador1++; 
                }else{
                    contJugador2++; 
                }
                 reiniciar();
            }
            int columnaGanadora = validarVertical(ficha);
            if (columnaGanadora != -1){
                columnaGanadora++;
               System.out.println("-------------------------------------------");
                System.out.println("Ganador: "+jugadorActual+" en la columna: "+columnaGanadora);
                System.out.println("-------------------------------------------");
                contPartidas++;
                if (jugadorActual.equals(jugador1)){
                   contJugador1++; 
                }else{
                    contJugador2++; 
                }
                 reiniciar();
            }
            int ganadorDiagonalDerecha = validarDiagonalDerecha(ficha);
            if (ganadorDiagonalDerecha != -1){
                System.out.println("-------------------------------------------");
                System.out.println("Ganador: "+jugadorActual+" en la diagonal derecha");
               System.out.println("-------------------------------------------");
                contPartidas++;
                if (jugadorActual.equals(jugador1)){
                   contJugador1++; 
                }else{
                    contJugador2++; 
                }
                 reiniciar();
            }
            
            int ganadorDiagonalIzquierda = validarDiagonalIzquierda(ficha);
            if (ganadorDiagonalIzquierda != -1){
               System.out.println("-------------------------------------------");
                System.out.println("Ganador: "+jugadorActual+" en la diagonal izquierda");
                System.out.println("-------------------------------------------");
                contPartidas++;
                if (jugadorActual.equals(jugador1)){
                   contJugador1++; 
                }else{
                    contJugador2++; 
                }
                reiniciar();
            }
            
        } catch (IOException ex) {
            //Imprime el error ocurrido
            Logger.getLogger(Cuatroenlinea.class.getName()).log(Level.SEVERE, null, ex);
          
        }
    }
    
    public void reiniciar(){
        matriz = new String[7][6];
    }
    
    public void validarGanador(){
        for(int y = 0; y<6; y++){            
            for(int x = 0; x<7; x++){
                
            }
        }
    }
    public int validarHorizontal(String ficha){
        int filaGanadora = -1;
        
        int contFichasRepetidas = 0;
        
        for(int y = 0; y<6; y++){            
            for(int x = 0; x<7; x++){
                if (ficha.equals(matriz[x][y])){
                    contFichasRepetidas++;
                }else{
                    contFichasRepetidas = 0;
                }
                if (contFichasRepetidas == 4){
                    filaGanadora =  y;
                    break;
                }
            }
        }
        
        return filaGanadora;
    }
    public int validarVertical(String ficha){
        int columnaGanadora = -1;
        
        int contFichasRepetidas = 0;
        for(int x = 0; x<7; x++){
            for(int y = 0; y<6; y++){
            
                if (ficha.equals(matriz[x][y])){
                    contFichasRepetidas++;
                }
                else{
                    contFichasRepetidas = 0;
                }
                if (contFichasRepetidas == 4){
                    columnaGanadora =  x;
                    break;
                }
            }
        }
        
        return columnaGanadora;
    }
    
    public int validarDiagonalDerecha(String ficha){
        int ganadorDerecha = -1;
        int xAnterior = 0;
        int yAnterior = 0;
        int contFichasRepetidas = 0;
        for(int y = 5; y>0; y--){            
            for(int x = 0; x<7; x++){
                if (ficha.equals(matriz[x][y]) && (x-1 == xAnterior || x == 0) && yAnterior != y){
                    contFichasRepetidas++;
                    xAnterior = x;
                    yAnterior = y;
                }
                
                if (contFichasRepetidas == 4){
                    ganadorDerecha =  y;
                    break;
                }
            }
        }
        
        return ganadorDerecha;
    }
     public int validarDiagonalIzquierda(String ficha){
        int ganadorDerecha = -1;
        int xAnterior = 0;
        int yAnterior = 0;
        int contFichasRepetidas = 0;
        for(int y = 0; y<6; y++){            
            for(int x = 0; x<7; x++){
                if (ficha.equals(matriz[x][y]) && (x-1 == xAnterior || x == 0) && yAnterior != y){
                    contFichasRepetidas++;
                    xAnterior = x;
                    yAnterior = y;
                }
                
                if (contFichasRepetidas == 4){
                    ganadorDerecha =  y;
                    break;
                }
            }
        }
        
        return ganadorDerecha;
    }
     
    public void rendirse(String jugador){
        contPartidas++;
        if (jugador.equals(jugador1)){
            contJugador2++;
        }else{
            contJugador1++;
        }
        reiniciar();
    }
    
}
