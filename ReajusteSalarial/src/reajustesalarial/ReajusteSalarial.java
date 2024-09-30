/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex007_reajustesalarial;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Ex007_ReajusteSalarial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float salario, aumento;
        Scanner tec = new Scanner(System.in);
        System.out.print("Qual o salário do funcionário? R$");
        salario = tec.nextFloat();
        aumento = salario + (salario * 15 / 100);
        System.out.printf("Um funcionário que ganhava R$%.2f, com 15 porcento de aumento, passa a receber R$%.2f. %n", salario, aumento);
    }
    
}
