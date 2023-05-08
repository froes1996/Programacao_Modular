package Sobrecarregados;
import java.util.Scanner;
/*
 Escreve três métodos sobrecarregados chamados area que aceitam
diferentes tipos de parâmetros (int, float e double).
• O primeiro método calcula a área de um quadrado.
• O segundo método calcula a área de um triangulo.
• O terceiro método calcula a área de um círculo.
• O programa principal deve fazer chamadas de método para os 3
métodos criados e mostrar na tela os resultados.
• Exemplo
• Se lado = 5, base = 3.2, altura = 4.7, raio = 2.5, então a área do quadrado será
25, a área do triângulo = 7.52 e a área do círculo = 19.634954084936208
 */
public class Ex04 {
    public static int area(int lado){
        int quadrado = lado * lado;
        
        return quadrado;
    }
    public static float area(float base, float altura){
        float resultado = (base * altura) / 2; 
        return resultado;
    }
    public static double area(double r){
        double resultado = Math.PI * Math.pow(r, 2);
        return resultado;
    }
    public static void main(String[] args) {
        int quadrado = 5;
        float base = 3.2f;
        float altura = 4.7f;
        double raio = 2.5;
        System.out.println(area(quadrado));
        System.out.println(area(base, altura));
        System.out.println(area(raio));
    }
}
