package Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 Escreva um programa (método main) que solicite ao usuário um
número N e preencha via teclado um array de N números inteiros.
• O método main deve tratar as seguintes exceções:
• Se o usuário digitar um valor não numérico, o programa deve ignorar o valor,
mostrar a mensagem “Valor inválido” e continuar solicitando que o usuário
digite o próximo número até preencher o array. (InputMismatchException)
• Escreva um método calculaMaior que receba por parâmetros apenas
um array contendo N valores inteiros e retorne o maior elemento.
• O método main deve chamar o método calculaMaior e imprimir na
tela o resultado.
 */
public class ex01 {
        public static int maior(int[] array){
        int maior = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] > maior){
                maior = array[i];
            }
        }
        return maior;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o tamanho do array");
        int n = in.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Informe o valor: " + i);
            try {
                array[i] = in.nextInt();    
            } catch (InputMismatchException e) {
                System.out.println("valor invalido");
                in.nextLine();
                i--;
            }
        }
        System.out.println(maior(array));
    }
}
