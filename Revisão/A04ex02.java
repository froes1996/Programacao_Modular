/*Faça um programa para ler do teclado uma linha de texto e um
caractere de pesquisa.
• Utilize o método String indexOf para determinar o número de
ocorrências do caractere no texto e imprima na tela.
• Não converter a String para um array de caracteres.
*/

import java.util.Scanner;
public class A04ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String palavra = "";
        char c;
        int resultado=0;

        System.out.println("Informe uma frase");
        palavra = in.nextLine();

        System.out.println("Informe um caracter de pesquisa");
        c = in.next().charAt(0);
        
            resultado = palavra.indexOf(c, 0);

        System.out.println(resultado);
    }
}
