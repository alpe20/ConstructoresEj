package Refrigerador;

/**
 *
 * @author lizbethpichardo
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Lo mando a un constructor vacío
         */
        Refrigerador refrigerador=new Refrigerador();
        refrigerador.abrir();
        /**
         * Ahora a uno lleno
         */
        Refrigerador refri=new Refrigerador(true);
        refri.abrir();
    }
    
}
