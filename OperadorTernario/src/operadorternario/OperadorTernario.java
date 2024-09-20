/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

import java.util.Scanner;
/**
 *
 * @author marco
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2) ? 0:1; // SE N1 FOR MAIOR Q N2 A VARIÁVEL 'R' VAI RECEBER 0, SE O N2 FOR MAIOR Q N1, 'R' VAI RECEBER 1
        System.out.println(r);*/
       
       /*String nome1 = "Marcos";
       String nome2 = "Marcos";
       String nome3 =  new String("Marcos");
       String res;
       res = (nome1 == nome2)?"igual":"diferente";
       System.out.println(res);*/
       
       String nome1 = "Marcos";
       String nome2 = "Marcos";
       String nome3 =  new String("Marcos");
       String res;
       res = (nome1.equals(nome3))?"igual":"diferente";
       System.out.println(res);
        
       
       /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número ");
        int n1 = teclado.nextInt();
        System.out.println("Digite outro número");
        int n2 = teclado.nextInt();
        int r = (n1>n2) ? 0:1;
        System.out.println(r);*/
        
    }
    
}
