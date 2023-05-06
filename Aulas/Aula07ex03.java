package Aulas;
import java.util.Scanner;
public class Aula07ex03 {
    public static float calculaOperacao(float v1, float v2, char simbolo){
        float resultado = 0f;
        if(simbolo != '+' && simbolo != '-' && simbolo != '*' && simbolo != '/'){
            System.out.println("Simbolo Inválido");
            return -1;
        }
        if(simbolo == '+'){
            resultado = v1+ v2;
        }else if(simbolo == '-'){
            resultado = v1-v2;
        }else if(simbolo == '*'){
            resultado = v1 * v2;
        }else{
            resultado = v1 / v2;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um simbolo");
        char simbolo = in.next().charAt(0);

        System.out.println("Informe dois valores");
        float v1 = in.nextFloat();
        float v2 = in.nextFloat();

        float result;
        result = calculaOperacao(v1,v2, simbolo);
        System.out.println(result);
    }
}
