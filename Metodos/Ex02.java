/*
 • Escreva um método isMultiple que receba por parâmetro um par de
inteiros e determine se o segundo inteiro é um múltiplo do primeiro,
ou seja, retorna true se o segundo for um múltiplo do primeiro e false
caso contrário.
• Faça um programa que lê via teclado uma série de pares inteiros (um
par por vez), determina e imprima na tela se o segundo valor em cada
par é um múltiplo do primeiro.
 */
package Metodos;
import java.util.Scanner;
public class Ex02 {
    public static boolean isMultiple(int v1, int v2){
        boolean multiplo = false;
        if(v2 % v1 == 0){
            multiplo = true;
        }
        return multiplo;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v1, v2;
        boolean resultado;

        System.out.println("Informe dois valores");
        v1 = in.nextInt();
        v2 = in.nextInt();

        resultado = isMultiple(v1, v2);

        System.out.println(resultado);

    }
}
