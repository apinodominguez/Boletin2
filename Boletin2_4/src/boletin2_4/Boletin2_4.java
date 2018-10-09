
package boletin2_4;
import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in); 
      System.out.println("introduce la cantidad total de dinero: ");
      int dineroTotal = ler.nextInt();
      int billetes100 = dineroTotal/100, resto1 = dineroTotal%100; // Tenemos que calcular el numero de billetes (con la división), y el sobrante para calcular el numero de billetes mas pequeños que tenemos
      int billetes20 = resto1/20, resto2 = resto1%20;
      int billetes5 = resto2/5, resto3 = resto2%5;
      System.out.println("Tenemos " + billetes100 + " de 100€, " + billetes20 + " de 20€, " + billetes5 + " de 5€ y " + resto3 + " monedas de 1€");
    }
    
}
