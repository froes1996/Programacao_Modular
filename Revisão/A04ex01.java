/*Faça um programa para ler do teclado uma linha de texto e um
caractere de pesquisa.
Determinar o número de ocorrências do caractere no texto e imprima
na tela.
Não converter a String para um array de caracteres.
*/
import java.util.Scanner;
public class A04ex01{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ler = "";
        char c = '';

        System.out.println("Informe uma frase");
        ler = in.nextLine();

        System.out.println("Informe um caractere");
        c = in.next().charAt(0);

        
    }
}