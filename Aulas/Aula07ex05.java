package Aulas;
import java.util.Scanner;


public class Aula07ex05{
    public static int quociente(int a, int b){
        int quociente;
        quociente = a/b;
        return quociente;
    }

    public static int resto(int a, int b){
        return a%b;
    }

    public static void displayDigits(int n){
        
        String resposta = "";
        while(n > 0){
            
            int resto = resto(n, 10);
    
            n = quociente(n, 10);

            resposta = resto + " " + resposta;
        }
        System.out.println(resposta);


    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int numeroUsuario;
        do {
            System.out.println("Digite um número entre 1 e 9999");
            numeroUsuario = in.nextInt();
        }while(numeroUsuario < 1 || numeroUsuario > 99999);

        displayDigits(numeroUsuario);
    }
}