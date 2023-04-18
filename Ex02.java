import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        int t = 10;
        int v [] = new int[t];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < v.length; i++){
            System.out.println("Digite o valor"+i);
            v[i] = in.nextInt();
        }

        int guardavalor = 0;
        int ultimo = 9;

        for(int i = 0; i < 5; i++){
            guardavalor = v[i];
            v[i] = v[ultimo];
            v[ultimo] = v[guardavalor];
            ultimo--;
        }
        for(int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }

    }
}
