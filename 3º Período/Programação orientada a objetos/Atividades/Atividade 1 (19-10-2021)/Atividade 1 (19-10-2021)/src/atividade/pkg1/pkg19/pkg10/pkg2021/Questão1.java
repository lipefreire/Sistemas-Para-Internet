package atividade.pkg1.pkg19.pkg10.pkg2021;

import java.util.Scanner;

public class Questão1 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
                
        System.out.print("Digite o preço do produto: ");
        numero = teclado.nextDouble();
        
        double calculo = (numero / 100) * 15;
        double aumento = numero + calculo;
        
        System.out.println("O preço do produto com aumento é de: " + aumento);
    }
    
}
