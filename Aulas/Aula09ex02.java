package Aulas;
import java.util.Scanner;

public class Aula09ex02 {
    public static int contar(String cont) {
        int resultado = cont.length();
        return resultado;
    }

    public static int contar(char[] v) {
        int resultado = v.length;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um nome");
        String nome = in.next();
        char v[] = new char[5];
        for (int i = 0; i < v.length; i++) {
            System.out.println("Informe o caracter: " + i);
            v[i] = in.next().charAt(0);
        }
        System.out.println(contar(nome));
        System.out.println(contar(v));
    }
}
