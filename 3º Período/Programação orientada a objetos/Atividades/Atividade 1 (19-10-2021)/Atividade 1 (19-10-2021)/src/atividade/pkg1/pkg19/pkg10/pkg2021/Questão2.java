package atividade.pkg1.pkg19.pkg10.pkg2021;

import java.util.Scanner;

public class Questão2 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu salário: ");
        double salario = teclado.nextDouble();
        
        if (salario < 1000) {
            double calculo = (salario / 100) * 15;
            double aumento = calculo + salario;
            
            System.out.println("Salário reajustado para: R$" + aumento);
        }
        else {
            System.out.println("Seu salário não atende aos requisitos do reajuste.");
        }
    }
    
}
