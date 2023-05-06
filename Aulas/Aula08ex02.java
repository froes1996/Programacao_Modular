package Aulas;
import java.util.Scanner;
public class Aula08ex02 {
    public static int modificaVetor(int [] v){
        int por2 = 1;
        int por3 = 1;
        
        for(int i = 0; i < v.length; i++){
            if(v[i] %2 == 0){
                
            }else{
               
            }

        }
        return por2;
    }
    public static void printVetor(String[] vb){
        
    }
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        
        System.out.println("Informe o tamanho do vetor");
        int t = in.nextInt();
        int [] array = new int[t];

        for(int i = 0; i < array.length; i++){
            System.out.println("Informe o valor: " + i);
            array[i] = in.nextInt();
        }

        int resultado = modificaVetor(array);
        System.out.println(resultado);
    }
}
