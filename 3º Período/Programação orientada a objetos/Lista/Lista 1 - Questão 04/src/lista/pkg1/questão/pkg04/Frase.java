package lista.pkg1.questão.pkg04;

public class Frase {
    String palavras = "";
    public String getNome(){
        return palavras;
    }
    
    public void nomear(String nome){
        palavras = nome;
    }
    
    public boolean isPalindromo(String escrita){
        String limpar = escrita.replaceAll("\\s+", "").toLowerCase();
        
        int length = limpar.length();
        int normal = 0;
        int inverter = length - 1;
        
        while(inverter > normal){
            char normalText = limpar.charAt(normal++);
            char inverterText = limpar.charAt(inverter--);
            if(inverterText != normalText){
                System.out.println("\nPalindromo?");
                return false;
            }
        }
        System.out.println("\nPalindromo?");
        return true;
    }
    
    public void qtdPalavras (String quant_palavras){
        String[] qnt = palavras.split("\\s+");
        System.out.format("\nQuantidade total de: %d palavras.\n",qnt.length);
    }
}
