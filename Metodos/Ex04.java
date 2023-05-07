/*
 Escreva um método squareOfAsterisks que exibe um quadrado sólido
(o mesmo número de linhas e colunas) de asteriscos cujo lado é
especificado por um parâmetro inteiro side.
• Por exemplo, se side for 4, o método deverá exibir
****
****
****
****
• O programa principal deve ler do teclado um valor para side e gerar a
saída dos asteriscos com o método squareOfAsterisks.
 */

package Metodos;
import java.util.Scanner;
public class Ex04 {
    public static void squareOfAsterisks(int lin, int col){
        for(int i = 0; i < lin; i++){
            for(int j = 0; j < col; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o numero de Linhas");
        int lin = in.nextInt();

        System.out.println("Informe o numero de colunas");
        int col = in.nextInt();

        squareOfAsterisks(lin,col);

    }
}
