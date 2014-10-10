/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calse6;

/**
 *
 * @author Yanca
 */
public class ejercicio1 {
    
    private String email;

    public ejercicio1(String email)
    {
        this.email = email;
    }
    
    public String validarCorreo(){
    
     String  mensaje="el corre no contiene @";
     
     for(int i = 0; i<email.length(); i++){
     if(email.charAt(i)=='@'){
     
     
     }
     mensaje="el correo si contiene @";
     }
    return mensaje;
    
    }
    
}
