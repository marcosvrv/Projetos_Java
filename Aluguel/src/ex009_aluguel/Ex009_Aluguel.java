/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex009_aluguel;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Ex009_Aluguel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantos dias alugados? ");
        int dias = tec.nextInt();
        System.out.print("Quantos km rodados? ");
        int km = tec.nextInt();
        float diaria = dias * 60;
        float kmt = km * 0.15f;
        float tot = diaria + kmt;
        System.out.printf("O total a pagar é de R$%.2f. %n", tot);
    }
    
}
