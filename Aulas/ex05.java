package Aulas;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = 10;
        int v [] = new int[t];

        for(int i = 0; i < t; i++){
            System.out.println("Valor" + i);
            v[i] = in.nextInt();
            for(int j = 0; j < t; j++){
                for(int k = j+1; j < t; j++){
                if(v[j] == v[k]){
                    System.out.println("digite um novo valor");
                    v[i] = in.nextInt();
                }
            }
        }
        }
        for(int i = 0; i < t; i++){
            System.out.println(v[i]);
        }
        
    }
}
