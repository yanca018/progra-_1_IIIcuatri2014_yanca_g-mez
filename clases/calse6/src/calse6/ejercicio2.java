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
public class ejercicio2 {

    private String cadena;

    public ejercicio2() 
    {
        
    }

    public String mediaCadena() {

        String retorno = "";
        for (int i = 0; i < getCadena().length() / 2; i++) {

            retorno += getCadena().charAt(i);

        }
        return retorno;

    }

    public ejercicio2(String cadena) {
        this.cadena = cadena;
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String ultimovalor() {

        return getCadena().charAt(getCadena().length() - 1) + "";

    }

    public String Alrevez() {

        String retorno = "";
        for (int i = getCadena().length() - 1; i >= 0; i--) {

            retorno += getCadena().charAt(i);

        }
        return retorno;

    }

    public String guion() {

        String retorno = "";
        for (int i = 0; i < getCadena().length(); i++) {
            if (getCadena().length() - 1 == i) {

                retorno += getCadena().charAt(i);

            }

            retorno += getCadena().charAt(i) + "-";

        }
        return retorno;
    }

    public int vocales() {

        int cantidadVocales = 0;

        for (int i = 0; i < getCadena().length(); i++) {

            if ((getCadena().charAt(i) == 'a')
                    || (getCadena().charAt(i) == 'A')
                    || (getCadena().charAt(i) == 'e')
                    || (getCadena().charAt(i) == 'E')
                    || (getCadena().charAt(i) == 'i')
                    || (getCadena().charAt(i) == 'I')
                    || (getCadena().charAt(i) == 'o')
                    || (getCadena().charAt(i) == 'O')
                    || (getCadena().charAt(i) == 'u')
                    || (getCadena().charAt(i) == 'U')) {

                cantidadVocales++;

            }

        }

        return cantidadVocales;

    }

    public boolean palindromo() {

        String palabraalrevez = "";
        for (int i = getCadena().length() - 1; i >= 0; i--) {
            palabraalrevez += +getCadena().charAt(i);

        }

        if (getCadena().equals(palabraalrevez)) {

            return true;

        } else {

            return false;
        }

    }
}
