/*
• Escreva um método calculaPotencia(base, exponente) que receba por
parâmetros dois valores inteiros base e exponente e calcule e retorne
o resultado de baseexponente para o programa principal.
• Não utilize métodos da classe Math.
• Use uma estrutura de repetição.
• O programa principal deve solicitar ao usuário os valores inteiros para
base e exponente, chamar o método calculaPotencia e mostrar na
tela o resultado da operação.
 */

package Metodos;
import java.util.Scanner;
public class Ex01 {
    public static int calculaPotencia(int base, int expoente){
        int resultado = 1;
        for(int i = 0; i <expoente; i++){
            resultado = resultado * base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base, expoente, resultado;

        System.out.println("Informe a base");
        base = in.nextInt();

        System.out.println("Informe o expoente");
        expoente = in.nextInt();

        resultado = calculaPotencia(base, expoente);

        System.out.println(resultado);
    }
    
}
