
package boletin2_5;
import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in); 
      System.out.println("introduce tu sueldo fijo: ");//introducimos las variables.
      float sueldoFijo = ler.nextInt();
      System.out.println("introduce tu importe total de ventas: ");
      float ventas = ler.nextFloat()*(5/100);// de esta forma recogemos ya el valor necesario para poder realizar los calculos directamente
      System.out.println("Introduce los kilometros que realizaste: ");
      float km = ler.nextFloat()*2;
      System.out.println("Introduce los dias en los que te desplazaste: ");
      int dietas = ler.nextInt()*30;
      System.out.println("Su sueldo bruto es de: " + (sueldoFijo+ventas+km+dietas) + " y su sueldo líquido se le queda en: " + (((sueldoFijo+ventas+km+dietas) - (sueldoFijo+ventas+km+dietas)*18/100) - 36));
      
    }
    
}
