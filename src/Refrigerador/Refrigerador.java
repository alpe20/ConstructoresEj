package Refrigerador;

/**
 *
 * @author lizbethpichardo
 * @version 1.0
 */
public class Refrigerador {
    boolean leche=false;

    Refrigerador() {
        System.out.println("No hay leche");
    }
    
    Refrigerador(boolean leche){
        this.leche=leche;
        System.out.println("Ya hay leche");
    }
    
    public void abrir(){
        if(leche==true){
            System.out.println("Puedes hacer un cereal");
        }
        else if(leche==false){
            System.out.println("Comprar leche");
        }
    }
}
