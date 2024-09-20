/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex0010_catetohipotenusa;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Ex0010_CatetoHipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Comprimento do cateto oposto: ");
        float co = tec.nextFloat();
        System.out.print("Comprimento do cateto adjacente: ");
        float ca = tec.nextFloat();
        double hi = Math.hypot(co, ca);
        System.out.printf("A hipotenusa vai medir %.2f. %n", hi);
        
    }
    
}
