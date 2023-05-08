package Metodos2;
/*Escreve um método ordemAlfabética que receba por parâmetros
duas palavras s1 e s2 e retorne uma String com as palavras em ordem
alfabética. Dica: Utilize o método compareTo da String.
• O programa principal deve ler as duas palavras via teclado e chamar o
método criado. Considere que as palavras podem ter letras
maiúsculas e/ou minúsculas.
• Ex1.: Se s1 for “caneta” e s2 for “caderno”, então a saída do programa
deve ser “caderno caneta”.
• Ex1.: Se s1 for “Aula” e s2 for “algoritmo”, então a saída do programa
deve ser “algoritmo Aula”.
 */
import java.util.Scanner;
public class Ex03 {
    public static void ordemAlfabetica(String s1, String s2){
        int resultado = s1.compareTo(s2);
        if(resultado < 0){
            System.out.print(s1 + " " + s2);
        }else{
            System.out.print(s2 + " " + s1);
        }
        
        
    }
    public static void main(String[] args) {
        String s1 = "pala";
        String s2 = "Chiclete";

    ordemAlfabetica(s1, s2);
    }

}
