package Sobrecarregados;
import java.util.Scanner;
/*
 Escreve três métodos sobrecarregados chamados inverter. O primeiro
método aceita um parâmetro do tipo String e retorna uma nova
String que é a versão invertida da original.
• O segundo método aceita três parâmetros: uma String, um índice de
início e um índice de fim. O método então retorna uma nova String
que é a versão da String original com os caracteres entre os índices de
início e fim invertidos.
• O terceiro método aceita um parâmetro do tipo array de caracteres e
retorna o array invertido.
• O programa principal deve fazer chamadas de método para os 3
métodos criados e mostrar na tela os resultados.
 */
public class Ex03 {
    public static String inverter(String s1){
        String invertida = "";
        for(int i = s1.length() - 1; i >= 0; i--){
            char troca = s1.charAt(i);
            invertida = invertida + troca;
        }
        return invertida;
    }
    public static String inverter(String s1, int iinicial, int ifinal){
        String resultado = "";

        for(int i = ifinal - 1; i >= iinicial; i--){
            char troca = s1.charAt(i);
            resultado = resultado + troca;
        }
        return resultado;
    }

    public static void inverter(char [] array){
        for(int i = array.length -1; i >= 0; i--){
            System.out.print(array[i]+ ", ");
        }
    }
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Informe uma palavra");
            String palavra = in.next();

            char [] v1 = {'a', 'b', 'c', 'd', 'e'};
            int inicial = 1;
            int fin = 4;
            System.out.println(inverter(palavra));
            System.out.println(inverter(palavra, inicial, fin));
            inverter(v1);
    }
}


