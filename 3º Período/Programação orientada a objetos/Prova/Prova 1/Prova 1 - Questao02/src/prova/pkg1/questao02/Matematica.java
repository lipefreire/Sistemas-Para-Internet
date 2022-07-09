package prova.pkg1.questao02;

public class Matematica {
    static boolean multiplo;
    static int resultado;
    
    static boolean isMultiplo(int n, int m){
        if (n % m != 0){
            multiplo = false;
        }
        else{
            multiplo = true;
        }
        return multiplo;
    }
}
