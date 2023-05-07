/*
 Escreva um método calculaOperacao que receba por parâmetro dois
valores numéricos (float) e um símbolo.
• Esse símbolo representará a operação que se deseja efetuar com os
números. Assim, se o símbolo for “+”, deverá ser realizada uma
adição, se for “−”, uma subtração, se for “/”, uma divisão, e, se for “*”,
será efetuada uma multiplicação.
• Se um símbolo for inválido, o método imprime a mensagem “Símbolo
invalido!” e retorna -1;
• O programa principal deve ler do teclado os dois valores e o símbolo,
chamar o método criado e imprimir na tela o resultado da operação.
 */
package Metodos;
import java.util.Scanner;
public class Ex03 {
    public static float calculaOperacao(float v1, float v2, char caracter){
        float resultado = 0f;

        if(caracter != '+' && caracter != '-' && caracter != '*' && caracter != '/'){
            return -1;
        }
        if(caracter == '+'){
            resultado = v1 + v2;
        }else if(caracter == '-'){
            resultado = v1 - v2;
        }else if(caracter == '*'){
            resultado = v1 * v2;
        }else if(caracter == '/'){
            resultado = v1 / v2; 
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char caracter;
        float v1;
        float v2;
        float resultado;

        System.out.println("Informe a operação que deseja fazer");
        caracter = in.next().charAt(0);

        System.out.println("Informe dois valores");
        v1 = in.nextFloat();
        v2 = in.nextFloat();

        resultado = calculaOperacao(v1, v2, caracter);

        System.out.println(resultado);
    }
}
