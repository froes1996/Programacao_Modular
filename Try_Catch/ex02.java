package Try_Catch;

import java.util.ArithmeticException;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 • Escreva um método double dividirNumeros que receba por parâmetro
dois números inteiros e retorne a divisão do primeiro número pelo
segundo.
• O método main deve solicitar que o usuário digite os dois números
inteiros, chamar o método criado e imprimir na tela o resultado.
• O método main deve tratar as seguintes exceções:
• Se ocorrer uma exceção ao ler um valor não numérico, o programa deve exibir
uma mensagem de erro "Erro: Número inválido fornecido." e solicitar ao
usuário que digite novamente os números. (InputMismatchException)
• Se o segundo número for zero, o método dividirNumeros deve lançar uma
exceção. A exceção é capturada no método main que mostra a mensagem
“Erro: Divisão por zero não é permitida.” (ArithmeticException)
 */
public class ex02 {
    public static double dividirNumeros(int v1, int v2){
        if(v2 == 0){
            throw new ArithmeticException();
        }
            double resultado =(double) v1/v2;

        return resultado;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int v1 = 0;
        int v2 = 0;

        while(true){
            try {
                System.out.println("Informe o primeiro valor");
                v1 = in.nextInt();

                System.out.println("Informe o segundo valor");
                v2 = in.nextInt();

                System.out.println(dividirNumeros(v1, v2));
            }catch (InputMismatchException e) {
                System.out.println("Erro: Número inválido fornecido.");
                in.nextLine();
            }catch(ArithmeticException e){
                System.out.println("Erro divisão por zero não é permitida.");
                in.nextLine();
            }
        }
    }
}
