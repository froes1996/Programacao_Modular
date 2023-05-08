package Sobrecarregados;
/*
 Escreva dois métodos sobrecarregados chamados soma.
• O primeiro método deve aceitar um parâmetro do tipo array de
inteiros e retornar a soma dos elementos do array.
• O segundo método deve aceitar dois parâmetros do tipo array de
inteiros e retornar um novo array que seja a soma dos elementos
correspondentes de cada um dos arrays. Considere que os arrays têm
tamanhos iguais.
• O programa principal deve fazer chamadas de método para os 2
métodos criados e mostrar na tela os resultados.
 */
public class Ex05 {
    public static int soma(int [] v1){
        int resultado = 0;
        for(int i = 0; i < v1.length; i++){
            resultado = resultado + v1[i];
        }
        return resultado;
    }
    public static int[] soma(int [] v1, int [] v2){
        int [] resultado = new int [v1.length];
            for(int i = 0; i < v1.length; i++){
                resultado[i] = v1[i] + v2[i];
            }
        return resultado;
    }
    public static void main(String[] args) {
        int [] v1 = {1,2,3,4,5,6,7,8,9};
        int [] v2 = {1,2,3,4,5,6,7,8,9};

        System.out.println(soma(v1));
        int [] v3 = soma(v1, v2);

        for(int i = 0; i < v3.length; i++){
            System.out.print(v3[i]+ " ");
        }
    }
}
