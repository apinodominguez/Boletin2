package boletin2_3;
import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        System.out.println("introduce la cantidad de billetes de 100€: ");
        int billetes100 = ler.nextInt();
        System.out.println("introduce la cantidad de billetes de 20€: ");
        int billetes20 = ler.nextInt();
        System.out.println("introduce la cantidad de billetes de 5€: ");
        int billetes5 = ler.nextInt();
        System.out.println("introduce la cantidad de monedas de 1€: ");
        int monedas1 = ler.nextInt();
        System.out.println("La cantidad total es de: " + (billetes100*100+billetes20*20+billetes5*5+monedas1) + "€");
    }
    
}
