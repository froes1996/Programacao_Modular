package Revisão2;

import java.util.Scanner;

/*
 Exercício 1
• Escreva um método recursivo que encontre e retorne a soma dos
elemento de um vetor de n inteiros.
• int soma(int v[], int tam)
• O método main deve ler via teclado o valor de n, preencher os
elementos por leitura do teclado, chamar o método criado e imprimir
na tela o resultado.
 */
import java.util.Scanner;
public class Ex01{
   public static int soma(int[] v, int tam){
        if(tam == 1){
            return v[0];
        }else{
            return soma(v, tam - 1) + v[tam-1];
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor");
        int tam = in.nextInt();

        int[]v = new int[tam];

        for(int i = 0; i < tam; i++){
            System.out.println("Informe o valor"+ i);
            v[i] = in.nextInt();
        }
        System.out.println(soma(v, tam));
    }
}