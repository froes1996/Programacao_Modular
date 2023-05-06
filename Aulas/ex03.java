package Aulas;
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v [] = {0,1,10,2,3,4,5,7,8,9};
        int aux [] = new int[9];
        int m = 0;
        
        for(int i = 0; i < v.length; i++){
            for(int j = i+1; j < v.length; j++){
                if(v[i] == v[j]){
                    boolean repetido = false;
                    for(int k = 0; k < 9; k++){
                        if(aux [k] == v[j]){
                            repetido = true;
                            break;
                        }
                    }
                    if(!repetido){
                        aux[m] = v[j];
                        m++;
                    }
                 }
            }           
         }
         for(int i = 0; i < m; i++){
            System.out.println(aux[i]);
         }
    }
}
