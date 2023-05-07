/*
 • Escreva 3 métodos para cada uma das seguintes tarefas:
• a) Calcule a parte inteira do quociente quando um número inteiro a é
dividido por outro número inteiro b
• b) Calcule o resto inteiro quando um inteiro a é dividido por um
inteiro b.
• c) Utilize os métodos desenvolvidos nos itens (a) e (b) para escrever
um método displayDigits que recebe um inteiro entre 1 e 99999 e o
exibe como uma sequência de dígitos separados por espaços.
• Por exemplo, o inteiro 4562 deve aparecer como 4 5 6 2
• O programa principal deve ler do teclado um número inteiro e
chamar o método displayDigits. Caso o número não esteja no
intervalo de 1 a 99999, um novo número deve ser solicitado.
 */
package Metodos;
import java.util.Scanner;
public class Ex05 {
    public static int inteiro(int v1, int v2){
        int resultado = 0;

        resultado = v1 / v2;
        return resultado;
    }
    public static int resto(int v1, int v2){
        int resultado = 0;

        resultado = v1 % v2;

        return resultado;
    }
    public static void displayDigits(int v3){
        String resultado = "";
        while(v3 > 0){
            int resto = resto(v3, 10);
             v3 = inteiro(v3, 10);
            resultado = resto + " " + resultado;
        }
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.println("Informe dois valores");
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            
            int v3;
            do{
                System.out.println("Informe um numero entre 1 e 99999");
                v3 = in.nextInt();
                }while(v3 < 1 || v3 > 99999);
                displayDigits(v3);

            int inteiro = inteiro(v1, v2);
            int resto = resto(v1, v2);
                
           
            System.out.println(inteiro);
            System.out.println(resto);
    }
}
