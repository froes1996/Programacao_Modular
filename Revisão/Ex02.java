package Revisão;
import java.util.Scanner;

public class Ex02 {
    public static void trocaVetor(int[]v){
        int troca = 0;
        for(int i = 0; i < v.length - 1; i++){
            troca = v[i];
            v[i] = v[i+1];
            v[i+1] = troca;
        }
    }    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor");
        int n = in.nextInt();
        int [] v1 = new int[n];

        for(int i = 0; i < v1.length; i++){
            System.out.println("Informe o valor " + i + " do Vetor");
            v1[i] = in.nextInt();
        }
        trocaVetor(v1);
        for(int i = 0; i < v1.length; i++){
            System.out.print(v1[i]+ ", ");
        }
    }
}