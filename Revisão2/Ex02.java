package Revisão2;
import java.util.Scanner;
public class Ex02 {
    public static int power(int base, int expoente){
        if(expoente == 1){
            return base;
        }else{
            return power(base,expoente - 1) * base;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a base");
        int base = in.nextInt();

        System.out.println("Informe o expoente");
        int expoente = in.nextInt();

        System.out.println(power(base, expoente));
    }
}
