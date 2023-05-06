package Aulas;
import java.util.Scanner;

public class aula05ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Digite uma frase");
        String palavra = in.nextLine();

       String []palavras = palavra.split("\\s+");

        for(int i = palavras. length-1; i >= 0; i--){
            System.out.println(palavras[i]);
        }

        
    }   
}
