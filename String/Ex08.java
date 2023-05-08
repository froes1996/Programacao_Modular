/*
 • Elabore um programa que codifica frases da língua inglesa em latim de porco. O
Pig Latin é uma forma de linguagem codificada. Utilize o seguinte algoritmo:
• Para formar uma frase em latim de porco a partir de uma frase em inglês,
tokenize a frase em palavras com o método split. Para traduzir cada palavra
inglesa em uma palavra do latim de porco, coloque a primeira letra da palavra
inglesa no final da palavra e adicione as letras “ay”. Assim, a palavra “jump” tornase “umpjay”, a palavra “the” torna-se “hetay”, e a palavra “computer” torna-se
“omputercay”. Os espaços entre as palavras permanecem iguais.
• Considere que a frase inglesa consiste em palavras separadas por espaços, não há
nenhuma marcação de pontuação e todas as palavras têm duas ou mais letras.
• Permita que o usuário insira a frase. O programa deve imprimir a frase em Pig
Latin. A frase deve iniciar com uma letra maiúscula.
• Ex.: Frase: “The boy likes ice cream” Saída: “Hetay oybay ikeslay ceiay reamcay”
21
 */
package String;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String frase = "The boy likes ice cream";

        String[] token = frase.split("\\s+");

        for (int i = 0; i < token.length; i++) {
            token[i] = token[i].substring(1) + token[i].toLowerCase().charAt(0) + "ay ";
            frase = frase + token[i] + "";
        }
        System.out.println(frase.toLowerCase().charAt(0) + " " + frase.substring(1) + " \n");
    }
}
