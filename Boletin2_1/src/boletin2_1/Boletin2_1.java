
package boletin2_1;
import java.util.Scanner;

public class Boletin2_1 {
    
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in); 
       System.out.println("introduce el precio total del producto : ");
       float prezoTotal = ler.nextFloat();
       System.out.println("introduce el precio pagado por el producto : ");
       float prezoPagado = ler.nextFloat();
       System.out.println("El porcentaje descuentado del precio del producto es:" + prezoPagado/prezoTotal*100 + "%");
    }
    
}
