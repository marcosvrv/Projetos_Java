/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex005_pintando;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Ex005_Pintando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float dim, tot;
        Scanner tec = new Scanner(System.in);
        System.out.print("Largura da parede: ");
        float larg = tec.nextFloat();
        System.out.print("Altura da parede: ");
        float alt = tec.nextFloat();
        
        dim = larg * alt;
        tot = alt / 2;
        
        System.out.printf("Sua parede tem a dimensão de " + larg + " x " + alt + " e a sua área é de " + dim + " m2. %n");
        System.out.printf("Para pintar essa parede, você precisará de " + tot + "l de tinta. %n");
        
        
    }
    
}
