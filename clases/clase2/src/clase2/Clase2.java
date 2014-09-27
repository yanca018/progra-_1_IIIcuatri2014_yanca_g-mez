/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;


/**
 *
 * @author Yanca
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public class cuentabancaria {

        private double saldoInicial;
        private boolean hayerror;

        public cuentabancaria() {

            saldoInicial = 0;
            hayerror = false;

        }

        public void Deposito(double monto) {

            setSaldoInicial(getSaldoInicial() + monto);
        
        }
        
        public void Retiro(double monto){
            
              if (getSaldoInicial() >= monto) {
                setSaldoInicial(getSaldoInicial() - monto);
        
        
        
        }
             
    
        }

        public double getSaldoInicial() {
            return saldoInicial;
        }

    public boolean isHayerror() {
        return hayerror;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void setHayerror(boolean hayerror) {
        this.hayerror = hayerror;
    }
    
    

}
}
