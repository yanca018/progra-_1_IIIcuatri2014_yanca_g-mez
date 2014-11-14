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
public class nododelista {
    
    private String matricula;
    private String dueno;
    private String marca;
    private nododelista siguiente;
    
    
    public nododelista(){
    
    siguiente = null;
    matricula="";
     marca="";
     dueno="";
     
   
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public nododelista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nododelista siguiente) {
        this.siguiente = siguiente;
    }
    
    }
