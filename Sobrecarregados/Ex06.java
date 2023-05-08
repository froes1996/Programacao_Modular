package Sobrecarregados;
/*
 Escreva dois métodos sobrecarregados chamados concatenar.
• O primeiro deve aceitar um parâmetro do tipo array de caracteres e
retornar uma string que seja a concatenação de todos os caracteres
do array.
• O segundo método deve aceitar dois parâmetros do tipo array de
caracteres e retornar um novo array que seja a concatenação de
todos os caracteres dos dois arrays.
• O programa principal deve fazer chamadas de método para os 2
métodos criados e mostrar na tela os resultados.
 */
public class Ex06 {
    public static String concatenar(char [] array){
        String resultado = "";

        for(int i = 0; i < array.length; i++){
            resultado = resultado + (char)array[i];
        }
        return resultado;
    }

    public static String concatenar(char [] array1, char [] array2){
        String resultado = "";

        for(int i = 0; i < array1.length; i++){
            resultado = resultado + array1[i];
            resultado = resultado + array2[i];
        }
        return resultado;
    }
    public static void main(String[] args) {
        char [] array = {'a', 'b', 'c', 'd', 'e'};
        char [] arra1 = {'a', 'b', 'c', 'd', 'e'};
        
        String met1 = concatenar(array);
        System.out.println(met1);
        String met2 = concatenar(array, arra1);
        System.out.println(met2);
        
    }
}
