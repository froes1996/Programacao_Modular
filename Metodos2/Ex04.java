package Metodos2;
/*Escreve um método palindromasMutuas que receba por parâmetros
duas palavras s1 e s2 e retorne true se as Strings são palíndromas
mútuas, ou seja, se uma é igual à outra quando lida de traz para
frente, e false, caso contrário.
• O programa principal deve ler as duas palavras via teclado, chamar o
método criado e imprimir na tela se palavras são palíndromas mútuas
ou não.
• Exemplo: Se a primeira string for “amor” e a segunda string for
“roma”, então a saída do programa deve ser “São palíndromas
mutuas”. */
public class Ex04 {
    public static String palindromasMutuas(String s1, String s2){
        String resultado = "";
        for(int i = s1.length() -1 ; i >= 0; i--){
            char guarda = s1.charAt(i);
            resultado = resultado + (char)guarda;
        }
            if(s2.compareTo(resultado) == 0){
                System.out.println("São iguais");
            }else{
                System.out.println("São diferentes");
            }
        return resultado;
    }
    public static void main(String[] args) {
        String s1 = "roma";
        String s2 = "ayor";

        System.out.println(palindromasMutuas(s1, s2));
    }
}
