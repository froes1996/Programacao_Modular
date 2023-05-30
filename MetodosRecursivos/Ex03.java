package MetodosRecursivos;
/*
 A multiplicação de dois números inteiros pode ser feita através de
somas sucessivas (por exemplo, 2 * 5 = 2 + 2 + 2 + 2 + 2).
• int mult(int A, int B)
• Crie um método recursivo que receba como parâmetro somente dois
números inteiros, A e B, e calcule e retorne a multiplicação destes
números através de somas sucessivas.
• O método main deve ler via teclado os valores de A e B, chamar o
método criado e imprimir na tela o resultado retornado pelo método.
 */
import java.util.Scanner;
public class Ex03 {
    public static int mult(int A, int B){
        if(B == 0){
            return 0;
        }else{
            return A + mult(A, B - 1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor de A");
        int A = in.nextInt();

        System.out.println("Informe o valor de B");
        int B = in.nextInt();

        System.out.println(mult(A, B));
    }
}
