
package boletin2_2;
import java.util.Scanner;

public class Boletin2_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        System.out.println("introduce la cantidad de grados centigrados : ");
        float gradosCentigrados = ler.nextFloat();
        System.out.println("La cantidad en Grados Fahrenheit es: " + ((gradosCentigrados*9/5)+32) + " y los grados Kelvin son: " + (gradosCentigrados+273.15));
                
    }
    
}
