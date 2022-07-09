package lista.pkg1.questao.pkg02;

import java.awt.Color;

public class Pixel {
    private Color rgb;
    private int x,y, rgb2;
    
    public void cordX(int x){
        this.x = x;
    }
    public void cordY(int y){
        this.y = y;
    }
    public void corRGB(int rgb2){
        this.rgb2 = rgb2;
    }
    public int useCordX(){
        System.out.print("Coordenada X: ");
        return x;
    }
    public int useCordY(){
        System.out.print("Coordenada Y: ");
        return y;
    }
    public void RGB(Color rgb){
        this.rgb = rgb;
    }
    public String useRGB(){
        if (rgb == null){
            return null;
        }
        return "RGB: " + rgb.getRed() + ", " + rgb.getGreen() + ", " + rgb.getBlue() + "";
    }
}
