import java.util.Scanner;
public class Alula10ex04 {
    public static void transforma(int [] [] mt){
        int [] [] m = new int[mt.length] [mt.length];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                if(j > i){
                m[i][j] = mt[j][i];
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o tamanho da matriz");
        int t = in.nextInt();

        int [] [] m1 = new int[t] [t];

        System.out.println("Preencha a matriz");
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1.length; j++){

                m1 [i] [j] = in.nextInt();
            }
        }
        transforma(m1);
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1.length; j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
