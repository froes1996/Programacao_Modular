/*
 * Elabore um programa para ler do teclado uma linha de texto, tokeniza
o texto com o método split e gera os tokens na ordem inversa.
• Utilize caracteres de espaço em branco como delimitadores.
 */
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Infome uma frase");
        String texto = in.nextLine();

        String [] token = texto.split(" ");


        for(int i = token.length-1; i >= 0; i--){
            System.out.print(token[i]+ " ");
        }
        
    }
}
