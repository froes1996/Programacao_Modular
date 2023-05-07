/*
 • Escreve um método void modificaVetor que receba por parâmetros
um vetor contendo N valores inteiros e modifica da seguinte forma
• Os elementos de índices pares serão multiplicados por 2
• Os elementos de índices ímpares serão multiplicados por 3
• Escreva um método void printVetor para imprimir o vetor na tela
• O programa principal deve solicitar ao usuário o tamanho N do vetor,
ler via teclado os elementos do vetor, chamar os métodos printVetor,
modificaVetor e printVetor, nesta ordem.
 */

package Metodos2;
import java.util. Scanner;
public class ex02 {
    public static void modificaVetor(int [] v){
        int resultado = 1;
        for(int i = 0; i < v.length; i++){
            if(i % 2 == 0){
                 v [i] = v[i] * 2;
            }else{
                v[i] = v[i] * 3;
            }
        }
        printVetor(v);
    }
    public static void printVetor(int []v){
        for(int i = 0; i < v.length;i++){
        System.out.println("Posição " + i + " = " + v[i]);
        }
    }

    public static void main(String[] args) {
        
        int [] v = {1,2,3,4,5,6,7,8,9,10};

        modificaVetor(v);
        
    }
}
