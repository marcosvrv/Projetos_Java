/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex008_temperatura;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Ex008_Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner tec = new Scanner(System.in);
        System.out.print("Informe a temperatura em °C: ");
        float c = tec.nextFloat();
        float f = (c * 1.8f) + 32;
        System.out.printf("A temperatura %.1f°C corresponde a %.1f°F. %n", c, f);
        
        
    }
    
}
