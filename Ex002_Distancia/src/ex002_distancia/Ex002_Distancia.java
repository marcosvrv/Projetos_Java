package ex002_distancia;

import java.util.Scanner;

public class Ex002_Distancia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Uma distância em metros: ");
        float d = teclado.nextFloat();
        System.out.printf("A medida de %.2f m corresponde a:\n", d);
        
        float km = d / 10 / 10 / 10;
        float hm = d / 10 / 10;
        float dam = d / 10;
        float dm = d * 10 ;
        float cm = d * 10 * 10;
        float mm = d * 10 * 10 * 10;
        
        System.out.printf("%.2f km\n", km);
        System.out.printf("%.2f hm\n", hm);
        System.out.printf("%.2f dam\n", dam);
        System.out.printf("%.2f dm\n", dm);
        System.out.printf("%.2f cm\n", cm);
        System.out.printf("%.2f mm\n", mm);
    }
    
}
