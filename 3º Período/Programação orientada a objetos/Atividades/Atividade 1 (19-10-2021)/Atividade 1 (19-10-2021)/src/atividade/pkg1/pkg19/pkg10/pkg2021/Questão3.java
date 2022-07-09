package atividade.pkg1.pkg19.pkg10.pkg2021;

import java.util.Scanner;

public class Questão3 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int x = 1;
        int idade;
        int pessoas = 0;
        
        while (x <=10) {
            System.out.print(x + "ª idade: ");
            idade = teclado.nextInt();
            x = x + 1;
            
            if (idade >= 18) {
                pessoas = pessoas + 1;
            }
        }
        System.out.println(" ");
        System.out.println("Número de pessoas maiores de idade: " + pessoas);
    }
    
}
