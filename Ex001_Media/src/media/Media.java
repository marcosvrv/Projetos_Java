package media;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*System.out.print("Primeira nota do aluno: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota do aluno: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.printf("A média entre %.2f e %.2f é igual a: %.2f\n", n1, n2, m);
        if (m>=7) {
            System.out.println("Parabéns, você passou!");
        }*/
        
        System.out.print("Ano de nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2024 - nasc;
        if (i>=18) {
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }
    }
    
}
