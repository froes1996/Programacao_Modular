/*
 Escreve um método somaElementosVetor que receba por parâmetros um
vetor contendo N valores inteiros e retorne a soma dos elementos
• Escreve um método multiplicaElementosVetor que receba por parâmetros
um vetor contendo N valores inteiros e retorne a multiplicação dos
elementos
• Escreva um método calculaMaior que receba por parâmetros um vetor
contendo N valores inteiros e retorne o maior elemento
• Escreve um método numeroRepeticaoMaior que receba por parâmetros
um vetor contendo N valores inteiros e retorne o número de vezes que o
maior elemento ocorreu no vetor. Dentro deste método, faça chamada ao
método calculaMaior
• O programa principal deve solicitar ao usuário o tamanho N do vetor, ler
via teclado os elementos do vetor, chamar os 4 métodos criados e mostrar
na tela os resultados
 */
package Metodos2;
import java.util.Scanner;
public class Ex01 {
    public static int somaElementosVetor(int [] v1){
        int soma = 0;

        for(int i = 0; i < v1.length; i++){
            soma = soma + v1[i];
        }
        return soma;
    }
    public static int multiplicaElementosVetor(int [] v1){
        int multiplica = 1;

        for(int i = 0; i < v1.length; i++){
            multiplica = multiplica * v1[i];
        }
        return multiplica;
    }
    public static int calculaMaior(int [] v1){
         int maior = 0;

         for(int i = 0; i < v1.length; i++){
            if(maior < v1[i]){
                maior = v1[i];
            }
         }
         return maior;
    }
    public static int numeroRepeticaoMaior(int [] v1){
        int cont = 0;

        for(int i = 0; i < v1.length; i++){
            if(v1[i] == calculaMaior(v1)){
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] v = {14, 15, 25, 25, 5, 8, 9, 7, 6};

        System.out.println(somaElementosVetor(v));
        System.out.println(multiplicaElementosVetor(v));
        System.out.println(calculaMaior(v));
        System.out.println(numeroRepeticaoMaior(v));
    }
}
