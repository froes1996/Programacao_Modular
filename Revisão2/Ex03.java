package Revisão2;
/*
 Escreva um método recursivo isPalindromo que verifica se duas palavras s1 e s2
são palíndromas mútuas, ou seja, se uma é igual à outra quando lida de traz
para frente. Inicio e fim são índices.
• boolean isPalindromo(String s1, String s2, int inicio, int
fim)
• Escreve um método sobrecarregado NÃO recursivo isPalindromo que verifica se
as palavras tem o mesmo tamanho, chama o método recursivo e retorna true
ou false caso as palavras sejam palíndromas.
• boolean isPalindromo(String s1, String s2)
• O método main deve ler as duas palavras via teclado, chamar o 2º método
sobrecarregado e imprimir na tela se palavras são palíndromas mútuas ou não.
• Exemplo: Se a primeira string for “amor” e a segunda string for “roma”, então a
saída do programa deve ser “São palíndromas mutuas”.
 */
import java.util.Scanner;
public class Ex03 {
    public static boolean isPalindromo(String s1, String s2, int inicio, int fim){
        if(inicio == s1.length() -1){
            return true;
        }
        if(s1.charAt(inicio) == s2.charAt(fim)){
            return isPalindromo(s1, s2, inicio + 1, fim - 1);
        }else{
            return false;
        }
    }
    public static boolean isPalindromo(String s1, String s2){
        boolean palindromo = false;
        if(s1.length() == s2.length()){
            palindromo = isPalindromo(s1, s2, 0, s1.length()-1);
        }
        return palindromo;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a primeira palavra");
        String s1 = in.next();

        System.out.println("Informe a segunda palavra");
        String s2 = in.next();

        System.out.println(isPalindromo(s1, s2));
    }
}
