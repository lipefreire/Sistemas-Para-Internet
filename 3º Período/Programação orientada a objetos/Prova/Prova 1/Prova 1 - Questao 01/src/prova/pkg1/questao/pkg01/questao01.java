package prova.pkg1.questao.pkg01;

public class questao01 {

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        
        System.out.println("Executando ação para ligar a lâmpada...");
        lampada1.ligar();
        System.out.println("Estado atual da lâmpada: " + lampada1.estado + "\n");
        
        System.out.println("executar ação para desligar a lâmpada...");
        lampada1.desligar();
        System.out.println("Estado atual da lâmpada: " + lampada1.estado);
        
        
    }
    
}
