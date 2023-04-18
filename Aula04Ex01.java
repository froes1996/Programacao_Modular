import java.util.Scanner;
public class Aula04Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int valor = 0;
        int [] [] m = {
            {15,10,5, 2},
            {3, 11, 1, 21},
            {1, 2, 3, 20},
            {1, 2, 3, 4}
        };
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                if(m[i][j] > 10){
                    valor++;
                }
            }
        }
        System.out.println(valor +" Valores são maiores que 10");
    }
}
