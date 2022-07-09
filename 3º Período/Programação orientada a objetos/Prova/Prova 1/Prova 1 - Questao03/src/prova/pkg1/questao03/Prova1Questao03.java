package prova.pkg1.questao03;

public class Prova1Questao03 {

    public static void main(String[] args) {
        Ventilador ventilador1 = new Ventilador();
        
        System.out.println("Ligando ventilador...");
        ventilador1.ligar();
        ventilador1.maisVelocidade();
        ventilador1.getVelocidade();
        
        System.out.println("\nDiminuindo a velocidade do ventilador...");
        ventilador1.menosVelocidade();
        ventilador1.getVelocidade();
        
        System.out.println("\nDesligando o ventilador...");
        ventilador1.desligar();
        ventilador1.getVelocidade();
    }
}
