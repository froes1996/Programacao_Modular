package Sobrecarregados;
import java.util.Scanner;
public class Ex01 {
    public static double calculaNotaFinal(double prova1, double prova2){
        double resultado = (prova1 + prova2) / 2;
        return resultado;
    }
    public static double calculaNotaFinal(double prova1, double prova2, double trab1){
        double media = (prova1 * 3 + prova2 * 3 + trab1 * 4 )/ 10;
        return media;
    }
    public static double calculaNotaFinal(double prova1, int peso1, double prova2, int peso2){
        double media = (prova1 * peso1 + prova2 * peso2) / (peso1+peso2);
        return media;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double provaA, provaB, trabalhoC;
        int pesoA, pesoB;

        provaA = 9.5;
        provaB = 8.4;
        trabalhoC = 7.0;

        pesoA = 9;
        pesoB = 5;
        
        System.out.println(calculaNotaFinal(provaA, provaB));
        System.out.println(calculaNotaFinal(provaA, provaB, trabalhoC));
        System.out.println(calculaNotaFinal(provaA, pesoA, provaB, pesoB));
        
        
    }
}
