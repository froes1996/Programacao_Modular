package MetodosRecursivos;
/*
 • Escreva um método recursivo que encontre e retorne o maior
elemento de um vetor de n inteiros.
• int encontraMaior(int v[], int tam)
• O método main deve ler via teclado o valor de n, preencher os
elementos por leitura do teclado, chamar o método criado e imprimir
na tela o maior elemento.
 */
public class Ex06 {
    public static int encontraMaior(int[]v, int tam){
        if(tam == 1){
            return v[0];
        }else{
            int maior = encontraMaior(v, tam - 1);
            if(v[tam-1] > maior){
                maior = v[tam-1];
            }
            return maior;
        }
    }
    public static void main(String[] args) {
        int[] v = {1,2,3,4,55,6,27,8,34,2};
        System.out.println(encontraMaior(v, v.length));
    }
}
