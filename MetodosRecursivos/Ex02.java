package MetodosRecursivos;
/*
 • Escreva um método recursivo que calcule e retorne a soma dos
primeiros N cubos: S = 1
3 + 2
3 + ... + n
3
.
• int somacubos(int n)
• O método main deve ler via teclado o valor de N, chamar o método
criado e imprimir na tela a soma.
• Exemplo: Se N for igual a 5, então a saída do programa deve ser:
“Soma = 225”.
 */
import java.util.Scanner;
public class Ex02 {
    public static int somacubos(int n){
        if(n == 1){
            return 1;
        }else{
            return (int) (Math.pow(n, 3) + somacubos(n - 1));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor de n");
        int n = in.nextInt();

        System.out.println(somacubos(n));
    }
}
