package Aulas;
import java.util.Scanner;

public class Aula10ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String frase;

        System.out.println("Informe uma frase");
        frase = in.nextLine();

        System.out.println("Informe o numero de posições");
        int n = in.nextInt();
        String resposta = "";

        for(int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            int c2 = c;

            if(c >= 65 && c <=90){
                c2 = c2 + n;
                if(c2 > 90){
                    c2 = c2 - 26;
                }
            }
            if(c >= 97 && c <= 122){
                c2 = c2 + n;
                if(c2 > 122){
                    c2 = c2 - 26;
                }
            }
            resposta = resposta + (char)c2;
        }
        System.out.println(resposta);
    }
}
