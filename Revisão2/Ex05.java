package Revisão2;
/*
 Escreva um método int calculaSoma que receba por parâmetro uma string
contendo uma sequência de números inteiros separados por vírgula e retorne a
soma dos números. Se a String estiver vazia, o método deve lançar uma exceção
do tipo StringVaziaException. Se ocorrer uma exceção ao converter um número
da String para inteiro, o programa deve lançar uma exceção do tipo
NumberFormatException.
• int calculaSoma(String sequencia) throws StringVaziaException, NumberFormatException
• O método main deve ler via teclado uma String contendo uma sequência de
números inteiros, chamar o método criado e imprimir a soma dos números
inteiros.
• Caso ocorra algum erro, o método main deve tratar as exceções lançadas com as
seguintes mensagens de erro: “Erro: A sequência não pode estar vazia” ou "Erro:
Digite uma sequência válida de números inteiros“.
 */
import java.util.Scanner;
public class Ex05 {
    public static int calculaSoma(String s1)throws StringVaziaException, NumberFormatException {
        int soma = 0;
        if(s1.equals("")){
            throw new StringVaziaException();
        }if(! s1.matches("[^,0-9]")){
            throw new NumberFormatException();
        }
       else{
            String token[] = s1.split(",");

            for(int i = 0; i < token.length; i++){
                soma = soma + Integer.parseInt(token[i]);
            }
        }
        return soma;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = "";
        int resultado = 0;
        while(true){
        try {
            System.out.println("Informe uma sequencia de numeros separados por virgula");
            s1 = in.nextLine();
            resultado = calculaSoma(s1);
            System.out.println(resultado);
            break;
        } catch (StringVaziaException e) {
            System.out.println("A sequencia não pode estar vazia");
            break;
        }catch(NumberFormatException e){
            System.out.println("Digite uma sequencia valida de numeros");
          
        }
    }
}
}
class StringVaziaException extends Exception{

}
class NumberFormatException extends Exception{

}
