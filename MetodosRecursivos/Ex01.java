package MetodosRecursivos;

/*
 • Escreva um método recursivo que receba como parâmetro um
número inteiro N, maior ou igual a zero, e retorne o enésimo termo
da sequência de Fibonacci.
• int fibo(int n)
• O primeiro e segundo termos dessa sequência é zero e um,
respectivamente, e os demais termos são calculados pela soma dos
dois termos anteriores.
• Alguns termos dessa sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
• O método main deve ler via teclado o valor de N, chamar o método
criado e imprimir na tela o termo na posição N da série.
• Exemplo: Se N for igual a 7, então a saída do programa deve ser:
“Termo da sequencia = 13”.
 */
import java.util.Scanner;
public class Ex01 {
    public static int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }else{
            return (n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor de n");
        int n = in.nextInt();

        System.out.println(fibo(n));
    }
}
