/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex006_descontos;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Ex006_Descontos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float preco, desc;
        Scanner tec = new Scanner(System.in);
        System.out.print("Qual é o preço do produto? R$");
        preco = tec.nextFloat();
        desc = preco - (preco * 5 / 100);
        //System.out.println("O produto que custava R$" + preco + ", na promoção com o desconto de 5% vai custar R$" + desc);
        System.out.printf("O produto que custava R$%.2f, na promoção com o desconto de 5 porcento vai custar R$%.2f. %n", preco, desc);
    }
    
}
