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
public class lista {

    private nododelista Raiz;

    public void Insertar(nododelista elemento) {

        nododelista nuevo;
        nuevo = new nododelista();
        nuevo.setMatricula(elemento.getMatricula());
        nuevo.setDueno(elemento.getDueno());
        nuevo.setMarca(elemento.getMarca());
        if (Raiz == null) {
            nuevo.setSiguiente(null);
            Raiz = nuevo;
        } else {
            nododelista auxiliar = Raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
 public void imprimir(){
     
     nododelista recorrido = Raiz;
     System.out.println("listado de todos los elementos de  la lista");
     while(recorrido!= null){
         
 
 
 }
     System.out.println("la marca es :"+recorrido.getMarca()+",el dueño es :"+recorrido.getDueno()+ ", la matricula es :"+recorrido.getMarca());
     recorrido=recorrido.getSiguiente();
     
      System.out.println();
 
 }

}
