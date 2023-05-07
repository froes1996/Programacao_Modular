/*
 • Escreva um método calculaFatorial que receba por parâmetro um
numero inteiro e retorne o fatorial deste número
• O programa principal deve ler do teclado o número, chamar o
método criado e imprimir na tela o resultado
 */
package Metodos;
import java.util.Scanner;
public class Ex06 {
    public static int calculaFatorial(int v1){
        int fatorial = 1;

        for(int i = 1; i <= v1; i++){
            fatorial = fatorial * i;
        }
        return fatorial;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um numero");
        int v1 = in.nextInt();

        System.out.println(calculaFatorial(v1));
    }
    
}
