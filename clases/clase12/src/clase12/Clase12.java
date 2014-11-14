/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase12;

/**
 *
 * @author Yanca
 */
public class Clase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        nododelista nododelista1 = new nododelista();
        nododelista1.setMatricula("01");
        nododelista1.setDueno("chiky");
        nododelista1.setMarca("ferrari");
        
        
        nododelista nododelista2= new nododelista();
        nododelista2.setMatricula("02");
        nododelista2.setDueno("mis tetas");
        nododelista2.setMarca("perro");
        
        lista olista = new lista();
        olista.Insertar(nododelista1);
        olista.Insertar(nododelista2);
        olista.imprimir();
        
    }
    
}
