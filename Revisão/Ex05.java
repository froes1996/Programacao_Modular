package Revisão;
/*Escreva dois métodos sobrecarregados chamados concatenar.
• O primeiro deve aceitar um parâmetro do tipo array de caracteres e
retornar uma string que seja a concatenação de todos os caracteres
do array.
• O segundo método deve aceitar dois parâmetros do tipo array de
caracteres e retornar um novo array que seja a concatenação de
todos os caracteres dos dois arrays.
• O programa principal deve fazer chamadas de método para os 2
métodos criados e mostrar na tela os resultados.
*/
import java.util.Scanner;
public class Ex05 {
    public static String concatenar(char [] c1){
        String resultado = "";
        for(int i = 0; i < c1.length; i++){
            resultado = resultado+c1[i];
        }
        return resultado;
    }

public static String concatenar(char [] c2, char [] c3){
    String resultado = "";
    for(int i = 0; i < c2.length; i++){
        resultado = resultado + c2[i]; 
    }
    for(int i = 0; i < c2.length; i++){
        resultado = resultado + c3[i];
    }
    return resultado;
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    char [] ca = new char [5];

    for(int i = 0; i < ca.length; i++){
        System.out.println("Informe o caracter: " + i);
        ca[i] = in.next().charAt(0);
    }

    char [] cb = new char [5];
    char [] cc = new char [5];

    for(int i = 0; i < cb.length; i++){
        System.out.println("Informe o valor " + i);
        cb[i] = in.next().charAt(0);
    }

    for(int i = 0; i < cb.length; i++){
        System.out.println("Informe o valor " + i);
        cc[i] = in.next().charAt(0);
    }

    System.out.println("Metodo 1 = "+concatenar(ca));
    System.out.println("Metodo 2 = "+concatenar(cb, cc));
}
}
