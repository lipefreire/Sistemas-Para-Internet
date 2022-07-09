package lista.pkg1.questao.pkg02;

import java.util.Scanner;
import java.awt.Color;

public class lista1questao02 {

    
    public static void main(String[] args) {
        Pixel pxl = new Pixel();
        
        Scanner coordenadaX = new Scanner(System.in);
        Scanner coordenadaY = new Scanner(System.in);
        Scanner rgbb = new Scanner(System.in);
        
        System.out.print("Digite a coordenada X: ");
        pxl.cordX(coordenadaX.nextInt());
        
        System.out.print("Digite a coordenada Y: ");
        pxl.cordY(coordenadaY.nextInt());
        
        System.out.print("A cor selecionada foi: ");
        pxl.RGB(Color.green);
        
        System.out.print("Verde\n\n"); //Não consegui solicitar uma cor diretamente do teclado.
        System.out.println(pxl.useRGB());
    }
    
}
