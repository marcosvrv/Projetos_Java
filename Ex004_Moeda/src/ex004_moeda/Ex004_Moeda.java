/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex004_moeda;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Ex004_Moeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float dolar, euro;
        Scanner tec = new Scanner(System.in);
        System.out.print("Quanto dinheiro você tem na carteira? R$");
        float real = tec.nextFloat();
        dolar = real / 5.46f;
        euro = real / 6.07f;
        
        System.out.printf("Com R$%.2f você pode comprar US$%.2f ou €%.2f %n", real, dolar, euro);
    }
    
}
