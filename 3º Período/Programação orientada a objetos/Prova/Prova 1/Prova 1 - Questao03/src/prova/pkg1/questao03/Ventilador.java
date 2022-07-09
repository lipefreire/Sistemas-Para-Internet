package prova.pkg1.questao03;

public class Ventilador {
    int velocidade;
    public Ventilador(){
        velocidade = 0;
    }
    String estado;
    boolean ligado;
    boolean desligado;
    
    void ligar(){
        estado = "Ventilador ligado!";
        this.velocidade = 1;
    }
    void desligar(){
        estado = "Ventilador Desligado!";
        this.velocidade = 0;
    }
    
    boolean isLigado(){
        if(this.ligado == true){
            System.out.println("Estado atual do ventilador: Ligado!");
            return true;
        }else {
            System.out.println("Estado atual do ventilador: Desligado");
            return false;
        }
    }
    
    public void maisVelocidade(){
        if(velocidade >= 3){
            System.out.println("O ventilador já está na velocidade máxima");
        }
        else{
            velocidade = velocidade +1;
        }
    }
    
    public void menosVelocidade(){
        if(velocidade <= 0){
            System.out.println("O ventilador está desligado.");
        }
        else{
            velocidade = velocidade - 1;
        }
    }
    
    void getVelocidade(){
        System.out.println("Velocidade atual do ventilador: " + velocidade);
    }
}
