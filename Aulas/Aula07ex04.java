package Aulas;
import java.util.Scanner;
public class Aula07ex04 {
    public static void squadOfAsterisks(int squad){
        for(int i = 0; i < squad; i++){
            for(int j = 0; j < squad; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o lado");
        int lado = in.nextInt();

        squadOfAsterisks(lado);
    }
}
